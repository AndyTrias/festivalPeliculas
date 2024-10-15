package com.peliculas.festivalpeliculas.entidades;

import jakarta.persistence.*;
import lombok.Generated;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="tipo_de_premio")
@NoArgsConstructor
@Getter
@Setter
public class TipoDePremio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column
    private String nombre;

    @Column(length = 100)
    private String descripcion;
}
