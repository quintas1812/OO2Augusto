
package com.unrn.oo2.tp2.ejercicio2.itempedidos;

import com.unrn.oo2.tp2.ejercicio2.tarjetas.TarjetaCredito;

public abstract class ItemPedido {
    protected String nombre;
    protected double precio;

    public ItemPedido(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return  nombre +" $"+ precio;
    }

    public double Precio() {
        return this.precio;
    }

    public String Nombre() {
        return this.nombre;
    }

    public abstract double aplicarDescuento(TarjetaCredito tarjeta);
}
