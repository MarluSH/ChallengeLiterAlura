package com.LiterAlura.Challenge.Repository;

import com.LiterAlura.Challenge.Model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LibroRepository extends JpaRepository<Libro,Long> {
    Optional<Libro> findByTituloContainingIgnoreCase(String nombreLibro);
}