package io.devexpert.android_firebase.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import io.devexpert.android_firebase.screens.Screen
import io.devexpert.android_firebase.screens.home.Home
import io.devexpert.android_firebase.screens.login.Login

@Composable
fun Navigation(navController: NavHostController = rememberNavController()) {
    Screen {
        NavHost(
            navController = navController,
            startDestination = Routes.Login.route
        ) {
            composable(Routes.Login.route) {
                Login(
                    navigateToHome = {
                        navController.navigate(Routes.Home.route)
                    }
                )
            }
            composable(Routes.Home.route) {
                Home()
            }
        }
    }
}