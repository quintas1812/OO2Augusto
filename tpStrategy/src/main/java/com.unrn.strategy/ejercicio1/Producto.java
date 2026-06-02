package com.unrn.strategy.ejercicio1;

public class Producto {
    private String nombre;
    private float precio;
    private int peso;
    public Producto(String nombre, float precio, int peso) {
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
    }

    public String nombre() {
        return nombre;
    }

    public int peso() {
        return peso;
    }

    public float precio() {
        return precio;
    }


}
