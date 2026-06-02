package com.unrn.oo2.tp5.ejercicio4;

public class AgregarTomate extends Porcion {
    public AgregarTomate(Pedido combo, float precioExtra) {
        super(combo, precioExtra);
    }
    @Override
    public String toString() {
        return " mas tomate extra";
    }
}
