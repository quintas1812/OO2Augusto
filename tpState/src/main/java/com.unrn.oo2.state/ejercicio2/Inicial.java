package com.unrn.oo2.state.ejercicio2;

public class Inicial implements EstadoCalculadora {
    private Calculadora calculadora;

    public Inicial(Calculadora calculadora) {
        this.calculadora = calculadora;
    }

    @Override
    public void mas() {
        this.calculadora.cambiarEstado(new EsperandoOperando(this.calculadora));
    }

    @Override
    public void mostrar() {
        System.out.println(this.calculadora.valorAcumulado());
    }

    @Override
    public void valor(double valor) {
        this.calculadora.cambiarValor(valor);
    }

    @Override
    public void dividir() {
        this.calculadora.cambiarEstado(new EsperandoOperando(this.calculadora));
    }

    @Override
    public void por() {
        this.calculadora.cambiarEstado(new EsperandoOperando(this.calculadora));
    }

    @Override
    public void menos() {
        this.calculadora.cambiarEstado(new EsperandoOperando(this.calculadora));
    }


    @Override
    public String toString() {
        return "INICIAL";
    }
}
