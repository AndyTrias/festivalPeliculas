package com.peliculas.festivalpeliculas;

import com.peliculas.festivalpeliculas.entidades.Evento;
import com.peliculas.festivalpeliculas.entidades.Premio;
import com.peliculas.festivalpeliculas.entidades.TipoDePremio;
import com.peliculas.festivalpeliculas.repositorios.PremioRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ActiveProfiles("test")
public class PremioPersistenceTest {

    @Autowired
    private PremioRepository premioRepository;

    @Test
    void sePuedeGuardarUnPremio() {
        TipoDePremio tipoDePremio = new TipoDePremio();
        tipoDePremio.setNombre("Mejor Pelicula");

        Evento evento = new Evento();
        evento.setNombre("Academy Awards");
        evento.setEdicion(2024);
        evento.setLugar("Los Angeles");
        evento.setUrlImagen("https://example.com/image.jpg");

        Premio premio = new Premio();
        premio.setTipoDePremio(tipoDePremio);
        premio.setEvento(evento);
        premio.setCantidadDeVotos(5000);

        premioRepository.save(premio);

        assertEquals("Mejor Pelicula", premioRepository.findByTipoDePremioNombre("Mejor Pelicula").getTipoDePremio().getNombre());
        // Validar mas atributos del premio
        // Validar atributos del evento como el nombre o edicion
    }
}

