package com.peliculas.festivalpeliculas.entidades;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "premio")
@NoArgsConstructor
public class Premio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Evento evento;

    @Column
    private Integer cantidadDeVotos;

    @ManyToMany()
    @JoinTable(
            name = "peliculas_nominadas",
            joinColumns = {@JoinColumn(name = "premio_id")},
            inverseJoinColumns = {@JoinColumn(name = "pelicula_id")}
    )
    private List<Pelicula> peliculasNominadas;

    @ManyToOne(cascade = CascadeType.MERGE)
    private TipoDePremio tipoDePremio;
}
