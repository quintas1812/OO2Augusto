package com.unrn.oo2.tp5.ejercicio6;

public abstract class TortaDecorator implements Producto {
    private Producto producto;
    public TortaDecorator(Producto producto) {
        this.producto = producto;
    }
    @Override
    public String descripcion() {
        return this.producto.descripcion();
    }

    @Override
    public float precio() {
        return this.producto.precio();
    }
}
