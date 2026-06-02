package com.unrn.oo2.state.ejercicio2;

public class EsperandoOperando implements EstadoCalculadora {
    private Calculadora calculadora;

    public EsperandoOperando(Calculadora calculadora) {
        this.calculadora = calculadora;
    }
    @Override
    public void mas() {
        this.calculadora.cambiarEstado(new Error(this.calculadora));
    }

    @Override
    public void mostrar() {
        this.calculadora.cambiarEstado(new Error(this.calculadora));
    }

    @Override
    public void valor(double valor) {
        this.calculadora.cambiarValor(this.calculadora.valorAcumulado() + valor);
        this.calculadora.cambiarEstado(new Inicial(this.calculadora));
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
        return "ESPERANDO_OPERANDO";
    }
}
