package com.example.exception

import java.time.LocalDateTime

data class ErrorMessage(
    val msg: String?,
    val dataHora: String = LocalDateTime.now().toString()){

}
