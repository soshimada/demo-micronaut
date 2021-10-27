package com.example.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bJ\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eJ\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/example/services/UsuarioService;", "", "usuarioRepository", "Lcom/example/repository/UsuarioRepository;", "(Lcom/example/repository/UsuarioRepository;)V", "addUsuario", "Lcom/example/model/Usuario;", "usuario", "deleteUsuario", "", "id", "", "getUsuarioPorId", "getUsuarios", "", "updateUsuario", "ProjetoKotlin"})
@jakarta.inject.Singleton()
public class UsuarioService {
    private final com.example.repository.UsuarioRepository usuarioRepository = null;
    
    public UsuarioService(@org.jetbrains.annotations.NotNull()
    com.example.repository.UsuarioRepository usuarioRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.model.Usuario> getUsuarios() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.model.Usuario getUsuarioPorId(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.model.Usuario addUsuario(@org.jetbrains.annotations.NotNull()
    com.example.model.Usuario usuario) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.transaction.Transactional()
    public com.example.model.Usuario updateUsuario(long id, @org.jetbrains.annotations.NotNull()
    com.example.model.Usuario usuario) {
        return null;
    }
    
    public final void deleteUsuario(long id) {
    }
}