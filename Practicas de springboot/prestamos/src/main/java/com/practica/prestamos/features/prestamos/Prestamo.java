package com.practica.prestamos.features.prestamos;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.cglib.core.Local;

import com.practica.prestamos.features.libros.Libro;
import com.practica.prestamos.features.usuarios.Usuario;

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
@Table(name = "prestamo")
public class Prestamo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @CreationTimestamp
    private LocalDate fechaPrestamo;

    private LocalDate fechaDevolucion;

    @JoinColumn(name = "usuario_id")
    @ManyToOne
    private Usuario usuario;

    @JoinColumn(name = "libro_id")
    @ManyToOne
    private Libro libro;
}
