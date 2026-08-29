package com.example.voiceassist.ui.frontend.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.voiceassist.ui.frontend.data.UserPreferences
import kotlinx.coroutines.flow.collectLatest

@Composable
fun GreetingCard() {

    val context = LocalContext.current
    val preferences = UserPreferences(context)

    var userName by remember {
        mutableStateOf("User")
    }

    LaunchedEffect(Unit) {

        preferences.userName.collectLatest {

            if (it.isNotEmpty()) {
                userName = it
            }

        }

    }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        elevation = CardDefaults.cardElevation(6.dp)
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(18.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Box(
                modifier = Modifier
                    .size(65.dp)
                    .clip(CircleShape)
                    .background(MaterialTheme.colorScheme.primary),
                contentAlignment = Alignment.Center
            ) {

                Icon(
                    Icons.Default.Person,
                    contentDescription = null,
                    tint = MaterialTheme.colorScheme.onPrimary,
                    modifier = Modifier.size(38.dp)
                )

            }

            Spacer(modifier = Modifier.width(18.dp))

            Column {

                Text(
                    text = "Good Morning",
                    fontSize = 18.sp
                )

                Spacer(modifier = Modifier.height(5.dp))

                Text(
                    text = userName,
                    style = MaterialTheme.typography.headlineSmall
                )

                Spacer(modifier = Modifier.height(4.dp))

                Text(
                    text = "How can I help you today?"
                )

            }

        }

    }

}