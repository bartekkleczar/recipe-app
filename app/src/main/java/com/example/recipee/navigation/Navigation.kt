package com.example.recipee.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.NavController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navArgument
import androidx.navigation.compose.rememberNavController
@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.Overview.route) {
        //Overview
        composable(route = Screen.Overview.route) {
            OverviewScreen(navController = navController)
        }

        //Edit Training
        composable(
            route = Screen.Recipe.route + "/{index}",
            arguments = listOf(
                navArgument("index") {
                    type = NavType.IntType
                    defaultValue = "-1"
                    nullable = false
                }
            )
        ) { entry ->
            Recipe(navController, index = entry.arguments?.getInt("name"))
        }
    }
}