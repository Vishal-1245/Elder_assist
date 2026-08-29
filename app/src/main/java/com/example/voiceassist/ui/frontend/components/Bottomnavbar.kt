package com.example.voiceassist.ui.frontend.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.voiceassist.ui.frontend.navigation.Routes

@Composable
fun BottomNavBar(
    navController: NavHostController
) {

    val currentRoute =
        navController.currentBackStackEntryAsState()
            .value?.destination?.route

    NavigationBar {

        NavigationBarItem(

            selected = currentRoute == Routes.Dashboard.route,

            onClick = {

                navController.navigate(Routes.Dashboard.route)

            },

            icon = {

                Icon(Icons.Default.Home, null)

            },

            label = {

                Text("Home")

            }

        )

        NavigationBarItem(

            selected = currentRoute == Routes.Reminder.route,

            onClick = {

                navController.navigate(Routes.Reminder.route)

            },

            icon = {

                Icon(Icons.Default.Notifications, null)

            },

            label = {

                Text("Reminder")

            }

        )

        NavigationBarItem(

            selected = false,

            onClick = {

                // SOS Screen later

            },

            icon = {

                Icon(Icons.Default.Warning, null)

            },

            label = {

                Text("SOS")

            }

        )

    }

}