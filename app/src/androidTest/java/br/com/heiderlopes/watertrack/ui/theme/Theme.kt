package br.com.heiderlopes.watertrack.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun WaterTrackerTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = lightColorScheme(
            primary = PrimaryColor,
            background = BackgroundColor,
            surface = Color.White,
            onPrimary = Color.White,
            onBackground = TextDarkColor,
            onSurface = TextDarkColor
        ),
        typography = Typography,
        content = content
    )
}