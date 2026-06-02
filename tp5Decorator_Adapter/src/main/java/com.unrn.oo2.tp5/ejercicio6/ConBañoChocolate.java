package com.unrn.oo2.tp5.ejercicio6;

public class ConBañoChocolate extends TortaDecorator{
    public static final float PORCENTAJE = 0.15f;

    public ConBañoChocolate(Producto producto) {
        super(producto);
    }
    @Override
    public String descripcion() {
        return super.descripcion()+ " con baño de chocolate" ;
    }

    @Override
    public float precio() {
        float total = super.precio();
        return total + (total* PORCENTAJE);
    }
}
