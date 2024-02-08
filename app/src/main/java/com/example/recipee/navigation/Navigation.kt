package com.example.recipee.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navArgument
import androidx.navigation.compose.rememberNavController
import com.example.recipee.Recipe
import com.example.recipee.screens.OverviewScreen
import com.example.recipee.screens.RecipeScreen
import com.example.recipee.screens.SettingsScreen

@Composable
fun Navigation(recipes: List<Recipe>) {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.Overview.route) {

        composable(route = Screen.Overview.route) {
            OverviewScreen(navController = navController, recipes)
        }

        composable(route = Screen.Settings.route) {
            SettingsScreen(navController = navController, recipes)
        }

        composable(
            route = Screen.Recipe.route + "/{id}",
            arguments = listOf(
                navArgument("id") {
                    type = NavType.IntType
                    defaultValue = "-1"
                    nullable = false
                }
            )
        ) { entry ->
            RecipeScreen(navController, id = entry.arguments?.getInt("id"), recipes)
        }
    }
}