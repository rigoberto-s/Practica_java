package com.practica.prestamos.features.prestamos;

import org.springframework.stereotype.Service;

import com.practica.prestamos.features.libros.Libro;
import com.practica.prestamos.features.libros.LibroRepository;
import com.practica.prestamos.features.usuarios.Usuario;
import com.practica.prestamos.features.usuarios.UsuarioRepository;

@Service
public class PrestamoServiceImplementacion implements PrestamoService{

    private final PrestamoRepository prestamoRepository;
    private final UsuarioRepository usuarioRepository;
    private final LibroRepository libroRepository;

    public PrestamoServiceImplementacion(PrestamoRepository prestamoRepository, UsuarioRepository usuarioRepository, LibroRepository libroRepository){
        this.prestamoRepository=prestamoRepository;
        this.usuarioRepository=usuarioRepository;
        this.libroRepository=libroRepository;
    }

    @Override
    public PrestamoResponse prestarLibro(Long usaurio_id, Long libro_id) {
        
        Usuario usuarioEncontrado = usuarioRepository.findById(usaurio_id).orElseThrow(()-> new RuntimeException("Error usuario no encontrado"));
        Libro libroEncontrado = libroRepository.findById(libro_id).orElseThrow(()-> new RuntimeException("Error libro no encontrado"));

        Prestamo nuevoPrestamo = new Prestamo();

        nuevoPrestamo.setUsuario(usuarioEncontrado);
        nuevoPrestamo.setLibro(libroEncontrado);

        Prestamo guardado = prestamoRepository.save(nuevoPrestamo);

        PrestamoResponse respuesta = new PrestamoResponse();

        respuesta.setId(guardado.getId());
        respuesta.setFechaPrestamo(guardado.getFechaPrestamo());
        respuesta.setFechaDevolucion(guardado.getFechaDevolucion());
        respuesta.setNombreUsuario(usuarioEncontrado.getNombre());
        respuesta.setTituloLibro(libroEncontrado.getNombre());
        respuesta.setIsbnLibro(libroEncontrado.getIsbn());

        return respuesta;
        
    }

}
