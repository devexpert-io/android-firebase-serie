package io.devexpert.android_firebase.ui.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import io.devexpert.android_firebase.ui.theme.Android_firebaseTheme

@Composable
fun Screen(content: @Composable () -> Unit) {
    Android_firebaseTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            content()
        }
    }
}