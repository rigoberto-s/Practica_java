package com.practica.musicvault.features.genres;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface GenreRepository extends JpaRepository<Genre, Integer>{
    
    public Genre findByName(String name);
    
}
