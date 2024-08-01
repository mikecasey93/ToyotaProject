package com.example.project.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.project.model.ComicModel
import com.example.project.ui.screens.FirstScreen
import com.example.project.ui.screens.SecondScreen

@Composable
fun SwitchScreens(comic: ComicModel) {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "first"
    ) {
        composable("first") {
            FirstScreen(comic = comic, navController = navController)
        }
        composable("second") {
            SecondScreen(comic = comic)
        }
    }
}