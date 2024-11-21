package com.example.notes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.notes.ui.theme.NotesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()
            NavHost(navController = navController, startDestination = Routes.Home) {
                composable(Routes.Home){
                    Home(navController)
                }
                composable(Routes.Create){
                    Create(navController)
                }
//                composable(Routes.Create+"/{name}"){
//                    val name = it.arguments?.getString("name")
//                    Create(name?: "No data")
//                }
                composable(Routes.Show){
                    Show(navController)
                }
            }
        }
    }
}
