package com.unrn.oo2.tp5.ejercicio4;

public class AgregarQueso extends Porcion {
    public AgregarQueso(Pedido combo, float preciodelExtra) {
        super(combo, preciodelExtra);
    }
    @Override
    public String toString() {
        return " mas Queso extra";
    }
}
