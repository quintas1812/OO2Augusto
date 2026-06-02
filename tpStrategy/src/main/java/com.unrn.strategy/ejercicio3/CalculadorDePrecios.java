package com.unrn.strategy.ejercicio3;

public abstract class CalculadorDePrecios {
    protected double impuestos = 0;
    protected double descuentos = 0;
    protected boolean envioGratis = false;
    public  double calcularPrecio(double precio){
        calcular(precio);
        double total = precio * (1 + impuestos) * (1 - descuentos);
        if (envioGratis) {
            total -= 10;
        }
        return total;
    }
    public abstract void calcular(double precio);
}
