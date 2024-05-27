package com.peliculas.festivalpeliculas.entidades;

import jakarta.persistence.*;

@Entity
public class TipoDePremio extends Persistente {

    @Enumerated(EnumType.STRING)
    private Tipo tipoDePremio;

    @Column
    private Float montoOtorgado;
}
