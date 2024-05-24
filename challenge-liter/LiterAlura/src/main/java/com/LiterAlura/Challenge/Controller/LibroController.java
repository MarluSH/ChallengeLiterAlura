package com.LiterAlura.Challenge.Controller;

import com.LiterAlura.Challenge.Service.LibroServicio;
import com.LiterAlura.Challenge.dto.LibroDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/libros")
public class LibroController {
    @Autowired
    private LibroServicio servicio;

    @GetMapping()
    public List<LibroDto> obtenerTodosLosLibros(){
        return servicio.obtenerTodosLosLibros();
    }
}

