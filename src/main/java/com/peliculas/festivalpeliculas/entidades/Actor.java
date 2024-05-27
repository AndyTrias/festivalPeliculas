package com.peliculas.festivalpeliculas.entidades;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name="actor")
@NoArgsConstructor
public class Actor extends Persona{

    @ManyToMany(mappedBy = "actores")
    private List<Pelicula> peliculas;

    @ElementCollection
    @Column(name = "rol")
    private List<String> rolesDestacados;
}
