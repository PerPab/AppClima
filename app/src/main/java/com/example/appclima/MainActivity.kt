package com.example.appclima

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.appclima.presentacion.ClimaPage
import com.example.appclima.ui.theme.AppClimaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppClimaTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                   ClimaPage(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

