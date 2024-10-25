package com.example.appclima.presentacion

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.appclima.repositorio.NetworkRepositorio
import com.example.appclima.repositorio.Repositorio
import kotlinx.coroutines.launch

class ClimaViewModel: ViewModel() {

    var repositorio = NetworkRepositorio()
    var estado by mutableStateOf<ClimaEstado>(ClimaEstado.Vacio)
    // unica función publica
     fun ejecutar(intencion: ClimaIntencion){

        when(intencion){
            is ClimaIntencion.actualiza -> actualizaClima()
            is ClimaIntencion.buscar -> TODO()
            is ClimaIntencion.guardar -> TODO()
        }

    }

    fun actualizaClima(){

        estado = ClimaEstado.Cargando

        viewModelScope.launch {
            var clima = repositorio.getData()
            estado = ClimaEstado.Exitoso(clima)
        }
    }





}
