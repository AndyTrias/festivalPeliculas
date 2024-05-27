package com.peliculas.festivalpeliculas.entidades;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class Direccion {

    private String calle;

    private Integer numero;

    private String ciudad;

    @Embedded
    private Pais pais;
}
