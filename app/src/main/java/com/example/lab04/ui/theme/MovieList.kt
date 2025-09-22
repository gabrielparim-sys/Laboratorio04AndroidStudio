package com.example.lab04.ui.theme

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MovieList(movies: List<String>) {
    LazyColumn(modifier = Modifier.padding(16.dp)) {
        items(movies) { movie ->
            Text(text = movie)
        }
    }
}
