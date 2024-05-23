package com.peliculas.festivalpeliculas.repositorios;

import com.peliculas.festivalpeliculas.entidades.Pelicula;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

public class PeliculaRepositorioImpl implements PeliculaRepositorioCustom {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Pelicula findBynombre(String nombre) {
        return (Pelicula) entityManager.createQuery("FROM Pelicula as p where p.nombre= :nombre ")
                .setParameter("nombre", nombre)
                .getResultList()
                .get(0);
    }
}
