package com.example.voiceassist.ui.frontend.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.voiceassist.ui.frontend.navigation.Routes
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.Alignment
import androidx.compose.foundation.background

@Composable
fun DrawerMenu(

    navController: NavHostController

) {

    ModalDrawerSheet {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)
        ) {

            Box(
                modifier = Modifier
                    .size(70.dp)
                    .background(
                        MaterialTheme.colorScheme.primary,
                        CircleShape
                    ),
                contentAlignment = Alignment.Center
            ) {

                Text(
                    "V",
                    color = MaterialTheme.colorScheme.onPrimary,
                    style = MaterialTheme.typography.headlineMedium
                )

            }

            Spacer(modifier = Modifier.height(12.dp))

            Text(
                "Vishal Reddy",
                style = MaterialTheme.typography.titleLarge
            )

            Text(
                "AI Smart Assistant"
            )

        }

        HorizontalDivider()

        NavigationDrawerItem(

            label = { Text("Dashboard") },

            icon = { Icon(Icons.Default.Home, null) },

            selected = false,

            onClick = {

                navController.navigate(Routes.Dashboard.route)

            }

        )

        NavigationDrawerItem(

            label = { Text("History") },

            icon = { Icon(Icons.Default.History, null) },

            selected = false,

            onClick = {

                navController.navigate(Routes.History.route)

            }

        )

        NavigationDrawerItem(

            label = { Text("Profile") },

            icon = { Icon(Icons.Default.Person, null) },

            selected = false,

            onClick = {

                navController.navigate(Routes.Profile.route)

            }

        )

        NavigationDrawerItem(

            label = { Text("Emergency") },

            icon = { Icon(Icons.Default.Call, null) },

            selected = false,

            onClick = {}

        )

        NavigationDrawerItem(

            label = { Text("Language") },

            icon = { Icon(Icons.Default.Language, null) },

            selected = false,

            onClick = {}

        )

        NavigationDrawerItem(

            label = { Text("About") },

            icon = { Icon(Icons.Default.Info, null) },

            selected = false,

            onClick = {}

        )

        NavigationDrawerItem(

            label = { Text("Logout") },

            icon = { Icon(Icons.Default.Logout, null) },

            selected = false,

            onClick = {}

        )

    }

}