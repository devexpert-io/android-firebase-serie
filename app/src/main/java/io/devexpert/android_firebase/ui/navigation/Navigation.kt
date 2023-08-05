package io.devexpert.android_firebase.ui.navigation

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.google.firebase.auth.FirebaseUser
import io.devexpert.android_firebase.ui.screens.HomeScreen
import io.devexpert.android_firebase.ui.screens.Screen
import io.devexpert.android_firebase.ui.screens.auth.ForgotPasswordScreen
import io.devexpert.android_firebase.ui.screens.auth.LoginScreen
import io.devexpert.android_firebase.ui.screens.auth.SignUpScreen
import io.devexpert.android_firebase.utils.AnalyticsManager
import io.devexpert.android_firebase.utils.AuthManager

@Composable
fun Navigation(context: Context, navController: NavHostController = rememberNavController()) {
    var analytics: AnalyticsManager = AnalyticsManager(context)
    val authManager: AuthManager = AuthManager()

    val user: FirebaseUser? = authManager.getCurrentUser()

    Screen {
        NavHost(
            navController = navController,
            startDestination = if(user == null) Routes.Login.route else Routes.Home.route
        ) {
            composable(Routes.Login.route) {
                LoginScreen(
                    analytics = analytics,
                    auth = authManager,
                    navigation = navController,
                )
            }
            composable(Routes.Home.route) {
                HomeScreen(
                    analytics = analytics,
                    auth = authManager,
                    navigation = navController)
            }
            composable(Routes.SignUp.route) {
                SignUpScreen(
                    analytics = analytics,
                    navigation = navController
                )
            }
            composable(Routes.ForgotPassword.route) {
                ForgotPasswordScreen(
                    analytics = analytics,
                    navigation = navController
                )
            }
        }
    }
}