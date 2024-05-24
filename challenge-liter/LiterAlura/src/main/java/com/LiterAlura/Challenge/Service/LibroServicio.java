package com.LiterAlura.Challenge.Service;

import com.LiterAlura.Challenge.Model.Libro;
import com.LiterAlura.Challenge.Repository.LibroRepository;
import com.LiterAlura.Challenge.dto.LibroDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LibroServicio {
    @Autowired
    private LibroRepository repository;

    public List<LibroDto> obtenerTodosLosLibros() {
        return convierteDatos(repository.findAll());
    }

    public List<LibroDto> convierteDatos(List<Libro> libro) {
        return libro.stream()
                .map(l -> new LibroDto(
                        l.getId(),
                        l.getTitulo(),
                        l.getAutor(),
                        l.getIdioma(),
                        l.getDescargas()
                ))
                .collect(Collectors.toList());
    }
}