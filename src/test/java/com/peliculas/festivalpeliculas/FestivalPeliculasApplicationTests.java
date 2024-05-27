package com.peliculas.festivalpeliculas;

import com.peliculas.festivalpeliculas.entidades.*;
import com.peliculas.festivalpeliculas.repositorios.PeliculaRepositorio;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class FestivalPeliculasApplicationTests {

    @Autowired
    private PeliculaRepositorio peliculaRepositorio;

    @Test
    void crearPelicula() {

        Biografia biografia = new Biografia();
        biografia.setResumen("este deberia ser el resumen");

        Director director = new Director();
        director.setNombre("Gore");
        director.setApellido("Verbinski");
        director.setBiografia(biografia);

        PeliculaLargometraje pelicula = new PeliculaLargometraje();
        pelicula.setNombre("Piratas del Caribe");
        pelicula.setDirector(director);
        pelicula.setPresupuesto(BigDecimal.valueOf(12345L));
        pelicula.setCalculador(new PuntajeMedio());


        peliculaRepositorio.save(pelicula);

        assertEquals("Piratas del Caribe", peliculaRepositorio.findByNombre("Piratas del Caribe").getNombre());


    }

}
