package com.practica.melody.features.genres;

import java.util.List;

public interface GenreService {

    public List<Genre> getAllGenres();
    public Genre getGenreById(Integer id);
    public Genre saveGenre(Genre genre);
    public void deleteGenre(Integer id);
}
