package com.practica.melody.features.genres;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/api/genres")
public class GenreController {

    private final GenreService genreService;

    public GenreController(GenreService genreService){
        this.genreService=genreService;
    }

    @GetMapping
    public ResponseEntity<List<Genre>> getAllGenres(){
        return ResponseEntity.ok(genreService.getAllGenres());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Genre> getGenreById(@PathVariable Integer id){
        
        Genre genre = genreService.getGenreById(id);

        if(genre != null){
            
            return ResponseEntity.ok(genre);
            
        }
        return ResponseEntity.notFound().build();

    }

    @PostMapping
    public ResponseEntity<Genre> createGenre(@RequestBody Genre genre){

        Genre genreSave = genreService.saveGenre(genre);
        return ResponseEntity.status(HttpStatus.CREATED).body(genreSave);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteGenre(@PathVariable Integer id){

        genreService.deleteGenre(id);
        return ResponseEntity.noContent().build();
    }


}
