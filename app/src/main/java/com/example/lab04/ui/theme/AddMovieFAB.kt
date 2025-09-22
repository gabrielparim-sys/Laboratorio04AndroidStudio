package com.example.lab04.ui.theme

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun AddMovieFAB(onClick: () -> Unit) {
    FloatingActionButton(
        onClick = onClick,
        containerColor = MaterialTheme.colorScheme.primary, // 🎨 Color más visible
        contentColor = Color.White // 🎨 Ícono en blanco
    ) {
        Icon(
            imageVector = Icons.Filled.Add,
            contentDescription = "Añadir filmación (Editado por B)" // cambio B
        )
    }
}
