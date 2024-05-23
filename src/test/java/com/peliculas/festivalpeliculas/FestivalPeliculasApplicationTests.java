package com.peliculas.festivalpeliculas;

import com.peliculas.festivalpeliculas.entidades.Director;
import com.peliculas.festivalpeliculas.entidades.Pelicula;
import com.peliculas.festivalpeliculas.repositorios.PeliculaRepositorio;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class FestivalPeliculasApplicationTests {

    @Autowired
    private PeliculaRepositorio peliculaRepositorio;

    @Test
    void crearPelicula() {

        Director director = new Director();
        director.setNombre("Gore");
        director.setApellido("Verbinski");

        Pelicula pelicula = new Pelicula();
        pelicula.setNombre("Piratas del Caribe");
        pelicula.setDuracionEnMinutos(200);
        pelicula.setDirector(director);

        peliculaRepositorio.save(pelicula);

        assertEquals("Piratas del Caribe", peliculaRepositorio.findByNombre("Piratas del Caribe").getNombre());


    }

}
