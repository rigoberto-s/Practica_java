package com.practica.prestamos.core.exceptions;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<Map<String,String>> manejarErrorer(RuntimeException ex){

        Map<String,String> respuesta = new HashMap<>();
        respuesta.put("Error ", "Datos no encontrados");
        respuesta.put("Ese es el fakiu error", ex.getMessage());

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(respuesta);
        
    }   
}
