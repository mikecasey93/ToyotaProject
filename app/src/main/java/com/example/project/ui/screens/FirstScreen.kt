package com.example.project.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import com.example.project.model.ComicModel

@Composable
fun FirstScreen(comic: ComicModel, navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("The Month is ${comic.month}")
        Spacer(modifier = Modifier.height(16.dp))
        Text("The Year is ${comic.year}")
        Spacer(modifier = Modifier.height(16.dp))
        AsyncImage(
            model = comic.img,
            contentDescription = "Api Image",
            modifier = Modifier.clickable { navController.navigate("second") }
        )
        Spacer(modifier = Modifier.height(16.dp))
    }
}