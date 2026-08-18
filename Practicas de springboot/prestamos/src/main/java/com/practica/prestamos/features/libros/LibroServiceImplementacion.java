package com.practica.prestamos.features.libros;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class LibroServiceImplementacion implements LibroService{

    private final LibroRepository libroRepository;

    public LibroServiceImplementacion(LibroRepository libroRepository){
        this.libroRepository=libroRepository;
    }

    @Override
    public List<Libro> obtenerTodosLibros() {
        return libroRepository.findAll();
    }

    @Override
    public Libro guardarLibro(Libro libro) {
       return libroRepository.save(libro);
    }

}
