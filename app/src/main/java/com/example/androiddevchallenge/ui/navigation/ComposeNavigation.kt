package com.example.androiddevchallenge.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.androiddevchallenge.ui.DetailScreen
import com.example.androiddevchallenge.ui.ListScreen

@Composable
fun ComposeNavigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "list_screen"
    ) {

        composable("list_screen") {
            ListScreen(navController)
        }
        composable(
            "detail_screen/{puppy}"
        ) {
            DetailScreen(
                navController,
                it.arguments?.getString("puppy")
            )
        }
    }
}