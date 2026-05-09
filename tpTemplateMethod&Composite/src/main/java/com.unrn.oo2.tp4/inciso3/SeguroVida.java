package com.unrn.oo2.tp4.inciso3;

public class SeguroVida extends Seguro{
    public SeguroVida(String nombre, double costo) {
        super(nombre, costo);
    }
    @Override
    public double calcularCostoTotal() {
        return this.costo;
    }
}