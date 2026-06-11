package com.unrn.oo2.tp4.inciso3;

public class SeguroAuto extends Seguro{
    public SeguroAuto(String nombre, double costo) {
        super(nombre, costo);
    }

    @Override
    public double calcularCostoTotal() {
        return this.costo;
    }
}
