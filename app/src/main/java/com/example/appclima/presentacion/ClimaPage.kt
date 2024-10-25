package com.example.appclima.presentacion

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

// aca se conecta la vista con el viewmodel
@Composable
fun ClimaPage(
    modifier: Modifier = Modifier
) {
    val viewModel = ClimaViewModel()

    ClimaView(
        modifier = Modifier,
        estado = viewModel.estado

    ){
        viewModel.ejecutar(it)
    }


}