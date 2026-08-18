package com.practica.prestamos.features.libros;

import java.time.LocalDate;

import org.hibernate.annotations.ManyToAny;

import com.practica.prestamos.features.autores.Autor;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
@Table(name = "libro")
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,length = 150)
    private String nombre;

    @Column(length = 50, unique = true)
    private String isbn;

    private LocalDate fechaPublicacion;

    @ManyToOne
    @JoinColumn(name = "autor_id")
    private Autor autor;
}
