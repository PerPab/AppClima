package com.example.appclima.presentacion

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun ClimaView(
    modifier: Modifier = Modifier,
    estado: ClimaEstado,
    ejecutar: (ClimaIntencion) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp)
    ){
        when(estado){
            is ClimaEstado.Cargando -> cargandoView()
            is ClimaEstado.Error -> errorView(estado.mensaje)
            is ClimaEstado.Exitoso -> exitosoView(estado.clima)
            is ClimaEstado.Vacio -> vacioView()
        }

        Button(onClick = {
            ejecutar(ClimaIntencion.buscar)
        })
        {
            Text(text = "Buscar")
        }
    }

}

@Composable
fun cargandoView(){
    Text(text = "Cargando ...")

}

@Composable
fun errorView(mensaje: String){
    Text(text = mensaje)

}

@Composable
fun exitosoView(clima: String){

}

@Composable
fun vacioView(){
    Text(text = "No hay nada que mostrar")

}

@Preview
@Composable
fun cargandoPreview(){
    ClimaView(estado = ClimaEstado.Cargando) {
        
    }

}

@Preview
@Composable
fun errorPreview(){
    ClimaView(estado = ClimaEstado.Error(mensaje = "Fallo")) {
        
    }
}

@Preview
@Composable
fun vacioPreview(){
    ClimaView(estado = ClimaEstado.Vacio) {
        
    }

}

@Preview
@Composable
fun exitosoPreview(){


}