package io.devexpert.android_firebase

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.analytics.ktx.analytics
import com.google.firebase.ktx.Firebase
import io.devexpert.android_firebase.navigation.Navigation
import io.devexpert.android_firebase.ui.theme.Android_firebaseTheme

class MainActivity : ComponentActivity() {
    private lateinit var analytics: FirebaseAnalytics

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        analytics = Firebase.analytics

        setContent {
            Android_firebaseTheme {
                Navigation(analytics)
            }
        }
    }
}