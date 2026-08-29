package com.example.voiceassist.ui.frontend.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.RecordVoiceOver
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.voiceassist.ui.frontend.navigation.Routes
import com.example.voiceassist.ui.frontend.theme.BackgroundColor
import com.example.voiceassist.ui.frontend.theme.PrimaryGreen
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(
    navController: NavHostController
) {

    LaunchedEffect(Unit) {

        delay(2000)

        navController.navigate(Routes.Setup.route) {
            popUpTo(Routes.Splash.route) {
                inclusive = true
            }
        }

    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(BackgroundColor),
        contentAlignment = Alignment.Center
    ) {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Icon(
                imageVector = Icons.Default.RecordVoiceOver,
                contentDescription = null,
                tint = PrimaryGreen,
                modifier = Modifier.size(120.dp)
            )

            Spacer(modifier = Modifier.height(20.dp))

            Text(
                text = "VoiceAssist",
                style = MaterialTheme.typography.headlineLarge
            )

            Spacer(modifier = Modifier.height(10.dp))

            Text("AI Smart Assistant for Elderly")

            Spacer(modifier = Modifier.height(40.dp))

            CircularProgressIndicator(
                color = PrimaryGreen
            )

        }

    }

}