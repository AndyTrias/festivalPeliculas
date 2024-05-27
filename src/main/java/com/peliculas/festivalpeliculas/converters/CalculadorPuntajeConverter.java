package com.peliculas.festivalpeliculas.converters;

import com.peliculas.festivalpeliculas.entidades.CalculadorDePuntaje;
import com.peliculas.festivalpeliculas.entidades.PuntajeMedio;
import com.peliculas.festivalpeliculas.entidades.PuntajePromedio;
import jakarta.persistence.AttributeConverter;

public class CalculadorPuntajeConverter implements AttributeConverter<CalculadorDePuntaje, String> {
    @Override
    public String convertToDatabaseColumn(CalculadorDePuntaje calculadorDePuntaje) {
        if (calculadorDePuntaje instanceof PuntajePromedio)
                return "PuntajePromedio";
        else if (calculadorDePuntaje instanceof PuntajeMedio)
                return "PuntajeMedio";
        else
                return null;
    }

    @Override
    public CalculadorDePuntaje convertToEntityAttribute(String s) {
        return switch (s) {
            case "PuntajePromedio" -> new PuntajePromedio();
            case "PuntajeMedio" -> new PuntajeMedio();
            default -> null;
        };
    }
}
