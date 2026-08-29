package com.example.voiceassist.ui.frontend.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

@Composable
fun ActionCard(

    title:String,

    icon:ImageVector

){

    Card(

        modifier=Modifier
            .width(160.dp)
            .height(110.dp),

        elevation=CardDefaults.cardElevation(5.dp)

    ){

        Column(

            modifier=Modifier.fillMaxSize(),

            horizontalAlignment=Alignment.CenterHorizontally,

            verticalArrangement=Arrangement.Center

        ){

            Icon(

                icon,

                null,

                modifier=Modifier.size(36.dp)

            )

            Spacer(modifier=Modifier.height(8.dp))

            Text(title)

        }

    }

}