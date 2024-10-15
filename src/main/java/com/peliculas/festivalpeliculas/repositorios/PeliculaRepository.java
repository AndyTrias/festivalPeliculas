package com.peliculas.festivalpeliculas.repositorios;

import com.peliculas.festivalpeliculas.entidades.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeliculaRepository extends JpaRepository<Pelicula, Long> {
    Pelicula findByNombre(String nombre);
    Pelicula findByDirector_Nombre(String nombre);
}
