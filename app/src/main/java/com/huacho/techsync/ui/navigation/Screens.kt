package com.huacho.techsync.ui.navigation

sealed class Screens(val route: String) {
    data object Login : Screens("login")
    data object Register : Screens("register")
    data object Dashboard : Screens("dashboard")
    data object Formulario : Screens("formulario")
    data object Detalle : Screens("detalle")
}