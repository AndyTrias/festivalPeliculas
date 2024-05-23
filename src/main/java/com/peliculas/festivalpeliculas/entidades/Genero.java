package com.peliculas.festivalpeliculas.entidades;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Entity
@Table(name="genero_de_pelicula")
public class Genero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false, length = 30)
    private String nombre;

    @Transient
    private String descrpcion;

    public Genero() {}


}
