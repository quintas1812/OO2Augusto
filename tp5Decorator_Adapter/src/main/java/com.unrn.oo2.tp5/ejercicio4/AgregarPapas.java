package com.unrn.oo2.tp5.ejercicio4;

public class AgregarPapas extends Porcion {
    public AgregarPapas(Pedido combo, float preciodelExtra) {
        super(combo, preciodelExtra);
    }
    @Override
    public String toString() {
        return " mas Papas extra";
    }
}
