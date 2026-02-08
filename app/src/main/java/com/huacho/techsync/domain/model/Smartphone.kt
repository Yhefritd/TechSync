package com.huacho.techsync.domain.model

class Smartphone(
    cliente: String,
    marca: String,
    modelo: String,
    falla: String,
    precioBase: Double,
    val imei: String
) : Dispositivo(cliente, marca, modelo, falla, precioBase) {
    override fun calcularPresupuesto(): Double {
        val costoInsumos = 15.0 //pegamento de pantalla
        return super.calcularPresupuesto() + costoInsumos
    }
}