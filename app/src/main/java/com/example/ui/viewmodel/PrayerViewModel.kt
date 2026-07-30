package com.example.ui.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.data.PrayerItem
import com.example.data.PrayerRepository
import com.example.data.ViewMode
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class PrayerViewModel(application: Application) : AndroidViewModel(application) {

    val repository = PrayerRepository(application.applicationContext)

    val isDarkMode: StateFlow<Boolean> = repository.isDarkMode
    val viewMode: StateFlow<ViewMode> = repository.viewMode
    val arabicFontSize: StateFlow<Float> = repository.arabicFontSize
    val lastSyncTime: StateFlow<Long> = repository.lastSyncTime
    val favoriteIds: StateFlow<Set<String>> = repository.favoriteIds

    private val _searchQuery = MutableStateFlow("")
    val searchQuery: StateFlow<String> = _searchQuery.asStateFlow()

    private val _selectedMainCategory = MutableStateFlow("Semua")
    val selectedMainCategory: StateFlow<String> = _selectedMainCategory.asStateFlow()

    private val _selectedSubCategory = MutableStateFlow("Semua")
    val selectedSubCategory: StateFlow<String> = _selectedSubCategory.asStateFlow()

    private val _selectedPrayerId = MutableStateFlow<String?>(null)
    val selectedPrayerId: StateFlow<String?> = _selectedPrayerId.asStateFlow()

    // Filtered prayer list derived reactively from state flows
    val filteredPrayers: StateFlow<List<PrayerItem>> = combine(
        _searchQuery,
        _selectedMainCategory,
        _selectedSubCategory,
        favoriteIds
    ) { query, mainCat, subCat, _ ->
        repository.getItems(query, mainCat, subCat)
    }.stateIn(
        viewModelScope,
        SharingStarted.WhileSubscribed(5000),
        repository.getItems()
    )

    // Sync screen state
    private val _isSyncing = MutableStateFlow(false)
    val isSyncing: StateFlow<Boolean> = _isSyncing.asStateFlow()

    private val _syncLogs = MutableStateFlow<List<String>>(
        listOf("Database lokal siap. Jalankan sinkronisasi untuk memperbarui data.")
    )
    val syncLogs: StateFlow<List<String>> = _syncLogs.asStateFlow()

    // Digital Tasbih counter state
    private val _tasbihCount = MutableStateFlow(0)
    val tasbihCount: StateFlow<Int> = _tasbihCount.asStateFlow()

    private val _tasbihTarget = MutableStateFlow(33)
    val tasbihTarget: StateFlow<Int> = _tasbihTarget.asStateFlow()

    fun toggleDarkMode(enabled: Boolean) {
        repository.toggleDarkMode(enabled)
    }

    fun setViewMode(mode: ViewMode) {
        repository.setViewMode(mode)
    }

    fun setArabicFontSize(sizeSp: Float) {
        repository.setArabicFontSize(sizeSp)
    }

    fun toggleFavorite(itemId: String) {
        repository.toggleFavorite(itemId)
    }

    fun setSearchQuery(query: String) {
        _searchQuery.value = query
    }

    fun setMainCategory(category: String) {
        _selectedMainCategory.value = category
    }

    fun setSubCategory(category: String) {
        _selectedSubCategory.value = category
    }

    fun resetFilters() {
        _searchQuery.value = ""
        _selectedMainCategory.value = "Semua"
        _selectedSubCategory.value = "Semua"
    }

    fun selectPrayer(id: String?) {
        _selectedPrayerId.value = id
    }

    fun incrementTasbih() {
        _tasbihCount.value = _tasbihCount.value + 1
    }

    fun resetTasbih(target: Int = 33) {
        _tasbihCount.value = 0
        _tasbihTarget.value = target
    }

    fun startSyncSimulation() {
        if (_isSyncing.value) return
        viewModelScope.launch {
            _isSyncing.value = true
            val logs = mutableListOf<String>()
            val sdf = SimpleDateFormat("HH:mm:ss", Locale.getDefault())

            fun addLog(msg: String) {
                logs.add("[${sdf.format(Date())}] $msg")
                _syncLogs.value = logs.toList()
            }

            addLog("Mulai pemeriksaan antrean sinkronisasi...")
            delay(800)
            addLog("Mengunduh 13 data Bacaan Shalat Subuh...")
            delay(800)
            addLog("Mengunduh 23 Doa Harian pilihan...")
            delay(800)
            addLog("Memperbarui 10 Amalan Dzikir Pagi & Sore...")
            delay(800)
            addLog("Mengunggah data Sunnah Sehari-hari & Qiyamul Lail...")
            delay(800)
            repository.updateSyncTimestamp()
            addLog("Pembaruan selesai! Seluruh data berhasil tersimpan di lokal.")
            _isSyncing.value = false
        }
    }

    fun formatSyncDate(millis: Long): String {
        val sdf = SimpleDateFormat("dd MMMM yyyy, HH:mm 'WIB'", Locale("id", "ID"))
        return sdf.format(Date(millis))
    }
}
