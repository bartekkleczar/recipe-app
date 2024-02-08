package com.example.recipee

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.recipee.navigation.Navigation
import com.example.recipee.ui.theme.RecipeeTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val recipes = jsonGetter(this)
        setContent {
            RecipeeTheme {
                Navigation(recipes = recipes)
            }
        }
    }
}
