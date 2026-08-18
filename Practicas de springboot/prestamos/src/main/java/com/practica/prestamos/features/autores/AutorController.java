package com.practica.prestamos.features.autores;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api/autores")
public class AutorController {

    private final AutorService autorService;

    public AutorController(AutorService autorService){
        this.autorService=autorService;
    }


    //enpoint para obtener todos los Autores
    @GetMapping
    public ResponseEntity<List<Autor>> listarAutores(){
        return ResponseEntity.ok(autorService.obtenerTodosAutores());
    }

    //metodo para crear un nuevo autor
    @PostMapping
    public ResponseEntity<Autor> crearAutor(@RequestBody Autor autor){
        Autor nuevoAutor = autorService.guardarAutor(autor);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevoAutor);
    }

}
