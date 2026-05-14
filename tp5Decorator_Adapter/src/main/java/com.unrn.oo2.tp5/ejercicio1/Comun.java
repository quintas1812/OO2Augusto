package com.unrn.oo2.tp5.ejercicio1;

public class Comun implements Motor {
    @Override
    public void acelerar() {
        System.out.println("El motor común está acelerando.");
    }

    @Override
    public void arrancar() {
        System.out.println("El motor común ha arrancado.");
    }

    @Override
    public void apagar() {
        System.out.println("El motor común se ha apagado.");
    }
    @Override
    public String tipoMotor() {
        return "comun";
    }
}
