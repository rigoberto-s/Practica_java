package com.practica.prestamos.features.libros;

import java.util.List;

public interface LibroService {

    public List<Libro> obtenerTodosLibros();
    public Libro guardarLibro(Libro libro);

}
