package com.example.voiceassist.ui.frontend.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.voiceassist.ui.frontend.data.UserPreferences
import kotlinx.coroutines.flow.first
import com.example.voiceassist.ui.frontend.components.ProfileItem
import kotlinx.coroutines.launch

@Composable
fun ProfileScreen(
    navController: NavHostController
) {

    val context = LocalContext.current
    val prefs = UserPreferences(context)

    var name by remember { mutableStateOf("") }
    var age by remember { mutableStateOf("") }
    var phone by remember { mutableStateOf("") }
    var language by remember { mutableStateOf("") }

    LaunchedEffect(Unit) {

        name = prefs.userName.first()
        age = prefs.userAge.first()
        phone = prefs.userEmergency.first()
        language = prefs.userLanguage.first()

    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
    ) {

        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {

            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Box(
                    modifier = Modifier
                        .size(100.dp)
                        .clip(CircleShape)
                        .background(MaterialTheme.colorScheme.primary),
                    contentAlignment = Alignment.Center
                ) {

                    Icon(
                        Icons.Default.Person,
                        null,
                        tint = MaterialTheme.colorScheme.onPrimary,
                        modifier = Modifier.size(55.dp)
                    )

                }

                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    name,
                    style = MaterialTheme.typography.headlineSmall
                )

                Text(
                    "AI Smart Assistant User",
                    fontSize = 15.sp
                )

            }

        }

        Spacer(modifier = Modifier.height(30.dp))

        ProfileItem(Icons.Default.Edit, "Edit Profile")
        ProfileItem(Icons.Default.Phone, "Emergency Contact", phone)
        ProfileItem(Icons.Default.Language, "Language", language)
        ProfileItem(Icons.Default.Cake, "Age", age)
        ProfileItem(Icons.Default.Notifications, "Notifications", "ON")
        ProfileItem(Icons.Default.Settings, "App Settings")
        ProfileItem(Icons.Default.Info, "About App")
        ProfileItem(Icons.Default.Logout, "Logout")

    }

}