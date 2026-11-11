package com.practica.melody.features.genres;

import java.util.List;

import org.springframework.stereotype.Service;

@Service 
public class GenreServiceImplementation implements GenreService{

    private final GenreRepository genreRepository;

    public GenreServiceImplementation(GenreRepository genreRepository){
        this.genreRepository=genreRepository;
    }

    @Override
    public List<Genre> getAllGenres() {
        return genreRepository.findAll();
    }

    @Override
    public Genre getGenreById(Integer id) {
        return genreRepository.findById(id).orElse(null);
    }

    @Override
    public Genre saveGenre(Genre genre) {
        return genreRepository.save(genre);
    }

    @Override
    public void deleteGenre(Integer id) {
        Genre g1 = genreRepository.findById(id).orElse(null);
        if(g1 != null){
            genreRepository.delete(g1);
        }
    }

}
