package com.unrn.oo2.tp_refactoring.ejercicio3;

public class Desayuno extends TipoDeGasto {

    public static final String DESAYUNO = "Desayuno";

    @Override
    public String tipo() {
        return DESAYUNO;
    }

    @Override
    public boolean esGastoComida() {
        return true;
    }

    @Override
    public String estaExcedido(int monto) {
        return monto > 1000 ? "X" : " ";
    }
}
