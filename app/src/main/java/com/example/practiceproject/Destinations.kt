package com.example.practiceproject

sealed class Destinations (val route : String){
    data object HomeScreen : Destinations("Home")
    data object SecondScreen : Destinations("Second")
    data object ThirdScreen : Destinations("Third")
}