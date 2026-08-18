package com.practica.prestamos.features.usuarios;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practica.prestamos.features.autores.Autor;

@RestController
@RequestMapping("api/usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService;

    
    public UsuarioController(UsuarioService usuarioService){
        this.usuarioService=usuarioService;
    }

    @GetMapping
    public ResponseEntity<List<Usuario>> obtenerTodosLosUsuarios(){
        return ResponseEntity.ok(usuarioService.obtenerTodosUsuarios());
    }

    @PostMapping
    public ResponseEntity<Usuario> crearUsuario(@RequestBody Usuario usuario){
        Usuario usuarioNuevo = usuarioService.guardarUsuario(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioNuevo);
    }

}
