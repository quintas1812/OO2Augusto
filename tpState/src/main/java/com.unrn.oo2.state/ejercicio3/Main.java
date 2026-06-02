package com.unrn.oo2.state.ejercicio3;

public class Main {
    static void main() {
        var gol = new Golondrina();
        gol.comer(500);
        System.out.println(gol.energia());
        gol.realizarDeseo();
        System.out.println(gol.energia());

    }
}
