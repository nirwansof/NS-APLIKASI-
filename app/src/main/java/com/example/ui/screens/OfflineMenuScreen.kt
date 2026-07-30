package com.example.ui.screens

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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ChevronRight
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.MenuBook
import androidx.compose.material.icons.filled.NightlightRound
import androidx.compose.material.icons.filled.OfflinePin
import androidx.compose.material.icons.filled.SelfImprovement
import androidx.compose.material.icons.filled.Spa
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun OfflineMenuScreen(
    onSelectMenuCategory: (String) -> Unit,
    onOpenTasbihCounter: () -> Unit,
    modifier: Modifier = Modifier
) {
    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
            .testTag("offline_menu_screen"),
        verticalArrangement = Arrangement.spacedBy(14.dp)
    ) {
        item {
            Column {
                Text(
                    text = "MENU OFFLINE NS",
                    style = MaterialTheme.typography.headlineSmall,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.primary
                )
                Text(
                    text = "Akses seluruh konten ibadah dan panduan lengkap tanpa koneksi internet.",
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
        }

        // Sub-menu 1: Bacaan Shalat (1-13)
        item {
            OfflineSubMenuCard(
                title = "1. Bacaan Shalat Subuh (1 - 13)",
                subtitle = "Urutan lengkap dari Niat, Iftitah, Qunut Subuh hingga Salam",
                badgeText = "13 Panduan",
                icon = Icons.Default.MenuBook,
                badgeColor = MaterialTheme.colorScheme.primaryContainer,
                iconColor = MaterialTheme.colorScheme.primary,
                onClick = { onSelectMenuCategory("Bacaan Sholat") }
            )
        }

        // Sub-menu 2: Doa Qiyamul Lail
        item {
            OfflineSubMenuCard(
                title = "2. Doa Qiyamul Lail",
                subtitle = "Panduan shalat malam Tahajud, Witir, Qunut Witir & Surah Pilihan",
                badgeText = "Tahajud & Witir",
                icon = Icons.Default.NightlightRound,
                badgeColor = MaterialTheme.colorScheme.secondaryContainer,
                iconColor = MaterialTheme.colorScheme.secondary,
                onClick = { onSelectMenuCategory("Qiyamul Lail") }
            )
        }

        // Sub-menu 3: DOAKU (23 Doa Harian)
        item {
            OfflineSubMenuCard(
                title = "3. DOAKU (23 Doa Harian)",
                subtitle = "Kumpulan doa lengkap untuk segala situasi kehidupan sehari-hari",
                badgeText = "23 Doa Harian",
                icon = Icons.Default.Favorite,
                badgeColor = Color(0xFFE8F5E9),
                iconColor = Color(0xFF2E7D32),
                onClick = { onSelectMenuCategory("Doa Harian") }
            )
        }

        // Sub-menu 4: DZIKIR PAGI & SORE
        item {
            OfflineSubMenuCard(
                title = "4. DZIKIR PAGI & SORE",
                subtitle = "10 amalan dzikir sesuai sunnah + Tasbih Digital Interaktif",
                badgeText = "10 Amalan + Tasbih",
                icon = Icons.Default.Spa,
                badgeColor = Color(0xFFFFF8E1),
                iconColor = Color(0xFFF57F17),
                onClick = { onSelectMenuCategory("Dzikir Pagi & Sore") },
                extraActionButton = {
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(8.dp))
                            .background(MaterialTheme.colorScheme.primary)
                            .clickable { onOpenTasbihCounter() }
                            .padding(horizontal = 10.dp, vertical = 6.dp)
                    ) {
                        Text(
                            text = "Buka Tasbih 📿",
                            style = MaterialTheme.typography.labelSmall,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onPrimary
                        )
                    }
                }
            )
        }

        // Sub-menu 5: SUNNAHKU
        item {
            OfflineSubMenuCard(
                title = "5. SUNNAHKU",
                subtitle = "Panduan lengkap adab & amalan sunnah sehari-hari dalam 9 topik",
                badgeText = "9 Adab Sunnah",
                icon = Icons.Default.SelfImprovement,
                badgeColor = MaterialTheme.colorScheme.surfaceVariant,
                iconColor = MaterialTheme.colorScheme.primary,
                onClick = { onSelectMenuCategory("Sunnah Sehari-hari") }
            )
        }
    }
}

@Composable
fun OfflineSubMenuCard(
    title: String,
    subtitle: String,
    badgeText: String,
    icon: ImageVector,
    badgeColor: Color,
    iconColor: Color,
    onClick: () -> Unit,
    extraActionButton: (@Composable () -> Unit)? = null
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(18.dp))
            .clickable { onClick() },
        shape = RoundedCornerShape(18.dp),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surface
        ),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Box(
                        modifier = Modifier
                            .size(44.dp)
                            .clip(CircleShape)
                            .background(badgeColor),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            imageVector = icon,
                            contentDescription = title,
                            tint = iconColor,
                            modifier = Modifier.size(24.dp)
                        )
                    }

                    Spacer(modifier = Modifier.width(12.dp))

                    Column {
                        Text(
                            text = title,
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                        Box(
                            modifier = Modifier
                                .clip(RoundedCornerShape(4.dp))
                                .background(badgeColor.copy(alpha = 0.5f))
                                .padding(horizontal = 6.dp, vertical = 2.dp)
                        ) {
                            Text(
                                text = badgeText,
                                style = MaterialTheme.typography.labelSmall,
                                fontWeight = FontWeight.Bold,
                                color = iconColor
                            )
                        }
                    }
                }

                Icon(
                    imageVector = Icons.Default.ChevronRight,
                    contentDescription = null,
                    tint = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = subtitle,
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )

            if (extraActionButton != null) {
                Spacer(modifier = Modifier.height(10.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ) {
                    extraActionButton()
                }
            }
        }
    }
}
