package com.example.voiceassist.ui.frontend.navigation

sealed class Routes(val route: String) {

    object Splash : Routes("splash")

    object Setup : Routes("setup")

    object Dashboard : Routes("dashboard")

    object History : Routes("history")

    object Reminder : Routes("reminder")

    object Settings : Routes("settings")

    object Profile : Routes("profile")

}