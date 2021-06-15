package dev.dayaonweb.petly.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
    primary = yellow,
    primaryVariant = yellowVariant,
    secondary = green,
    onPrimary = white,
    onSurface = darkGrey,
    onBackground = darkGrey,
    onSecondary = darkGrey,
    secondaryVariant = grey
)

private val LightColorPalette = lightColors(
    primary = yellow,
    primaryVariant = yellowVariant,
    secondary = green,
    onPrimary = white,
    onSurface = darkGrey,
    onBackground = darkGrey,
    onSecondary = darkGrey,
    secondaryVariant = grey
)

@Composable
fun PetlyTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable() () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}