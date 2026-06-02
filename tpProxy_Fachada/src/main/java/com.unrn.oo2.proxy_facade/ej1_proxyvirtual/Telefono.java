package com.unrn.oo2.proxy_facade.ej1_proxyvirtual;

public class Telefono {
    private String numero;
    public Telefono(String numero) {
        this.numero = numero;
    }
    public String numero() {
        return numero;
    }
    @Override
    public String toString() {
        return numero;
    }
}