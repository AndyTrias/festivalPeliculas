package com.peliculas.festivalpeliculas.repositorios;

import com.peliculas.festivalpeliculas.entidades.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActorRepository extends JpaRepository<Actor, Long> {
    Actor findByNombre(String name);

}
