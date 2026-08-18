package com.practica.prestamos.features.autores;

import java.util.List;

public interface AutorService {

    public List<Autor> obtenerTodosAutores();
    public Autor guardarAutor(Autor autor);

}
