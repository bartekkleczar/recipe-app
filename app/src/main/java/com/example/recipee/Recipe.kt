package com.example.recipee

data class Recipe(
    val description: String,
    val imageID: Int,
    val name: String,
    val origin: String,
    val recipe: String,
    val time: Int
)

data class RecipeList(val recipes: List<Recipe>)