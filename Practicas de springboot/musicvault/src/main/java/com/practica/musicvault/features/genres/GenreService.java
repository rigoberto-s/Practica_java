package com.practica.musicvault.features.genres;

import java.util.List;

public interface GenreService {

    public List<Genre> getAllGenres();

    public Genre saveGenre(Genre genre);

    public void deleteGenre(Integer id);
}
