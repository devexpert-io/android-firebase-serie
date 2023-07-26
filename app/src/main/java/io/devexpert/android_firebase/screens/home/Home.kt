package io.devexpert.android_firebase.screens.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import com.google.firebase.analytics.FirebaseAnalytics
import io.devexpert.android_firebase.navigation.trackScreen

@Composable
fun Home(analytics: FirebaseAnalytics) {

    trackScreen(name = "Ingreso a HomeScreen", analytics = analytics)

    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text("Inicio", fontSize = 40.sp)
    }
}