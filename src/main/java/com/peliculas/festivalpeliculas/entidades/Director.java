package com.peliculas.festivalpeliculas.entidades;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "director")
@NoArgsConstructor
@Getter
@Setter
public class Director extends Persona{

    @Embedded
    private Biografia biografia;

    @Column
    private String sitioWeb;

    @Column
    private String estiloCinematografica;
}
