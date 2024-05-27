package com.peliculas.festivalpeliculas.entidades;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

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

    @ElementCollection
    @CollectionTable(name = "patrocinador_x_evento", joinColumns = @JoinColumn(name = "evento_id"))
    @Column(name = "patrocinador")
    private List<String> patrocinadores;

    @Column
    private LocalDate fecha_evento;

    @Embedded
    private Direccion direccion;
}

