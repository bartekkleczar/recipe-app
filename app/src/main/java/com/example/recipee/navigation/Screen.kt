package com.example.recipee.navigation

sealed class Screen(val route: String) {
    object Overview : Screen("overview")
    object Recipe : Screen("trainings")
    object Settings : Screen("settings")

    fun withArgs(vararg args: String): String {
        return buildString {
            append(route)
            args.forEach { arg ->
                append("/$arg")
            }
        }
    }
}