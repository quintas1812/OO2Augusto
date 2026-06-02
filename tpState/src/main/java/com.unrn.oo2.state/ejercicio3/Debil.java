package com.unrn.oo2.state.ejercicio3;

public class Debil implements EstadoGolondrina{
    private Golondrina golondrina;
    public Debil(Golondrina golondrina) {
        this.golondrina = golondrina;
    }

    @Override
    public void realizarDeseo() {
        golondrina.comer(50);
    }
}
