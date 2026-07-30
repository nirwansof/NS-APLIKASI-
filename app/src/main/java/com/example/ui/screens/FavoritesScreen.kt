package com.example.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.data.PrayerItem
import com.example.ui.components.PrayerItemCard

@Composable
fun FavoritesScreen(
    favoritePrayers: List<PrayerItem>,
    arabicFontSize: Float,
    onFavoriteToggle: (String) -> Unit,
    onItemClick: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    val favoritesOnly = favoritePrayers.filter { it.isFavorite }

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
            .testTag("favorites_screen")
    ) {
        Column {
            Text(
                text = "DOA FAVORIT SAYA",
                style = MaterialTheme.typography.headlineSmall,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.primary
            )
            Text(
                text = "Daftar doa dan bacaan yang Anda tandai untuk akses cepat.",
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        if (favoritesOnly.isEmpty()) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(32.dp),
                contentAlignment = Alignment.Center
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Icon(
                        imageVector = Icons.Default.FavoriteBorder,
                        contentDescription = "Belum Ada Favorit",
                        tint = Color(0xFFE53935).copy(alpha = 0.5f),
                        modifier = Modifier.size(72.dp)
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    Text(
                        text = "Belum Ada Doa Favorit",
                        style = MaterialTheme.typography.titleLarge,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = "Tekan ikon hati (❤️) pada daftar doa atau bacaan mana saja untuk menyimpannya di halaman ini.",
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        textAlign = TextAlign.Center
                    )
                }
            }
        } else {
            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(12.dp),
                contentPadding = PaddingValues(bottom = 16.dp)
            ) {
                items(favoritesOnly, key = { it.id }) { item ->
                    PrayerItemCard(
                        item = item,
                        arabicFontSize = arabicFontSize,
                        onFavoriteToggle = { onFavoriteToggle(item.id) },
                        onClick = { onItemClick(item.id) }
                    )
                }
            }
        }
    }
}
