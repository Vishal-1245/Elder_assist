package com.example.voiceassist.ui.frontend.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.History
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun RecentActivityCard() {

    Card(
        modifier = Modifier.fillMaxWidth()
    ) {

        Column(
            modifier = Modifier.padding(18.dp)
        ) {

            Row {

                Icon(Icons.Default.History, null)

                Spacer(modifier = Modifier.width(10.dp))

                Text(
                    "Recent Activity",
                    style = MaterialTheme.typography.titleMedium
                )

            }

            Spacer(modifier = Modifier.height(15.dp))

            Text("✔ Called Daughter")

            Spacer(modifier = Modifier.height(8.dp))

            Text("✔ Played Music")

            Spacer(modifier = Modifier.height(8.dp))

            Text("✔ Opened WhatsApp")

        }

    }

}