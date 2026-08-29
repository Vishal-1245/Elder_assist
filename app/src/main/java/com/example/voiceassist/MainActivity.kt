package com.example.voiceassist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.voiceassist.ui.frontend.navigation.AppNavigation
import com.example.voiceassist.ui.frontend.theme.VoiceAssistTheme

class MainActivity:ComponentActivity(){

    override fun onCreate(savedInstanceState: Bundle?){

        super.onCreate(savedInstanceState)

        setContent{

            VoiceAssistTheme{

                AppNavigation()

            }

        }

    }

}