package com.huacho.techsync.ui.auth

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.huacho.techsync.ui.navigation.Screens
import com.huacho.techsync.ui.theme.MainBlue
import com.huacho.techsync.ui.theme.NeutralGray

@Composable
fun LoginScreen(navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "TechSync",
            color = MainBlue,
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Technical Service Management",
            color = NeutralGray,
            fontWeight = FontWeight.Medium
        )
        Spacer(modifier = Modifier.height(40.dp))

        var correo by remember { mutableStateOf("") }
        OutlinedTextField(
            value = correo,
            onValueChange = { newText ->
                correo = newText
            },
            label = { Text("E-mail") })

        Spacer(modifier = Modifier.height(20.dp))

        var contraseña by remember { mutableStateOf("") }
        OutlinedTextField(
            value = contraseña,
            onValueChange = { newText ->
                contraseña = newText
            },
            label = { Text("Password") })

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = {
                navController.navigate(Screens.Dashboard.route) {
                    popUpTo(Screens.Login.route) {
                        inclusive = true
                    }
                }
            },
            colors = ButtonDefaults.buttonColors(containerColor = MainBlue)
        ) {
            Text(text = "Sign in")
        }

        Row(verticalAlignment = Alignment.CenterVertically) {
            Text("Don´t have an account?")
            TextButton(
                onClick = {
                    navController.navigate(Screens.Register.route)
                },
                contentPadding = PaddingValues(0.dp)
            ) {
                Text(
                    "Sign up",
                    color = MainBlue,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}