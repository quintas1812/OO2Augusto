package com.unrn.oo2.tp5.ejercicio6;

public abstract class Torta implements Producto {
    private final float COSTO = 10;

    @Override
    public abstract String descripcion();

    @Override
    public float precio() {
        return COSTO;
    }

}


