package com.rmxdev.reddeemprendedores.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.rmxdev.reddeemprendedores.navigation.graphs.mainGraph

@Composable
fun NavigationWrapper(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = "initial"
    ){
        mainGraph(navController)
    }
}