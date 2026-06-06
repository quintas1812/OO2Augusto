package com.unrn.oo2.state.ejercicio2;

public class Dividir implements Operacion {
    @Override
    public void operar(Calculadora calculadora, double valor) {
        if (valor == 0) {
            calculadora.cambiarEstado(new Error(calculadora));
            return;
        }
        calculadora.cambiarValor(calculadora.valorAcumulado() / valor);
    }
}
