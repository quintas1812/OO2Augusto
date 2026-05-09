package com.unrn.oo2.tp4.inciso3;

import java.util.ArrayList;
import java.util.List;

public class PaqueteSeguros extends Seguro {
    private List<Seguro> seguros;
    public static final double PORCENTAJE_DESCUENTO = 0.05;

    public PaqueteSeguros(String nombre) {
        super(nombre, 0); // le pongo cero porque el costo es la suma de sus seguros
        this.seguros = new ArrayList<>();
    }
    public void agregarSeguro(Seguro seguro) {
        this.seguros.add(seguro);
    }
    @Override
    public double calcularCostoTotal() {
        double total = 0;
        for (Seguro seguro : this.seguros) {
            total += seguro.calcularCostoTotal() * (1 - PORCENTAJE_DESCUENTO);
        }
        return total;
    }
}
