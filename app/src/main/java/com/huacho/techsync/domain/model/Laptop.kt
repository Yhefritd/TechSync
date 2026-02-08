package com.huacho.techsync.domain.model

class Laptop(
    cliente: String,
    marca: String,
    modelo: String,
    falla: String,
    precioBase: Double,
    val traeCargador: Boolean
) : Dispositivo(cliente, marca, modelo, falla, precioBase) {
    override fun calcularPresupuesto():Double{
        val costoMantenimientoPreventivo = 30.0
        return super.calcularPresupuesto() + costoMantenimientoPreventivo
    }
}