package com.peliculas.festivalpeliculas.entidades;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@DiscriminatorValue(value = "cortometraje")
@Entity
@Table(name = "cortometraje")
public class PeliculaCortometraje extends Pelicula{
    @Enumerated(EnumType.STRING)
    private TipoProyecto tipoProyecto;

    @Column
    private Integer duracionEnminutos;

    @Column
    private String institucionAcademica;
}
