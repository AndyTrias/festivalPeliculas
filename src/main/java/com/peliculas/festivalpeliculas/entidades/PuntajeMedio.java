package com.peliculas.festivalpeliculas.entidades;

import java.util.Comparator;
import java.util.List;

public class PuntajeMedio implements CalculadorDePuntaje{
    @Override
    public float devolverPuntaje(List<Resenia> resenia) {
        resenia.sort(Comparator.comparing(Resenia::getCalificacion));

        return resenia.get(resenia.size() / 2).getCalificacion();
    }
}
