package com.peliculas.festivalpeliculas.entidades;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@DiscriminatorValue(value = "largometraje")
@Entity
@Table(name = "largometraje")
public class PeliculaLargometraje extends Pelicula {

    @Column
    private BigDecimal presupuesto;

    @Column
    private BigDecimal taquillaGlobal;

    @Column
    private LocalDate fechaEstreno;

    @ElementCollection
    @CollectionTable(name = "formatos_x_pelicula", joinColumns = @JoinColumn(name = "formato_id"))
    @Enumerated(value = EnumType.STRING)
    @Column(name = "formato")
    private List<FormatoDeProyeccion> formatos;
}
