package com.rmxdev.reddeemprendedores

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.rmxdev.reddeemprendedores.navigation.NavigationWrapper
import com.rmxdev.reddeemprendedores.presenter.initial.InitialScreen
import com.rmxdev.reddeemprendedores.ui.theme.RedDeEmprendedoresTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RedDeEmprendedoresTheme {
                NavigationWrapper()
            }
        }
    }
}