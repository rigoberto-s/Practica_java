package com.practica.prestamos.features.prestamos;

import java.time.LocalDate;

import lombok.Data;

@Data
public class PrestamoResponse {

    private Long id;

    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;

    //datos del usuario, solo lo que interesa el nobre
    private String nombreUsuario;

    //datos del libro, solo nombre y isbn
    private String tituloLibro;
    private String isbnLibro;

}
