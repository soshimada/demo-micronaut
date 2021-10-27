package com.example.services

import com.example.exception.RegistroNaoEncontradoException
import com.example.model.Usuario
import com.example.repository.UsuarioRepository
import jakarta.inject.Singleton
import javax.transaction.Transactional

@Singleton
open class UsuarioService(private val usuarioRepository:UsuarioRepository)
{
    fun getUsuarios() : List<Usuario> {
        return usuarioRepository.findAll()
    }

    fun getUsuarioPorId(id: Long) : Usuario {
        return usuarioRepository.findById(id).orElseThrow{
            RegistroNaoEncontradoException("Registro náo encontrado.")
        }
    }

    fun addUsuario(usuario: Usuario) : Usuario{
        return usuarioRepository.save(usuario)
    }
    @Transactional
    open fun updateUsuario(id :Long, usuario: Usuario): Usuario {
        var usuarioAtual = getUsuarioPorId(id)
        usuarioAtual.AtualizaEmail(usuario.email)
        usuarioAtual.AtualizaNome(usuario.nome)

        return usuarioRepository.save(usuarioAtual)
    }
    fun deleteUsuario(id: Long) {
        var usuarioAtual = getUsuarioPorId(id)
        usuarioRepository.delete(usuarioAtual)
    }

}