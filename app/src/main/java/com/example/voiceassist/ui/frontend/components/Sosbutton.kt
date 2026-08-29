package com.example.voiceassist.ui.frontend.components

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SOSButton(){

    Box(

        modifier=Modifier.fillMaxWidth(),

        contentAlignment=Alignment.Center

    ){

        Button(

            onClick={},

            colors=ButtonDefaults.buttonColors(

                containerColor=MaterialTheme.colorScheme.error

            ),

            modifier=Modifier
                .fillMaxWidth()
                .padding(horizontal=16.dp)

        ){

            Text(

                "🚨 EMERGENCY SOS",

                modifier=Modifier.padding(6.dp)

            )

        }

    }

}