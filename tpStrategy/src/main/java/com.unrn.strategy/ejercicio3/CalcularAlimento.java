package com.unrn.strategy.ejercicio3;

public class CalcularAlimento extends CalculadorDePrecios{

    @Override
    public void calcular(double precio) {
        super.impuestos = 0.05;
        if (precio > 100) {
            super.descuentos = 0.15;
        }
        if (precio > 200) {
            super.envioGratis = true;
        }
    }
}
