package com.example.voiceassist.ui.frontend.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Event
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ScheduleCard() {

    Card(
        modifier = Modifier.fillMaxWidth()
    ) {

        Column(
            modifier = Modifier.padding(18.dp)
        ) {

            Row {

                Icon(Icons.Default.Event, null)

                Spacer(modifier = Modifier.width(10.dp))

                Text(
                    "Today's Schedule",
                    style = MaterialTheme.typography.titleMedium
                )

            }

            Spacer(modifier = Modifier.height(15.dp))

            Text("💊 Medicine : 8:00 AM")

            Spacer(modifier = Modifier.height(8.dp))

            Text("🚶 Walk : 6:00 PM")

            Spacer(modifier = Modifier.height(8.dp))

            Text("📞 Call Family : 8:30 PM")

        }

    }

}