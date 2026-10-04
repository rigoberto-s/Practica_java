package com.practica.musicvault.features.songs;

import java.time.LocalDate;

import com.practica.musicvault.features.genres.Genre;
import com.practica.musicvault.features.users.User;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity 
@Table(name="songs")
@Getter 
@Setter 
@NoArgsConstructor 
@AllArgsConstructor 
public class Song {
    
    @Id 
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable=false, length=150)
    private String title;

    @Column(nullable=false, length=100)
    private String artist;

    @Column(nullable=false)
    private Integer duration;

    @Column(nullable=false)
    private Boolean favorite;

    @Column(nullable=false)
    private LocalDate addDate;

    //relacion
    @ManyToOne 
    @JoinColumn(name="user_id",nullable=false)
    private User user;

    @ManyToOne 
    @JoinColumn(name="genre_id", nullable=false)
    private Genre genre;
    
}
