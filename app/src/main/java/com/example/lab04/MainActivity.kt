package com.example.lab04

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding   // 👈 falta este import
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.lab04.ui.theme.Lab04Theme
import com.example.lab04.ui.theme.AddMovieFAB
import com.example.lab04.ui.theme.MovieList       // 👈 falta este import

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Lab04Theme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    floatingActionButton = { AddMovieFAB { /* Acción agregar */ } }
                ) { innerPadding ->
                    MovieList(
                        movies = listOf("Matrix", "Inception", "Interstellar"),
                        modifier = Modifier.padding(innerPadding) // ✅ correcto
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewApp() {
    Lab04Theme {
        MovieList(movies = listOf("Matrix", "Inception", "Interstellar"))
    }
}
