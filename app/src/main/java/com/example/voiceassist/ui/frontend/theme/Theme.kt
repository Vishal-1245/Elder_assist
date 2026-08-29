package com.example.voiceassist.ui.frontend.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val LightColors = lightColorScheme(

    primary = PrimaryGreen,

    secondary = LightGreen,

    background = BackgroundColor,

    surface = CardColor,

    onPrimary = CardColor,

    onBackground = TextPrimary,

    onSurface = TextPrimary

)

private val DarkColors = darkColorScheme(

    primary = PrimaryGreen,

    secondary = LightGreen

)

@Composable
fun VoiceAssistTheme(

    darkTheme: Boolean = isSystemInDarkTheme(),

    content: @Composable () -> Unit

) {

    MaterialTheme(

        colorScheme = if (darkTheme) DarkColors else LightColors,

        typography = AppTypography,

        content = content

    )

}