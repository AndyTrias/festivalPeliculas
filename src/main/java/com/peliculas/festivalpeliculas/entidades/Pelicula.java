package com.peliculas.festivalpeliculas.entidades;

import com.peliculas.festivalpeliculas.converters.CalculadorPuntajeConverter;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name="pelicula")
@NoArgsConstructor
@Getter
@Setter
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "tipo_de_pelicula")
public class Pelicula extends Persistente{
    @Column
    private String nombre;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "director_id", nullable = false)
    private Director director;

    @OneToMany(mappedBy = "pelicula", cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.REMOVE})
    private List<Resenia> resenias;

    @ManyToMany(cascade = CascadeType.PERSIST)
    private List<Actor> actores;

    @ManyToOne()
    private Genero genero;

    @OneToMany()
    @JoinColumn(name="pelicula_ganadora_id")
    private List<Premio> premioGanados;

    @Convert(converter = CalculadorPuntajeConverter.class)
    private CalculadorDePuntaje calculador;

    public float puntaje() {
        return calculador.devolverPuntaje(this.getResenias());
    }
}

