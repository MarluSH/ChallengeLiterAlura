package com.LiterAlura.Challenge.Service;


import com.LiterAlura.Challenge.Model.Autor;
import com.LiterAlura.Challenge.Repository.AutorRepository;
import com.LiterAlura.Challenge.dto.AutorDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AutorServicio {
    @Autowired
    private AutorRepository repository;

    public List<AutorDto> obtenerTodosLosAutores() {
        return convierteDatos(repository.findAll());
    }

    public List<AutorDto> convierteDatos(List<Autor> autor) {
        return autor.stream()
                .map(a -> new AutorDto(
                        a.getId(),
                        a.getNombre(),
                        a.getNacimiento(),
                        a.getDeceso()
                ))
                .collect(Collectors.toList());
    }
}