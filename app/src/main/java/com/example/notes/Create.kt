package com.example.notes

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController


@Composable
fun Create(navController: NavController) {

    var titulo by remember { mutableStateOf("") }
    var texto by remember { mutableStateOf("") }


    Scaffold { innerPadding ->
        Column(modifier = Modifier.padding(innerPadding)) {
            TextField(
                value = titulo,
                onValueChange = { titulo = it },
                label = { Text("Título") },
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(8.dp))
            TextField(
                value = texto,
                onValueChange = { texto = it },
                label = { Text("Texto") },
                modifier = Modifier.fillMaxWidth(),
                maxLines = 5
            )
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = {  }, modifier = Modifier.fillMaxWidth()) {
                Text("Guardar")
            }
            Spacer(modifier = Modifier.height(8.dp))
            TextButton(onClick = {navController.navigate(Routes.Home)}) {
                Text("Cancelar")
            }
        }
    }
}

