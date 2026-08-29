package com.example.voiceassist.ui.frontend.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.voiceassist.ui.frontend.data.UserPreferences
import com.example.voiceassist.ui.frontend.navigation.Routes
import com.example.voiceassist.ui.frontend.theme.PrimaryGreen
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Cake
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Language
import androidx.compose.material3.Icon
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.graphics.Color

@Composable
fun SetupScreen(
    navController: NavHostController
) {

    var name by remember { mutableStateOf("") }
    var age by remember { mutableStateOf("") }
    var emergency by remember { mutableStateOf("") }

    val context = LocalContext.current
    val userPreferences = UserPreferences(context)

    var selectedLanguage by remember {
        mutableStateOf("English")
    }
    val nameRegex = Regex("^[A-Za-z ]+$")

    val isNameValid =
        name.isNotBlank() &&
                name.matches(nameRegex)

    val isAgeValid =
        age.toIntOrNull() != null &&
                age.toInt() in 1..120

    val isPhoneValid =
        emergency.length == 10 &&
                emergency.all { it.isDigit() }

    val isFormValid =
        isNameValid &&
                isAgeValid &&
                isPhoneValid

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
            .verticalScroll(rememberScrollState())
    ) {

        Text(
            text = "Welcome",
            style = MaterialTheme.typography.headlineMedium
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text("Let's personalize your assistant")

        Spacer(modifier = Modifier.height(25.dp))

        OutlinedTextField(
            value = name,
            onValueChange = { name = it },
            label = { Text("Full Name") },

            leadingIcon = {
                Icon(Icons.Default.Person, null)
            },

            modifier = Modifier.fillMaxWidth(),

            isError = name.isNotEmpty() && !isNameValid,

            textStyle = LocalTextStyle.current.copy(
                color = Color.Black
            ),

            colors = OutlinedTextFieldDefaults.colors(
                focusedTextColor = Color.Black,
                unfocusedTextColor = Color.Black,
                cursorColor = PrimaryGreen,
                focusedBorderColor = PrimaryGreen
            )
        )

        if (name.isNotEmpty() && !isNameValid) {

            Text(
                "Only letters and spaces are allowed.",
                color = Color.Red,
                style = MaterialTheme.typography.bodySmall
            )

        }

        Spacer(modifier = Modifier.height(15.dp))

        OutlinedTextField(
            value = age,
            onValueChange = {

                if (it.all { c -> c.isDigit() }) {

                    age = it

                }

            },

            label = { Text("Age") },

            leadingIcon = {
                Icon(Icons.Default.Cake, null)
            },

            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number
            ),

            modifier = Modifier.fillMaxWidth(),

            isError = age.isNotEmpty() && !isAgeValid,

            textStyle = LocalTextStyle.current.copy(
                color = Color.Black
            ),

            colors = OutlinedTextFieldDefaults.colors(
                focusedTextColor = Color.Black,
                unfocusedTextColor = Color.Black,
                cursorColor = PrimaryGreen,
                focusedBorderColor = PrimaryGreen
            )

        )

        if (age.isNotEmpty() && !isAgeValid) {

            Text(
                "Enter age between 1 and 120.",
                color = Color.Red,
                style = MaterialTheme.typography.bodySmall
            )

        }

        Spacer(modifier = Modifier.height(15.dp))

        OutlinedTextField(
            value = emergency,
            onValueChange = {

                if (it.all { c -> c.isDigit() } && it.length <= 10) {

                    emergency = it

                }

            },

            label = { Text("Emergency Contact") },

            leadingIcon = {
                Icon(Icons.Default.Phone, null)
            },

            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Phone
            ),

            modifier = Modifier.fillMaxWidth(),

            isError = emergency.isNotEmpty() && !isPhoneValid,

            textStyle = LocalTextStyle.current.copy(
                color = Color.Black
            ),

            colors = OutlinedTextFieldDefaults.colors(
                focusedTextColor = Color.Black,
                unfocusedTextColor = Color.Black,
                cursorColor = PrimaryGreen,
                focusedBorderColor = PrimaryGreen
            )

        )

        if (emergency.isNotEmpty() && !isPhoneValid) {

            Text(
                "Phone number must contain exactly 10 digits.",
                color = Color.Red,
                style = MaterialTheme.typography.bodySmall
            )

        }

        Spacer(modifier = Modifier.height(25.dp))

        Text(
            text = "Preferred Language",
            style = MaterialTheme.typography.titleMedium
        )

        Spacer(modifier = Modifier.height(10.dp))

        Row(
            modifier = Modifier.fillMaxWidth()
        ) {

            Button(
                onClick = {
                    selectedLanguage = "English"
                },
                modifier = Modifier.weight(1f)
            ) {
                Text("English")
            }

            Spacer(modifier = Modifier.width(10.dp))

            Button(
                onClick = {
                    selectedLanguage = "తెలుగు"
                },
                modifier = Modifier.weight(1f)
            ) {
                Text("తెలుగు")
            }

        }

        Spacer(modifier = Modifier.height(35.dp))

        Button(
            enabled = isFormValid,
            onClick = {

                CoroutineScope(Dispatchers.IO).launch {

                    userPreferences.saveUser(
                        name = name,
                        age = age,
                        emergency = emergency,
                        language = selectedLanguage
                    )

                }

                navController.navigate(Routes.Dashboard.route) {

                    popUpTo(Routes.Setup.route) {
                        inclusive = true
                    }

                }

            },
            modifier = Modifier
                .fillMaxWidth()
                .height(55.dp)
        ) {

            Text("Continue")

        }

    }

}