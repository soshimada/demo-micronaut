package com.example.model

import java.math.BigDecimal

data class Conta (
    var id : Long,
    var id_usuario: Long,
    var saldo: BigDecimal
) {
}