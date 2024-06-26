package com.example.practiceproject

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController


@Composable
fun HomeScreen(navController: NavController){
    var username by remember { mutableStateOf("") }
    var count by remember { mutableIntStateOf(0) }

    Column (
        modifier = Modifier
            .background(Color.Yellow)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        TextField(
            value = username,
            onValueChange = { newUser -> username = newUser },
        )

        Button(
            onClick = {
                navController.navigate(Destinations.SecondScreen.toString() + "/$username")
            }
        ) {
            Text(text = "Click me ")
        }

        Button(
            onClick = {count++}
        ){
            Text(text = "Count: $count")
        }

        Button(
            onClick = { navController.navigate(Destinations.ThirdScreen.toString())}
        ) {
            Text(text = "ThirdScreen")
        }
    }
}
