package io.devexpert.android_firebase.ui.navigation

sealed class Routes(val route: String) {
    object Login : Routes("Login Screen")
    object Home : Routes("Home Screen")
    object SignUp : Routes("SignUp Screen")
    object ForgotPassword : Routes("ForgotPassword Screen")
}