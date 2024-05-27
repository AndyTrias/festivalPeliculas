package com.peliculas.festivalpeliculas.entidades;

import java.util.List;

public class PuntajePromedio implements CalculadorDePuntaje{
    @Override
    public float devolverPuntaje(List<Resenia> resenia) {
        return (float) resenia.stream().mapToDouble(Resenia::getCalificacion).sum()
                / resenia.size();
    }
}
