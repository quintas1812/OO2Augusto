package com.unrn.oo2.tp2.ejercicio2.tarjetas;

public class Mastercard implements TarjetaCredito {
    private final double DESCUENTO = 0.98;// descuento del %2

    @Override
    public double aplicarDescuentoBebida() {
        return 1; //para las bebidas con esta tarjeta no hay descuento
    }

    @Override
    public double aplicarDescuentoPlato() {
        return DESCUENTO;
    }
    @Override
    public String toString() {
        return "Mastercard";
    }
}

