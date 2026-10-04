package com.practica.musicvault.features.genres;

import java.util.List;

import org.springframework.stereotype.Service;

@Service 
public class GenreServiceImplements implements GenreService{

    //instancia
    private final GenreRepository genreRepository;

    //inyeccion por contructor
    public GenreServiceImplements(GenreRepository genreRepository){
        this.genreRepository=genreRepository;
    }

    @Override
    public List<Genre> getAllGenres() {
        return genreRepository.findAll();
    }

    @Override
    public Genre saveGenre(Genre genre) {
        return genreRepository.save(genre);
    }

    //? practicar validaciones como esta
    @Override
    public void deleteGenre(Integer id) {
        
        Genre genre = genreRepository.findById(id).orElse(null);

        if(genre != null){
            genreRepository.delete(genre);
        }
    }


}