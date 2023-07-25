package io.devexpert.android_firebase.navigation

sealed class Routes(val route: String) {
    object Login : Routes("Login")
    object Home : Routes("Home")

}