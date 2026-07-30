package com.example.data

data class Verse(
    val number: Int,
    val arabic: String,
    val latin: String,
    val translation: String
)

data class PrayerItem(
    val id: String,
    val title: String,
    val mainCategory: String,
    val subCategory: String,
    val description: String = "",
    val verses: List<Verse>,
    val targetCount: Int = 1,
    val isFavorite: Boolean = false
)

enum class ViewMode {
    PER_AYAT,
    PARAGRAF
}
