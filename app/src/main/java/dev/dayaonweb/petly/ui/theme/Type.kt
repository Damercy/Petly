package dev.dayaonweb.petly.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import dev.dayaonweb.petly.R

val Milliard = FontFamily(
    Font(R.font.milliard_bold, FontWeight.Bold),
    Font(R.font.milliard_xbold, FontWeight.ExtraBold),
    Font(R.font.milliard_semibold, FontWeight.SemiBold),
    Font(R.font.milliard_medium, FontWeight.Medium),
)

val Typography = Typography(
    defaultFontFamily = Milliard,
    body1 = TextStyle(
        fontFamily = Milliard,
        fontWeight = FontWeight.Medium,
        fontSize = 16.sp
    ),
)