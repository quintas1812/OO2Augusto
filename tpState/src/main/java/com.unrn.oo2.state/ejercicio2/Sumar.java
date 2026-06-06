package com.unrn.oo2.state.ejercicio2;

public class Sumar implements Operacion {
    @Override
    public void operar(Calculadora calculadora, double valor) {
        calculadora.cambiarValor(calculadora.valorAcumulado() + valor);
    }
}
