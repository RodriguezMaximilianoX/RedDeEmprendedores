package com.rmxdev.reddeemprendedores.navigation.graphs

import androidx.compose.ui.Modifier
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.rmxdev.reddeemprendedores.presenter.initial.InitialScreen
import com.rmxdev.reddeemprendedores.presenter.login.LoginScreen
import com.rmxdev.reddeemprendedores.presenter.register.RegisterScreen

fun NavGraphBuilder.mainGraph(navController: NavHostController) {
    composable("initial") {
        InitialScreen(
            modifier = Modifier,
            navigateToLogin = { navController.navigate("login") },
            navigateToRegister = { navController.navigate("register") }
        )
    }
    composable("login") {
        LoginScreen(
            modifier = Modifier,
            navigateToHome = { navController.navigate("home") }
        )
    }
    composable("register") {
        RegisterScreen(
            modifier = Modifier,
            navigateToHome = { navController.navigate("home") }
        )
    }
}