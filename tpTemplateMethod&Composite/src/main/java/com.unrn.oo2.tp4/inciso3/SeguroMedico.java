package com.unrn.oo2.tp4.inciso3;

public class SeguroMedico extends Seguro{
    public SeguroMedico(String nombre, double costo) {
        super(nombre, costo);
    }
    @Override
    public double calcularCostoTotal() {
        return this.costo;
    }
}