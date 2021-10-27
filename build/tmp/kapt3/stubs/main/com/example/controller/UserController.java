package com.example.controller;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0007J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0007J\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\b2\b\b\u0001\u0010\u0011\u001a\u00020\u000eH\u0007J\"\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\b2\b\b\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\u0011\u001a\u00020\u000eH\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0013"}, d2 = {"Lcom/example/controller/UserController;", "", "usuarioService", "Lcom/example/services/UsuarioService;", "(Lcom/example/services/UsuarioService;)V", "getUsuarioService", "()Lcom/example/services/UsuarioService;", "deleteUsuario", "Lio/micronaut/http/HttpResponse;", "", "id", "", "getUsuario", "", "Lcom/example/model/Usuario;", "getUsuarioById", "postUsuario", "usuario", "putUsuario", "ProjetoKotlin"})
@io.micronaut.http.annotation.Controller(value = "/user")
public final class UserController {
    @org.jetbrains.annotations.NotNull()
    @jakarta.inject.Inject()
    private final com.example.services.UsuarioService usuarioService = null;
    
    public UserController(@org.jetbrains.annotations.NotNull()
    com.example.services.UsuarioService usuarioService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.services.UsuarioService getUsuarioService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Get()
    public final java.util.List<com.example.model.Usuario> getUsuario() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @io.micronaut.http.annotation.Get(value = "{id}")
    public final com.example.model.Usuario getUsuarioById(@io.micronaut.http.annotation.PathVariable()
    long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Post()
    public final io.micronaut.http.HttpResponse<com.example.model.Usuario> postUsuario(@org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Body()
    com.example.model.Usuario usuario) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Put(value = "{id}")
    public final io.micronaut.http.HttpResponse<com.example.model.Usuario> putUsuario(@io.micronaut.http.annotation.PathVariable()
    long id, @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Body()
    com.example.model.Usuario usuario) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Delete(value = "{id}")
    public final io.micronaut.http.HttpResponse<kotlin.Unit> deleteUsuario(@io.micronaut.http.annotation.PathVariable()
    long id) {
        return null;
    }
}