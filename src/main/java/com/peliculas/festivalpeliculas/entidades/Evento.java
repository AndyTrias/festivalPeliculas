package com.peliculas.festivalpeliculas.entidades;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Entity
@Table
@NoArgsConstructor
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Integer edicion;

    @Column
    private String lugar;

    @Column
    private String urlImagen;
}
