package com.unrn.oo2.tp5.ejercicio4;

public class AgregarCarne extends Porcion {
    public AgregarCarne(Pedido combo, float preciodelExtra) {
        super(combo, preciodelExtra);
    }
    @Override
    public String toString() {
        return " mas Carne extra";
    }
}
