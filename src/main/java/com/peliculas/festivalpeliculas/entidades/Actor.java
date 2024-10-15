package com.peliculas.festivalpeliculas.entidades;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name="actor")
@NoArgsConstructor
@Getter
@Setter
public class Actor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nombre;

    @Column
    private String apellido;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Nacionalidad nacionalidad;

    @ManyToMany(mappedBy = "actores")
    private List<Pelicula> peliculas;
}
