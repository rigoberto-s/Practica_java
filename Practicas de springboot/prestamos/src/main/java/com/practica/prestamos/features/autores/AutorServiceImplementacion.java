package com.practica.prestamos.features.autores;

import java.util.List;


import org.springframework.stereotype.Service;

@Service
public class AutorServiceImplementacion implements AutorService{

    //quite final por que me decian que debo poner Autowirre para inyeccion de dependencias
    private final AutorRepository autorRepository;

    public AutorServiceImplementacion(AutorRepository autorRepository){
        this.autorRepository=autorRepository;
    }

    //para encontrar todos los autores
    @Override
    public List<Autor> obtenerTodosAutores(){
        return autorRepository.findAll();
    }

    
    //metodo para guardar un autor
    @Override
    public Autor guardarAutor(Autor autor){
        return autorRepository.save(autor);
    }
}
