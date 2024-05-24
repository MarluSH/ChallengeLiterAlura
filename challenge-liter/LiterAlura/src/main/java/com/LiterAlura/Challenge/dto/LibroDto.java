package com.LiterAlura.Challenge.dto;

import com.LiterAlura.Challenge.Model.Autor;

public record LibroDto(
        Long Id,
        String titulo,
        Autor autor,
        String idioma,
        Double descargas
) {
}
