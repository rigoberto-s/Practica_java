package com.practica.prestamos.features.libros;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/libros")
public class LibroController {

    private final LibroService libroService;

    public LibroController(LibroService libroService){
        this.libroService=libroService;
    }

    @GetMapping
    public ResponseEntity<List<Libro>> listarLibros(){
        return ResponseEntity.ok(libroService.obtenerTodosLibros());
    }

    @PostMapping
    public ResponseEntity<Libro> crearLibro(@RequestBody Libro libro){
        Libro l = libroService.guardarLibro(libro);
        return ResponseEntity.status(HttpStatus.CREATED).body(l);
    }

}
