package io.devexpert.android_firebase.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.analytics.ktx.logEvent
import io.devexpert.android_firebase.screens.Screen
import io.devexpert.android_firebase.screens.home.Home
import io.devexpert.android_firebase.screens.login.Login

@Composable
fun Navigation(analytics: FirebaseAnalytics, navController: NavHostController = rememberNavController()) {
    Screen {
        NavHost(
            navController = navController,
            startDestination = Routes.Login.route
        ) {
            composable(Routes.Login.route) {
                Login(
                    analytics = analytics,
                    navigateToHome = {
                        navController.navigate(Routes.Home.route)
                    }
                )
            }
            composable(Routes.Home.route) {
                Home(
                    analytics = analytics
                )
            }
        }
    }
}

@Composable
fun trackScreen(name: String, analytics: FirebaseAnalytics) {
    DisposableEffect(Unit) {
        onDispose {
            analytics.logEvent(FirebaseAnalytics.Event.SCREEN_VIEW) {
                param(FirebaseAnalytics.Param.SCREEN_NAME, name)
            }
        }
    }
}