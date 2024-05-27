package com.peliculas.festivalpeliculas.entidades;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "premio")
@NoArgsConstructor
public class Premio extends Persistente{

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

    @ManyToOne()
    private TipoDePremio tipoDePremio;

    @Column
    private Float monto_otorgado;
}
