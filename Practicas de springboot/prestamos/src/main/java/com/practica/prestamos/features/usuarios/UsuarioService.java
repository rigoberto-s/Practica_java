package com.practica.prestamos.features.usuarios;

import java.util.List;

public interface UsuarioService {

    public List<Usuario> obtenerTodosUsuarios();
    public Usuario guardarUsuario(Usuario usuario);

}
