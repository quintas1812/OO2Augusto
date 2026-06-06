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
        if ( this.calculadora.ultimaOperacion() == null) {
            this.calculadora.cambiarEstado(new  Error( this.calculadora));
        }
        this.calculadora.ultimaOperacion().operar(this.calculadora, valor);
        this.calculadora.cambiarEstado(new Inicial(this.calculadora));
    }

    @Override
    public void dividir() {
        this.calculadora.cambiarEstado(new Error(this.calculadora));
    }

    @Override
    public void por() {
        this.calculadora.cambiarEstado(new Error(this.calculadora));
    }

    @Override
    public void menos() {
        this.calculadora.cambiarEstado(new Error(this.calculadora));
    }
    @Override
    public String toString() {
        return "ESPERANDO_OPERANDO";
    }
}
