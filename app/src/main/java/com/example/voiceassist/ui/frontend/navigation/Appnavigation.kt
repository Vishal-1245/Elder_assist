package com.example.voiceassist.ui.frontend.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.*
import com.example.voiceassist.ui.frontend.screens.*
import com.example.voiceassist.ui.frontend.screens.ProfileScreen

@Composable
fun AppNavigation() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Routes.Splash.route
    ) {

        composable(Routes.Splash.route) {
            SplashScreen(navController)
        }

        composable(Routes.Setup.route) {
            SetupScreen(navController)
        }

        composable(Routes.Dashboard.route) {
            DashboardScreen(navController)
        }

        composable(Routes.History.route) {
            HistoryScreen(navController)
        }

        composable(Routes.Reminder.route) {
            ReminderScreen(navController)
        }

        composable(Routes.Settings.route) {
            SettingsScreen(navController)
        }
        composable(Routes.Profile.route) {
            ProfileScreen(navController)
        }

    }

}