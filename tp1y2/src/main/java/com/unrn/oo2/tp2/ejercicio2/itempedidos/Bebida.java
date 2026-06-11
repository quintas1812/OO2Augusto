package com.unrn.oo2.tp2.ejercicio2.itempedidos;

import com.unrn.oo2.tp2.ejercicio2.tarjetas.TarjetaCredito;

public class Bebida extends ItemPedido {

    public Bebida(String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    public double aplicarDescuento(TarjetaCredito tarjeta) {
        return tarjeta.aplicarDescuentoBebida();
    }

}