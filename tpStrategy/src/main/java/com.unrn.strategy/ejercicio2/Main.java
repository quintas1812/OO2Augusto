package com.unrn.strategy.ejercicio2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Persona p = new Persona(LocalDate.now());
        System.out.println(p.FechaNacimiento(new FormatoCortoStrategy()));
        System.out.println(p.FechaNacimiento(new FormatoLargoStrategy()));
    }
}
