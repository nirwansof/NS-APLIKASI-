package com.example.data

import android.content.Context
import android.content.SharedPreferences
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class PrayerRepository(context: Context) {

    private val prefs: SharedPreferences = context.getSharedPreferences("ns_pray_prefs", Context.MODE_PRIVATE)

    private val _isDarkMode = MutableStateFlow(prefs.getBoolean(KEY_DARK_MODE, false))
    val isDarkMode: StateFlow<Boolean> = _isDarkMode.asStateFlow()

    private val _viewMode = MutableStateFlow(
        ViewMode.valueOf(prefs.getString(KEY_VIEW_MODE, ViewMode.PER_AYAT.name) ?: ViewMode.PER_AYAT.name)
    )
    val viewMode: StateFlow<ViewMode> = _viewMode.asStateFlow()

    private val _arabicFontSize = MutableStateFlow(prefs.getFloat(KEY_FONT_SIZE, 26f))
    val arabicFontSize: StateFlow<Float> = _arabicFontSize.asStateFlow()

    private val _favoriteIds = MutableStateFlow(prefs.getStringSet(KEY_FAVORITES, emptySet()) ?: emptySet())
    val favoriteIds: StateFlow<Set<String>> = _favoriteIds.asStateFlow()

    private val _lastSyncTime = MutableStateFlow(prefs.getLong(KEY_LAST_SYNC, System.currentTimeMillis()))
    val lastSyncTime: StateFlow<Long> = _lastSyncTime.asStateFlow()

    private val baseItems = PrayerDefaults.getAllItems()

    fun toggleDarkMode(enabled: Boolean) {
        prefs.edit().putBoolean(KEY_DARK_MODE, enabled).apply()
        _isDarkMode.value = enabled
    }

    fun setViewMode(mode: ViewMode) {
        prefs.edit().putString(KEY_VIEW_MODE, mode.name).apply()
        _viewMode.value = mode
    }

    fun setArabicFontSize(sizeSp: Float) {
        val clamped = sizeSp.coerceIn(20f, 40f)
        prefs.edit().putFloat(KEY_FONT_SIZE, clamped).apply()
        _arabicFontSize.value = clamped
    }

    fun toggleFavorite(itemId: String) {
        val current = _favoriteIds.value.toMutableSet()
        if (current.contains(itemId)) {
            current.remove(itemId)
        } else {
            current.add(itemId)
        }
        prefs.edit().putStringSet(KEY_FAVORITES, current).apply()
        _favoriteIds.value = current
    }

    fun isFavorite(itemId: String): Boolean {
        return _favoriteIds.value.contains(itemId)
    }

    fun updateSyncTimestamp() {
        val now = System.currentTimeMillis()
        prefs.edit().putLong(KEY_LAST_SYNC, now).apply()
        _lastSyncTime.value = now
    }

    fun getItems(
        query: String = "",
        mainCategory: String = "Semua",
        subCategory: String = "Semua"
    ): List<PrayerItem> {
        val favs = _favoriteIds.value

        return baseItems.map { item ->
            item.copy(isFavorite = favs.contains(item.id))
        }.filter { item ->
            // Category filter
            val matchesMainCat = when (mainCategory) {
                "Semua" -> true
                "Favorit Saya" -> item.isFavorite
                else -> item.mainCategory.equals(mainCategory, ignoreCase = true)
            }

            // Sub category filter
            val matchesSubCat = when (subCategory) {
                "Semua" -> true
                else -> item.subCategory.equals(subCategory, ignoreCase = true)
            }

            // Search query filter
            val q = query.trim().lowercase()
            val matchesQuery = if (q.isEmpty()) {
                true
            } else {
                item.title.lowercase().contains(q) ||
                        item.description.lowercase().contains(q) ||
                        item.verses.any { v ->
                            v.latin.lowercase().contains(q) ||
                                    v.translation.lowercase().contains(q) ||
                                    v.arabic.contains(q)
                        }
            }

            matchesMainCat && matchesSubCat && matchesQuery
        }
    }

    fun getItemById(id: String): PrayerItem? {
        val favs = _favoriteIds.value
        val found = baseItems.find { it.id == id } ?: return null
        return found.copy(isFavorite = favs.contains(found.id))
    }

    companion object {
        private const val KEY_DARK_MODE = "key_dark_mode"
        private const val KEY_VIEW_MODE = "key_view_mode"
        private const val KEY_FONT_SIZE = "key_font_size"
        private const val KEY_FAVORITES = "key_favorites"
        private const val KEY_LAST_SYNC = "key_last_sync"
    }
}
