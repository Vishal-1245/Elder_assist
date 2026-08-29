package com.example.voiceassist.ui.frontend.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Mic
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun VoiceButton() {

    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Box(
            modifier = Modifier
                .size(140.dp)
                .shadow(
                    elevation = 12.dp,
                    shape = CircleShape
                )
                .background(
                    color = Color(0xFF4CAF50),
                    shape = CircleShape
                )
                .clickable { },
            contentAlignment = Alignment.Center
        ) {

            Icon(
                imageVector = Icons.Default.Mic,
                contentDescription = "Voice Assistant",
                tint = Color.White,
                modifier = Modifier.size(70.dp)
            )

        }

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Tap to Speak",
            fontSize = 24.sp,
            style = MaterialTheme.typography.titleLarge
        )

    }
}