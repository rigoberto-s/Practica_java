package com.practica.prestamos.features.prestamos;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/prestamos")
public class PrestamoController {

    private final PrestamoService prestamoService;

    public PrestamoController(PrestamoService prestamoService){
        this.prestamoService=prestamoService;
    }


    @PostMapping
    public ResponseEntity<Prestamo> prestar(@RequestBody PrestamoRequest request){

        Prestamo p1 = prestamoService.prestarLibro(request.getUsuarioId(), request.getLibroId());
        return ResponseEntity.status(HttpStatus.CREATED).body(p1);
    }
}
