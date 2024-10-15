package com.peliculas.festivalpeliculas.repositorios;

import com.peliculas.festivalpeliculas.entidades.Resenia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReseniaRepository extends JpaRepository<Resenia, Long> {
    Resenia findByPeliculaNombre(String name);
}
