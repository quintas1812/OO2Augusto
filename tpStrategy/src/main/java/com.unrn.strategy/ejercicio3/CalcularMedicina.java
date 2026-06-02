package com.unrn.strategy.ejercicio3;

public class CalcularMedicina extends CalculadorDePrecios {
    @Override
    public void calcular(double precio) {
        super.impuestos = 0.02;
        if (precio > 50) {
             super.descuentos = 0.05;
        }
    }
}
//impuestos = 0.02;
/// /            if (precio > 50) {
/// /                descuentos = 0.05;
/// /            }