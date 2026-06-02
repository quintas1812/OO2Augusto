package com.unrn.oo2.tp5.ejercicio6;

public class BizcochueloFrutilla extends Torta {
    @Override
    public String descripcion() {
        return "Bizcochuelo de frutilla";
    }
    @Override
    public float precio() {
        return  super.precio() * 2;
    }
}
