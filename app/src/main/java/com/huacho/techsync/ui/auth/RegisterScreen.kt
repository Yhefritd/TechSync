package com.huacho.techsync.ui.auth

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CheckboxDefaults.colors
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.huacho.techsync.ui.navigation.Screens
import com.huacho.techsync.ui.theme.MainBlue

@Composable
fun RegisterScreen(navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Get Started", fontSize = 40.sp, color = MainBlue, fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(40.dp))

        var fullName by remember { mutableStateOf("") }
        var Email by remember { mutableStateOf("") }
        var Password by remember { mutableStateOf("") }
        OutlinedTextField(
            value = fullName,
            onValueChange = { newText ->
                fullName = newText
            },
            label = { Text("Full Name") }
        )

        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(
            value = Email, onValueChange = { newText ->
                Email = newText
            },
            label = { Text("E-mail") }
        )

        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(
            value = Password, onValueChange = { newText ->
                Password = newText
            },
            label = { Text("Password") }
        )

        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(
            value = Password, onValueChange = { newText ->
                Password = newText
            },
            label = { Text("Confirm Password") }
        )

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = {
                navController.popBackStack()
            },
            colors = ButtonDefaults.buttonColors(containerColor = MainBlue)
        ) {
            Text(
                text = "Sign in"
            )
        }
    }
}