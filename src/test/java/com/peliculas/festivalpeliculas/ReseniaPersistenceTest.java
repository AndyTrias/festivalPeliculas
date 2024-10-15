package com.peliculas.festivalpeliculas;

import com.peliculas.festivalpeliculas.entidades.Director;
import com.peliculas.festivalpeliculas.entidades.Pelicula;
import com.peliculas.festivalpeliculas.entidades.Resenia;
import com.peliculas.festivalpeliculas.repositorios.PeliculaRepository;
import com.peliculas.festivalpeliculas.repositorios.ReseniaRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ActiveProfiles("test")
public class ReseniaPersistenceTest {

    @Autowired
    private ReseniaRepository reseniaRepository;

    @Autowired
    private PeliculaRepository peliculaRepository;

    @DisplayName("Se puede instanciar una pelicula y guardar en la base de datos")
    @Test
    void sePuedeCreateUnaReseniaTest()
    {

        Pelicula pelicula = new Pelicula();
        pelicula.setNombre("Star wars");
        pelicula.setDirector(null);
        peliculaRepository.save(pelicula);



        Resenia resenia = new Resenia();
        resenia.setCalificacion(5.0F);
        resenia.setPelicula(pelicula);
        reseniaRepository.save(resenia);

        assertEquals(5.0F, reseniaRepository.findByPeliculaNombre("Star wars").getCalificacion());
    }
}
