package com.example.notes

import android.annotation.SuppressLint
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Card
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController



@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Home(navController: NavController) {

    val notas = listOf(
        Nota("Título 1", "Texto da nota 1", "21/11/2024"),
        Nota("Título 2", "Texto da nota 2", "20/11/2024"),
        Nota("Título 2", "Texto da nota 2", "20/11/2024"),
        Nota("Título 2", "Texto da nota 2", "20/11/2024"),
        Nota("Título 2", "Texto da nota 2", "20/11/2024"),
        Nota("Título 2", "Texto da nota 2", "20/11/2024"),
        Nota("Título 2", "Texto da nota 2", "20/11/2024"),
        Nota("Título 2", "Texto da nota 2", "20/11/2024"),
        Nota("Título 2", "Texto da nota 2", "20/11/2024"),
        Nota("Título 2", "Texto da nota 2", "20/11/2024"),
        Nota("Título 3", "Texto da nota 3", "19/11/2024")
    )

    Scaffold(
        floatingActionButton = {
            FloatingActionButton(onClick = { navController.navigate(Routes.Create) }) {
                Icon(Icons.Default.Add, contentDescription = "Adicionar Nota")
            }
        }
    ) {
        LazyColumn(modifier = Modifier.padding(16.dp)) {
            items(notas) { nota ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp)
                        .clickable {
                            navController.navigate(Routes.Show)
                        }
                ) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Text(text = nota.titulo)
                        Text(
                            text = nota.texto,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis
                        )
                        Text(text = nota.data)
                    }
                }
            }
        }
    }
}

