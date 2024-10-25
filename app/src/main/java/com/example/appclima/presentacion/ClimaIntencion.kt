package com.example.appclima.presentacion

sealed class ClimaIntencion {
    data object actualiza: ClimaIntencion()
    data object buscar: ClimaIntencion()
    data object guardar: ClimaIntencion()


}