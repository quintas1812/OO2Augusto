package com.unrn.oo2.state.ejercicio2;

import static com.unrn.oo2.state.ejercicio2.Calculadora.MSG_ESTADO_ERROR;

public class Error implements EstadoCalculadora{
    private Calculadora calculadora;
    public Error(Calculadora calculadora) {
        this.calculadora = calculadora;
    }

    @Override
    public void mas() {
        System.out.println(MSG_ESTADO_ERROR);
    }

    @Override
    public void mostrar() {
        System.out.println(MSG_ESTADO_ERROR);
    }

    @Override
    public void valor(double valor) {
        System.out.println(MSG_ESTADO_ERROR);
    }

    @Override
    public void dividir() {

    }

    @Override
    public void por() {

    }

    @Override
    public void menos() {

    }
    @Override
    public String toString() {
        return "ERROR";
    }
}
