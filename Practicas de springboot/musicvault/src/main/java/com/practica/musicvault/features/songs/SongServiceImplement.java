package com.practica.musicvault.features.songs;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

@Service 
public class SongServiceImplement implements SongService{


    private final SongRepository songRepository;

    //inyeccion de dependencias por constructores
    public SongServiceImplement(SongRepository songRepository){
        this.songRepository=songRepository;
    }

    @Override
    public List<Song> getAllSongs() {

        return songRepository.findAll();
    }

    @Override
    public Song getSongById(Integer id) {
        return songRepository.findById(id).orElse(null);
    }

    @Override
    public Song saveSong(Song song) {
        return songRepository.save(song);
    }

    @Override
    public void deleteSong(Integer id) {
        
        Song s = songRepository.findById(id).orElse(null);
        if( s != null){
            songRepository.delete(s);
        }
    }

    @Override
    public List<Song> getSongByUser(Integer userId) {
        return songRepository.findAllByUserId(userId);
    }

    @Override
    public List<Song> getSongByGenre(Integer genreId) {
        return songRepository.findAllByGenreId(genreId);
    }

    @Override
    public List<Song> getSongsByAddDateAndUser(LocalDate localDate, Integer userId) {
    
        return songRepository.findAllByAddDateAndUserId(localDate, userId);
    }

    @Override
    public List<Song> getFavoriteSongByUser(Boolean favorite, Integer idUser) {
        return songRepository.findByFavoriteAndUserId(favorite, idUser);
    }



}
