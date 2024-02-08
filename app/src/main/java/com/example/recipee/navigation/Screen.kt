package com.example.recipee.navigation

sealed class Screen(val route: String) {
    object Overview : Screen("overview")
    object Recipe : Screen("trainings")
    object Settings : Screen("settings")
    object Search : Screen("search")

    fun withArgs(vararg args: String): String {
        return buildString {
            append(route)
            args.forEach { arg ->
                append("/$arg")
            }
        }
    }
}