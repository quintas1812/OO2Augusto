package com.unrn.strategy.ejercicio2;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Persona {
    LocalDate fechaNacimiento;
    public Persona(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public String FechaNacimiento(FormatoFechaStrategy fechaStrategy) {
        return fechaStrategy.formatear(this.fechaNacimiento);
    }
}
//Corta: 3-06-1986
// Larga: 3 de Junio de 1986