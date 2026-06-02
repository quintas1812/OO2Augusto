package com.unrn.strategy.ejercicio2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public interface FormatoFechaStrategy {
    String formatear(LocalDate fecha);
}

