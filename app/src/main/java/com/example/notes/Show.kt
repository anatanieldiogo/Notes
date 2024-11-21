package com.example.notes

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun Show(navController: NavController) {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(text = "Detalhes")
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Título: Titulo 2")
        Text(text = "Texto:Texto da nota 2 ")
        Text(text = "Data: 20/11/2024")
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { navController.navigate(Routes.Home) }, modifier = Modifier.fillMaxWidth()) {
            Text("Voltar")
        }
    }
}
