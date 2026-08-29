package com.example.voiceassist.ui.frontend.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lightbulb
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun DailyHealthTipCard() {

    Card(
        modifier = Modifier.fillMaxWidth(),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {

        Column(
            modifier = Modifier.padding(18.dp)
        ) {

            Row {

                Icon(Icons.Default.Lightbulb, null)

                Spacer(modifier = Modifier.width(10.dp))

                Text(
                    "Daily Health Tip",
                    style = MaterialTheme.typography.titleMedium
                )

            }

            Spacer(modifier = Modifier.height(14.dp))

            Text(
                "💧 Drink at least 8 glasses of water today.\n\n🚶 Walk for 15 minutes to stay active."
            )

        }

    }

}