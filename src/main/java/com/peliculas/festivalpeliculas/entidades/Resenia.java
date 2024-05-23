package com.peliculas.festivalpeliculas.entidades;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Entity
@Table(name="resenia")
@NoArgsConstructor
public class Resenia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TEXT")
    private String comentario;

    @Column(precision = 10)
    private Float calificacion;

    @ManyToOne()
    @JoinColumn(name="pelicula_id", referencedColumnName = "id")
    private Pelicula pelicula;
}
