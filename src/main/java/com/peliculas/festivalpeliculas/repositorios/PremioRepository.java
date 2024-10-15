package com.peliculas.festivalpeliculas.repositorios;

import com.peliculas.festivalpeliculas.entidades.Premio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PremioRepository extends JpaRepository<Premio, Long> {
    Premio findByTipoDePremioNombre(String nombre);
}
