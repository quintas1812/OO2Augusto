package com.unrn.oo2.tp5.ejercicio6;

public class ConRocklets extends TortaDecorator {
    final int PRECIO_ROCKLETS = 5;

    public ConRocklets(Producto producto) {
        super(producto);
    }

    @Override
    public String descripcion() {
        return this.producto.descripcion() + " con rocklets";
    }

    @Override
    public float precio() {
        return this.producto.precio() + PRECIO_ROCKLETS;
    }
}
