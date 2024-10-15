package com.peliculas.festivalpeliculas.entidades;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name="pelicula")
@NoArgsConstructor
@Getter
@Setter
public class Pelicula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nombre;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "director_id")
    private Director director;

    @OneToMany(mappedBy = "pelicula", cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.REMOVE})
    private List<Resenia> resenias;

    @ManyToMany(cascade = CascadeType.PERSIST)
    private List<Actor> actores;

    @Transient
    private Integer duracionEnMinutos;

    @ManyToOne()
    private Genero genero;

    @OneToMany()
    @JoinColumn(name="pelicula_ganadora_id")
    private List<Premio> premioGanados;
}

