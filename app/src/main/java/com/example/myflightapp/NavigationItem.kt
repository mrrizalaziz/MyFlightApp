package com.example.myflightapp



import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.graphics.vector.ImageVector

sealed class NavigationItem(val route: String, val label:String, val icons: ImageVector){

    object Home : NavigationItem("home", "Home", Icons.Default.Home)
    object Notifications : NavigationItem("SpecialFly", "SpecialFly", Icons.Default.Info)
    object Records : NavigationItem("Records", "Records", Icons.Default.Search)
    object Input : NavigationItem("InputData", "Input Data", Icons.Default.Add)
}
