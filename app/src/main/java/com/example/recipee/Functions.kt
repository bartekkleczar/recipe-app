package com.example.recipee

import android.content.Context
import com.google.gson.Gson

fun jsonGetter(context: Context): List<Recipe> {
    val list =  Gson().fromJson(context.readJsonAsset("recipeeJson.json"), RecipeList::class.java)
    val recipes = mutableListOf<Recipe>()
    for (i in list.recipes){
        recipes.add(i)
    }
    return recipes
}
fun Context.readJsonAsset(fileName: String): String {
    val inputStream = assets.open(fileName)
    val size = inputStream.available()
    val buffer = ByteArray(size)
    inputStream.read(buffer)
    inputStream.close()
    return String(buffer, Charsets.UTF_8)
}