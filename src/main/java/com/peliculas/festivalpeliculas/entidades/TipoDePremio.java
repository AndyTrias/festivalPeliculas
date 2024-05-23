package com.peliculas.festivalpeliculas.entidades;

import jakarta.persistence.*;
import lombok.Generated;
import lombok.NoArgsConstructor;

@Entity
@Table(name="tipo_de_premio")
@NoArgsConstructor
public class TipoDePremio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column
    private String nombre;

    @Column(length = 100)
    private String descripcion;
}
