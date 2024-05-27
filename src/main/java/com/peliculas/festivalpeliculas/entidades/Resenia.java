package com.peliculas.festivalpeliculas.entidades;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="resenia")
@NoArgsConstructor
@Getter
@Setter
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
