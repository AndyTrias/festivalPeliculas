package com.peliculas.festivalpeliculas;

import com.peliculas.festivalpeliculas.entidades.Actor;
import com.peliculas.festivalpeliculas.entidades.Nacionalidad;
import com.peliculas.festivalpeliculas.repositorios.ActorRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ActiveProfiles("test")
public class ActorPersistenceTest {

    @Autowired
    private ActorRepository actorRepository;

    @Test
    void sePuedeGuardarUnActor() {
        Nacionalidad nacionalidad = new Nacionalidad();
        nacionalidad.setNombre("Argentino");

        Actor actor = new Actor();
        actor.setNombre("Guillermo");
        actor.setApellido("Francella");
        actor.setNacionalidad(nacionalidad);

        actorRepository.save(actor);

        assertEquals("Guillermo", actorRepository.findByNombre("Guillermo").getNombre());
        // Validar la nacionalidad
        // Validar el apellido
    }
}

