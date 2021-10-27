package com.example.controller

import com.example.model.Usuario
import com.example.services.UsuarioService
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.*
import jakarta.inject.Inject


@Controller("/user")
class UserController(@Inject val usuarioService: UsuarioService) {

    @Get
    fun getUsuario() : List<Usuario>{
        return usuarioService.getUsuarios()
    }

    @Get("{id}")
    fun getUsuarioById(@PathVariable id: Long) : Usuario?{
        return usuarioService.getUsuarioPorId(id)
    }

    @Post
    fun postUsuario(@Body usuario:Usuario) : HttpResponse<Usuario>{
        var result = usuarioService.addUsuario(usuario)
        return HttpResponse.created(result)
    }

    @Put("{id}")
    fun putUsuario(@PathVariable id: Long, @Body usuario:Usuario): HttpResponse<Usuario>{
        var result = usuarioService.updateUsuario(id, usuario)
        return HttpResponse.ok(result)
    }

    @Delete("{id}")
    fun deleteUsuario(@PathVariable id: Long) : HttpResponse<Unit>{
        usuarioService.deleteUsuario(id)
        return HttpResponse.noContent()
    }
}