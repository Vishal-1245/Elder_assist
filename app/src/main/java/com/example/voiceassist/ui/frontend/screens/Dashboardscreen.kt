package com.example.voiceassist.ui.frontend.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.voiceassist.ui.frontend.components.BottomNavBar
import com.example.voiceassist.ui.frontend.components.GreetingCard
import com.example.voiceassist.ui.frontend.components.QuickActionGrid
import com.example.voiceassist.ui.frontend.components.ScheduleCard
import com.example.voiceassist.ui.frontend.components.VoiceButton
import androidx.navigation.NavHostController
import com.example.voiceassist.ui.frontend.theme.BackgroundColor
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.rememberCoroutineScope
import kotlinx.coroutines.launch
import com.example.voiceassist.ui.frontend.components.DrawerMenu
import com.example.voiceassist.ui.frontend.components.TopBar
import com.example.voiceassist.ui.frontend.components.TodayOverviewCard
import com.example.voiceassist.ui.frontend.components.DailyHealthTipCard

@Composable
fun DashboardScreen(
    navController: NavHostController
) {
    val drawerState = rememberDrawerState(
        initialValue = DrawerValue.Closed
    )

    val scope = rememberCoroutineScope()

    ModalNavigationDrawer(

        drawerState = drawerState,

        drawerContent = {

            DrawerMenu(navController)

        }

    ) {

        Column(

            modifier = Modifier
                .fillMaxSize()
                .background(BackgroundColor)

        ) {

            Column(
                modifier = Modifier
                    .weight(1f)
                    .verticalScroll(rememberScrollState())
                    .padding(bottom = 10.dp)
            ) {

                TopBar(

                    navController = navController,

                    onMenuClick = {

                        scope.launch {

                            drawerState.open()

                        }

                    }

                )

                Spacer(modifier = Modifier.height(10.dp))

                GreetingCard()

                Spacer(modifier = Modifier.height(15.dp))

                VoiceButton()

                Spacer(modifier = Modifier.height(25.dp))

                QuickActionGrid()

                Spacer(modifier = Modifier.height(25.dp))

                Box(modifier = Modifier.padding(horizontal = 16.dp)) {
                    ScheduleCard()
                }
                Box(
                    modifier = Modifier.padding(horizontal = 16.dp)
                ) {
                    TodayOverviewCard()
                }

                Spacer(modifier = Modifier.height(20.dp))

                Box(
                    modifier = Modifier.padding(horizontal = 16.dp)
                ) {
                    DailyHealthTipCard()
                }

                Spacer(modifier = Modifier.height(30.dp))



            }

            BottomNavBar(
                navController = navController
            )

        }

    }
}