package com.peliculas.festivalpeliculas.repositorios;

import com.peliculas.festivalpeliculas.entidades.Pelicula;

public interface PeliculaRepositorioCustom {
    Pelicula findBynombre(String nombre);
}
