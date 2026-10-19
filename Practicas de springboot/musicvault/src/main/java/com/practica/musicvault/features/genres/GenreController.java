package com.practica.musicvault.features.genres;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/genres")
public class GenreController {

    private final GenreService genreService;

    public GenreController(GenreService genreService){
        this.genreService=genreService;
    }


    //obtener todos los generos
    @GetMapping
    public ResponseEntity<List<Genre>> getAllGenres(){

        return ResponseEntity.ok(genreService.getAllGenres());
    }

    //crear nuevo genero
    




}
