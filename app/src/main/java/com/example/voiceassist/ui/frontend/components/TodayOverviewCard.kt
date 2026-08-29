package com.example.voiceassist.ui.frontend.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CalendarToday
import androidx.compose.material.icons.filled.LocalDrink
import androidx.compose.material.icons.filled.Medication
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun TodayOverviewCard() {

    Card(
        modifier = Modifier
            .fillMaxWidth(),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {

        Column(
            modifier = Modifier.padding(18.dp)
        ) {

            Text(
                text = "Today's Overview",
                style = MaterialTheme.typography.titleLarge
            )

            Spacer(modifier = Modifier.height(18.dp))

            Row {

                Icon(Icons.Default.CalendarToday, null)

                Spacer(modifier = Modifier.width(10.dp))

                Text("1 Reminder Today")

            }

            Spacer(modifier = Modifier.height(12.dp))

            Row {

                Icon(Icons.Default.Medication, null)

                Spacer(modifier = Modifier.width(10.dp))

                Text("Medicine at 8:00 PM")

            }

            Spacer(modifier = Modifier.height(12.dp))

            Row {

                Icon(Icons.Default.LocalDrink, null)

                Spacer(modifier = Modifier.width(10.dp))

                Text("Drink Water")

            }

        }

    }

}