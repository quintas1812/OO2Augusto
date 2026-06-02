package com.unrn.strategy.ejercicio2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormatoCortoStrategy implements FormatoFechaStrategy {
    @Override
    public String formatear(LocalDate fecha) {
        return fecha.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
}
