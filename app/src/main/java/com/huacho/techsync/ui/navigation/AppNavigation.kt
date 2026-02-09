package com.huacho.techsync.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.huacho.techsync.ui.auth.LoginScreen
import com.huacho.techsync.ui.auth.RegisterScreen
import com.huacho.techsync.ui.dashboard.DashboardScreen
import com.huacho.techsync.ui.repair.DetalleScreen
import com.huacho.techsync.ui.repair.FormularioScreen

@Composable
fun AppNavigation(){
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screens.Formulario.route
    ){
        composable(route = Screens.Login.route){
            LoginScreen()
        }
        composable(route = Screens.Register.route){
            RegisterScreen()
        }
        composable(route = Screens.Dashboard.route){
            DashboardScreen()
        }
        composable(route = Screens.Formulario.route){
            FormularioScreen()
        }
        composable(route = Screens.Detalle.route){
            DetalleScreen()
        }
    }
}