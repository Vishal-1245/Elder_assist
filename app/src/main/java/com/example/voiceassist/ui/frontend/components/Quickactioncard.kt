package com.example.voiceassist.ui.frontend.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.CameraAlt
import androidx.compose.material.icons.filled.Message
import androidx.compose.material.icons.filled.MusicNote
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun QuickActionGrid() {

    Column(
        modifier = Modifier.padding(horizontal = 16.dp)
    ) {

        Text(
            "Quick Actions",
            style = MaterialTheme.typography.titleLarge
        )

        Spacer(modifier = Modifier.height(12.dp))

        Row(
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {

            ActionCard("Call", Icons.Default.Call)

            ActionCard("Message", Icons.Default.Message)

        }

        Spacer(modifier = Modifier.height(12.dp))

        Row(
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {

            ActionCard("Camera", Icons.Default.CameraAlt)

            ActionCard("Music", Icons.Default.MusicNote)

        }

    }

}