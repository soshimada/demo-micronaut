package com.example.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Usuario(
              @Id
              @GeneratedValue(strategy = GenerationType.AUTO)
              var id: Long,
              var nome: String,
              var email: String
              )
{

    fun AtualizaNome(value: String){
        this.nome = value
    }

    fun AtualizaEmail(value: String){
        this.email = value
    }
}