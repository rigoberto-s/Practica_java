package com.practica.musicvault.features.songs;

import java.time.LocalDate;
import java.util.List;

public interface SongService {

    //CRUD operaciones basicas
    List<Song> getAllSongs();

    Song getSongById(Integer id);

    Song saveSong(Song song);

    void deleteSong(Integer id);

    //Metodos con filtros personalizados

    List<Song> getSongByUser(Integer userId);

    List<Song> getSongByGenre(Integer genreId); 

    List<Song> getSongsByAddDateAndUser(LocalDate localDate, Integer userId);

    List<Song> getFavoriteSongByUser(Boolean favorite, Integer idUser);

}
