package com.huda.businesscard.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp

private val LightColors = lightColorScheme(
    background = Color(0xFFFFF5EC),
    onBackground = Color(0xFF231910),
    surface = Color(0xFFFFF5EC),
    onSurface = Color(0xFF231910),
    primaryContainer = Color(0xFFFFDBC3),
    secondaryContainer = Color(0xFFFDEBE1)
)

private val DarkColors = darkColorScheme(
    background = Color(0xFF1E1005),
    onBackground = Color(0xFFF5DED6),
    surface = Color(0xFF1E1005),
    onSurface = Color(0xFFF5DED6),
    primaryContainer = Color(0xFF5B4130),
    secondaryContainer = Color(0xFF2A1D15)
)

private val AppTypography = Typography(
    bodyLarge = TextStyle(fontSize = 16.sp, lineHeight = 24.sp, letterSpacing = 0.sp)
)

@Composable
fun BusinessCardTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = if (darkTheme) DarkColors else LightColors,
        typography = AppTypography,
        content = content
    )
}
