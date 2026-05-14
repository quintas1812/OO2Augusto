package com.unrn.oo2.tp5.ejercicio1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Motor comun = new Comun();
        Motor economico = new Economico();
        Electrico electrico = new Electrico();
        Motor electricoAdaptado = new AdapterElectrico(electrico);
        List<Motor> motores = List.of(comun, economico, electricoAdaptado);
        for (Motor motor : motores) {
            System.out.println("Probando tipo de motor: " + motor.tipoMotor());
            motor.arrancar();
            motor.apagar();
            motor.apagar();
        }
    }
}
