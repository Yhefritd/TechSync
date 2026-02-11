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
        startDestination = Screens.Login.route
    ){
        composable(route = Screens.Login.route){
            LoginScreen(navController)
        }
        composable(route = Screens.Register.route){
            RegisterScreen(navController)
        }
        composable(route = Screens.Dashboard.route){
            DashboardScreen(navController)
        }
        composable(route = Screens.Formulario.route){
            FormularioScreen(navController)
        }
        composable(route = Screens.Detalle.route){
            DetalleScreen(navController)
        }
    }
}