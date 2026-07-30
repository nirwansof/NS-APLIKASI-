package com.example

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CloudSync
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.OfflinePin
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import com.example.ui.screens.DashboardScreen
import com.example.ui.screens.DoaSearchScreen
import com.example.ui.screens.DzikirCounterScreen
import com.example.ui.screens.FavoritesScreen
import com.example.ui.screens.OfflineMenuScreen
import com.example.ui.screens.PrayerDetailScreen
import com.example.ui.screens.SyncScreen
import com.example.ui.theme.NSPrayTheme
import com.example.ui.viewmodel.PrayerViewModel

enum class MainTab(val title: String, val icon: ImageVector) {
    DASHBOARD("Dashboard", Icons.Default.Home),
    SEARCH("Pencarian", Icons.Default.Search),
    OFFLINE("Offline NS", Icons.Default.OfflinePin),
    FAVORITES("Favorit", Icons.Default.Favorite),
    SYNC("Sync", Icons.Default.CloudSync)
}

class MainActivity : ComponentActivity() {

    private val viewModel: PrayerViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            val isDarkMode by viewModel.isDarkMode.collectAsState()
            val viewMode by viewModel.viewMode.collectAsState()
            val arabicFontSize by viewModel.arabicFontSize.collectAsState()
            val searchQuery by viewModel.searchQuery.collectAsState()
            val selectedMainCategory by viewModel.selectedMainCategory.collectAsState()
            val selectedSubCategory by viewModel.selectedSubCategory.collectAsState()
            val filteredPrayers by viewModel.filteredPrayers.collectAsState()
            val selectedPrayerId by viewModel.selectedPrayerId.collectAsState()
            val lastSyncTime by viewModel.lastSyncTime.collectAsState()
            val isSyncing by viewModel.isSyncing.collectAsState()
            val syncLogs by viewModel.syncLogs.collectAsState()
            val tasbihCount by viewModel.tasbihCount.collectAsState()
            val tasbihTarget by viewModel.tasbihTarget.collectAsState()

            var currentTab by remember { mutableStateOf(MainTab.DASHBOARD) }
            var showTasbihCounter by remember { mutableStateOf(false) }

            NSPrayTheme(darkTheme = isDarkMode) {
                val selectedItem = selectedPrayerId?.let { id -> viewModel.repository.getItemById(id) }

                when {
                    showTasbihCounter -> {
                        DzikirCounterScreen(
                            count = tasbihCount,
                            target = tasbihTarget,
                            onIncrement = { viewModel.incrementTasbih() },
                            onReset = { target -> viewModel.resetTasbih(target) },
                            onBackClick = { showTasbihCounter = false }
                        )
                    }

                    selectedItem != null -> {
                        PrayerDetailScreen(
                            item = selectedItem,
                            viewMode = viewMode,
                            onViewModeToggle = {
                                viewModel.setViewMode(
                                    if (viewMode == com.example.data.ViewMode.PER_AYAT)
                                        com.example.data.ViewMode.PARAGRAF
                                    else
                                        com.example.data.ViewMode.PER_AYAT
                                )
                            },
                            arabicFontSize = arabicFontSize,
                            onFontSizeChange = { viewModel.setArabicFontSize(it) },
                            onFavoriteToggle = { viewModel.toggleFavorite(selectedItem.id) },
                            onBackClick = { viewModel.selectPrayer(null) },
                            onOpenTasbih = {
                                viewModel.resetTasbih(if (selectedItem.targetCount > 1) selectedItem.targetCount else 33)
                                showTasbihCounter = true
                            }
                        )
                    }

                    else -> {
                        Scaffold(
                            bottomBar = {
                                NavigationBar(
                                    containerColor = MaterialTheme.colorScheme.surface,
                                    modifier = Modifier.testTag("bottom_nav_bar")
                                ) {
                                    MainTab.values().forEach { tab ->
                                        NavigationBarItem(
                                            selected = currentTab == tab,
                                            onClick = { currentTab = tab },
                                            icon = {
                                                Icon(
                                                    imageVector = tab.icon,
                                                    contentDescription = tab.title
                                                )
                                            },
                                            label = {
                                                Text(
                                                    text = tab.title,
                                                    fontWeight = if (currentTab == tab) FontWeight.Bold else FontWeight.Medium
                                                )
                                            },
                                            colors = NavigationBarItemDefaults.colors(
                                                selectedIconColor = MaterialTheme.colorScheme.onPrimary,
                                                indicatorColor = MaterialTheme.colorScheme.primary,
                                                unselectedIconColor = MaterialTheme.colorScheme.onSurfaceVariant
                                            ),
                                            modifier = Modifier.testTag("nav_tab_${tab.name.lowercase()}")
                                        )
                                    }
                                }
                            },
                            modifier = Modifier.fillMaxSize()
                        ) { innerPadding ->
                            Box(modifier = Modifier.padding(innerPadding)) {
                                when (currentTab) {
                                    MainTab.DASHBOARD -> DashboardScreen(
                                        isDarkMode = isDarkMode,
                                        onDarkModeToggle = { viewModel.toggleDarkMode(it) },
                                        viewMode = viewMode,
                                        onViewModeChange = { viewModel.setViewMode(it) },
                                        arabicFontSize = arabicFontSize,
                                        onFontSizeChange = { viewModel.setArabicFontSize(it) },
                                        featuredItems = filteredPrayers,
                                        onFavoriteToggle = { viewModel.toggleFavorite(it) },
                                        onNavigateToSearch = { currentTab = MainTab.SEARCH },
                                        onNavigateToFavorites = { currentTab = MainTab.FAVORITES },
                                        onNavigateToOffline = { currentTab = MainTab.OFFLINE },
                                        onNavigateToSync = { currentTab = MainTab.SYNC },
                                        onItemClick = { viewModel.selectPrayer(it) }
                                    )

                                    MainTab.SEARCH -> DoaSearchScreen(
                                        searchQuery = searchQuery,
                                        onSearchQueryChange = { viewModel.setSearchQuery(it) },
                                        selectedMainCategory = selectedMainCategory,
                                        onMainCategorySelect = { viewModel.setMainCategory(it) },
                                        selectedSubCategory = selectedSubCategory,
                                        onSubCategorySelect = { viewModel.setSubCategory(it) },
                                        prayers = filteredPrayers,
                                        arabicFontSize = arabicFontSize,
                                        onFavoriteToggle = { viewModel.toggleFavorite(it) },
                                        onResetFilters = { viewModel.resetFilters() },
                                        onItemClick = { viewModel.selectPrayer(it) }
                                    )

                                    MainTab.OFFLINE -> OfflineMenuScreen(
                                        onSelectMenuCategory = { category ->
                                            viewModel.setMainCategory(category)
                                            currentTab = MainTab.SEARCH
                                        },
                                        onOpenTasbihCounter = {
                                            viewModel.resetTasbih(33)
                                            showTasbihCounter = true
                                        }
                                    )

                                    MainTab.FAVORITES -> FavoritesScreen(
                                        favoritePrayers = filteredPrayers,
                                        arabicFontSize = arabicFontSize,
                                        onFavoriteToggle = { viewModel.toggleFavorite(it) },
                                        onItemClick = { viewModel.selectPrayer(it) }
                                    )

                                    MainTab.SYNC -> SyncScreen(
                                        lastSyncTime = lastSyncTime,
                                        isSyncing = isSyncing,
                                        syncLogs = syncLogs,
                                        onStartSync = { viewModel.startSyncSimulation() },
                                        formatSyncDate = { viewModel.formatSyncDate(it) }
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
