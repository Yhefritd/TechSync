package com.huacho.techsync.ui.auth

import android.graphics.drawable.Icon
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.SegmentedButtonDefaults.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.huacho.techsync.R
import com.huacho.techsync.ui.navigation.Screens
import com.huacho.techsync.ui.theme.MainBlue
import com.huacho.techsync.ui.theme.NeutralGray
import com.huacho.techsync.ui.theme.SoftGray

@Composable
fun LoginScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(25.dp),
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
            onValueChange = { correo = it },
            label = { Text("E-mail") },
            shape = RoundedCornerShape(35),
            modifier = Modifier.fillMaxWidth(),
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = SoftGray,
                unfocusedBorderColor = SoftGray,
                focusedLabelColor = NeutralGray,
                cursorColor = SoftGray
            ),
            leadingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.lock),
                    contentDescription = null,
                    modifier = Modifier.size(18.dp).offset(8.dp)
                )
            },
            trailingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.visibility),
                    contentDescription = null,
                    modifier = Modifier.size(18.dp).offset(-8.dp)
                )
            }
        )

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