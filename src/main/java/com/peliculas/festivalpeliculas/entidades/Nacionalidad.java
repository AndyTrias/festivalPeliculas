package com.peliculas.festivalpeliculas.entidades;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Entity
@Table(name="nacionalidad")
@NoArgsConstructor
public class Nacionalidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    public String nombre;
}
