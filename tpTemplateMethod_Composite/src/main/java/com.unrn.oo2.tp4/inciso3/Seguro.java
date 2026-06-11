package com.unrn.oo2.tp4.inciso3;

import java.util.ArrayList;
import java.util.List;

public abstract class Seguro {
    protected double costo;
    protected String nombre;
    public Seguro(String nombre, double costo) {
        this.nombre = nombre;
        this.costo = costo;
    }
    public abstract double calcularCostoTotal();

}
