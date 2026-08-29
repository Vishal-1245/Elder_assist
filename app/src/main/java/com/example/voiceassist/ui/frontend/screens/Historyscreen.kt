package com.example.voiceassist.ui.frontend.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.voiceassist.ui.frontend.components.BottomNavBar

@Composable
fun HistoryScreen(
    navController: NavHostController
) {

    Column(
        modifier = Modifier.fillMaxSize()
    ) {

        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {

            Text(
                text = "History Screen",
                style = MaterialTheme.typography.headlineMedium
            )

        }

        BottomNavBar(navController)

    }

}