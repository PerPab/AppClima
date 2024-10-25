package com.example.appclima.presentacion

sealed class ClimaEstado {
    data object Vacio: ClimaEstado()
    data object Cargando: ClimaEstado()
    //data class Exitoso(val clima: Clima): ClimaEstado()
    data class Exitoso(val clima: String): ClimaEstado()
    data class Error(val mensaje: String): ClimaEstado()
}

// va en el modelo
data class Clima(
    val temp: Double,
    val temp_min: Double,
    val temp_max: Double,
    val pressure: Double,
    val humidity: Double,
    val wind: Double,
    val rain: String
)

/* //busca ciudad
data class Ciudad(
    val name: String,
    val local_names: String,
    val lat: Double,
    val lon: Double,
    val country: String,
    val state: String
)*/