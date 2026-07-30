package com.example.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AutoAwesome
import androidx.compose.material.icons.filled.CompassCalibration
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.MenuBook
import androidx.compose.material.icons.filled.OfflinePin
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.R
import com.example.data.PrayerItem
import com.example.data.ViewMode
import com.example.ui.components.HeaderSettingsCard
import com.example.ui.components.PrayerItemCard

@Composable
fun DashboardScreen(
    isDarkMode: Boolean,
    onDarkModeToggle: (Boolean) -> Unit,
    viewMode: ViewMode,
    onViewModeChange: (ViewMode) -> Unit,
    arabicFontSize: Float,
    onFontSizeChange: (Float) -> Unit,
    featuredItems: List<PrayerItem>,
    onFavoriteToggle: (String) -> Unit,
    onNavigateToSearch: () -> Unit,
    onNavigateToFavorites: () -> Unit,
    onNavigateToOffline: () -> Unit,
    onNavigateToSync: () -> Unit,
    onItemClick: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .testTag("dashboard_screen"),
        contentPadding = androidx.compose.foundation.layout.PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        // 1. Header App Title
        item {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column {
                    Text(
                        text = "NS PRAY APP",
                        style = MaterialTheme.typography.headlineMedium,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.primary
                    )
                    Text(
                        text = "Aplikasi Agama Islam & Panduan Shalat Lengkap",
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }

                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(12.dp))
                        .background(MaterialTheme.colorScheme.primaryContainer)
                        .padding(horizontal = 10.dp, vertical = 6.dp)
                ) {
                    Text(
                        text = "OFFLINE",
                        style = MaterialTheme.typography.labelSmall,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.onPrimaryContainer
                    )
                }
            }
        }

        // 2. Header Settings Card (Dark Mode, View Mode, Font Slider, Arabic Preview)
        item {
            HeaderSettingsCard(
                isDarkMode = isDarkMode,
                onDarkModeToggle = onDarkModeToggle,
                viewMode = viewMode,
                onViewModeChange = onViewModeChange,
                arabicFontSize = arabicFontSize,
                onFontSizeChange = onFontSizeChange
            )
        }

        // 3. Hero Image Banner with Motivation Text
        item {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(180.dp)
                    .clip(RoundedCornerShape(20.dp))
                    .testTag("hero_banner_card"),
                shape = RoundedCornerShape(20.dp),
                elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
            ) {
                Box(modifier = Modifier.fillMaxSize()) {
                    Image(
                        painter = painterResource(id = R.drawable.img_hero_banner_1785441881726),
                        contentDescription = "Spiritual Mosque Banner",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )

                    // Gradient Overlay for readability
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(
                                Brush.verticalGradient(
                                    colors = listOf(
                                        Color.Transparent,
                                        Color.Black.copy(alpha = 0.85f)
                                    )
                                )
                            )
                    )

                    Column(
                        modifier = Modifier
                            .align(Alignment.BottomStart)
                            .padding(16.dp)
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(
                                imageVector = Icons.Default.AutoAwesome,
                                contentDescription = null,
                                tint = MaterialTheme.colorScheme.secondary,
                                modifier = Modifier.size(18.dp)
                            )
                            Spacer(modifier = Modifier.width(6.dp))
                            Text(
                                text = "MOTIVASI SPIRITUAL HARIAN",
                                style = MaterialTheme.typography.labelSmall,
                                fontWeight = FontWeight.Bold,
                                color = MaterialTheme.colorScheme.secondary
                            )
                        }

                        Spacer(modifier = Modifier.height(4.dp))

                        Text(
                            text = "\"Sesungguhnya shalat itu mencegah dari perbuatan keji dan mungkar.\"",
                            style = MaterialTheme.typography.bodyMedium,
                            fontWeight = FontWeight.Bold,
                            color = Color.White,
                            fontStyle = FontStyle.Italic
                        )

                        Text(
                            text = "QS. Al-'Ankabut: 45",
                            style = MaterialTheme.typography.labelSmall,
                            color = Color.White.copy(alpha = 0.8f)
                        )
                    }
                }
            }
        }

        // 4. Quick Navigation Grid
        item {
            Column {
                Text(
                    text = "NAVIGASI CEPAT",
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onSurface
                )

                Spacer(modifier = Modifier.height(10.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    QuickNavCard(
                        title = "Pencarian Doa",
                        subtitle = "Cari Realtime",
                        icon = Icons.Default.Search,
                        badgeColor = MaterialTheme.colorScheme.primaryContainer,
                        iconColor = MaterialTheme.colorScheme.primary,
                        onClick = onNavigateToSearch,
                        modifier = Modifier.weight(1f)
                    )

                    QuickNavCard(
                        title = "Doa Favorit",
                        subtitle = "Penyimpanan",
                        icon = Icons.Default.Favorite,
                        badgeColor = Color(0xFFFFEBEE),
                        iconColor = Color(0xFFE53935),
                        onClick = onNavigateToFavorites,
                        modifier = Modifier.weight(1f)
                    )
                }

                Spacer(modifier = Modifier.height(10.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    QuickNavCard(
                        title = "Menu Offline",
                        subtitle = "Shalat & Dzikir",
                        icon = Icons.Default.OfflinePin,
                        badgeColor = MaterialTheme.colorScheme.secondaryContainer,
                        iconColor = MaterialTheme.colorScheme.secondary,
                        onClick = onNavigateToOffline,
                        modifier = Modifier.weight(1f)
                    )

                    QuickNavCard(
                        title = "Sinkronisasi",
                        subtitle = "Pembaruan",
                        icon = Icons.Default.Refresh,
                        badgeColor = MaterialTheme.colorScheme.surfaceVariant,
                        iconColor = MaterialTheme.colorScheme.primary,
                        onClick = onNavigateToSync,
                        modifier = Modifier.weight(1f)
                    )
                }
            }
        }

        // 5. Featured / Recommended Daily Section
        item {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "REKOMENDASI BACAAN HARIAN",
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onSurface
                )

                Text(
                    text = "Lihat Semua",
                    style = MaterialTheme.typography.labelLarge,
                    color = MaterialTheme.colorScheme.primary,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.clickable { onNavigateToSearch() }
                )
            }
        }

        items(featuredItems.take(5), key = { it.id }) { item ->
            PrayerItemCard(
                item = item,
                arabicFontSize = arabicFontSize,
                onFavoriteToggle = { onFavoriteToggle(item.id) },
                onClick = { onItemClick(item.id) }
            )
        }
    }
}

@Composable
fun QuickNavCard(
    title: String,
    subtitle: String,
    icon: ImageVector,
    badgeColor: Color,
    iconColor: Color,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .clip(RoundedCornerShape(16.dp))
            .clickable { onClick() },
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surface
        ),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Row(
            modifier = Modifier.padding(14.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(42.dp)
                    .clip(CircleShape)
                    .background(badgeColor),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = icon,
                    contentDescription = title,
                    tint = iconColor,
                    modifier = Modifier.size(22.dp)
                )
            }

            Spacer(modifier = Modifier.width(10.dp))

            Column {
                Text(
                    text = title,
                    style = MaterialTheme.typography.titleSmall,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onSurface
                )
                Text(
                    text = subtitle,
                    style = MaterialTheme.typography.labelSmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
        }
    }
}
