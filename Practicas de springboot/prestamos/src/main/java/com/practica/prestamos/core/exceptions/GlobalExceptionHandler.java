package com.practica.prestamos.core.exceptions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
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

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, Object>> manejarValidaciones(MethodArgumentNotValidException ex) {
        // Extraemos todos los mensajes de error de todos los campos inválidos
        List<String> errores = ex.getBindingResult()
                .getFieldErrors()
                .stream()
                .map(campo -> campo.getField() + ": " + campo.getDefaultMessage())
                .toList();
        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("error", "Datos inválidos");
        respuesta.put("mensajes", errores);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(respuesta);
    }

}
