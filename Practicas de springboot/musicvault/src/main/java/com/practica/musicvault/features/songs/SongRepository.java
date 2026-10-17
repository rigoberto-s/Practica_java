package com.practica.musicvault.features.songs;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface SongRepository extends JpaRepository<Song, Integer>{

    //? Estos comentarios son especiales ya que son temas en los que debo de practicar, en este caso aprender a usar los nombres
    //? comninar las palabras ver como usarlos, practicar etc
    // aqui el nombre que le pusiste al parametro podriamos usar como le pusismos en la tabla es decir?
    // en lugar de userId tambien seria valido user_id?
    //o puedo poner el que sea, o cual es el estandar?
    //buscar todas las canciones de un usuario en especifico
    public List<Song> findAllByUserId(Integer userId);

    //buscar las canciones por un genero
    public List<Song> findAllByGenreId(Integer genreId);

    //buscar canciones de un usuario por la fecha añadida
    public List<Song> findAllByAddDateAndUserId(LocalDate addedDate, Integer userId);

    //buscar canciones favoritas de un usuario
    // Si aqui queremos todas las canciones fevpritas de un suario por que no pusismos el All?
    List<Song> findByFavoriteAndUserId(Boolean favorite, Integer userId);

}
