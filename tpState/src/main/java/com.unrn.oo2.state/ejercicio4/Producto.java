package com.unrn.oo2.state.ejercicio4;
public class Producto {
    private String descripcion;
    private double precio;


    public Producto(String descripcion, double precio) {
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String descripcion() {
        return this.descripcion;
    }

    public double precio() {
        return this.precio;
    }
}
