package com.huacho.techsync.domain.model

import java.util.UUID

open class Dispositivo(
    val cliente: String,
    val marca: String,
    val modelo: String,
    val falla: String,
    val precioBase: Double
) {
    val id = UUID.randomUUID().toString()

    open fun calcularPresupuesto(): Double {
        return precioBase
    }
}