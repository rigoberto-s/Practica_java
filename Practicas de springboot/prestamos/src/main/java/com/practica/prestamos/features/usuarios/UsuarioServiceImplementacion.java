package com.practica.prestamos.features.usuarios;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImplementacion implements UsuarioService{

    private final UsuarioRepository usuarioRepository;

    public UsuarioServiceImplementacion(UsuarioRepository usuarioRepository){
        this.usuarioRepository=usuarioRepository;
    }

    @Override
    public List<Usuario> obtenerTodosUsuarios() {
        return usuarioRepository.findAll();
    }

    @Override
    public Usuario guardarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }


}
