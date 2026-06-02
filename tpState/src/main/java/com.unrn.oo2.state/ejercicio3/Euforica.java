package com.unrn.oo2.state.ejercicio3;

public class Euforica implements EstadoGolondrina {
    private Golondrina golondrina;
    public Euforica(Golondrina golondrina) {
        this.golondrina = golondrina;
    }

    @Override
    public void realizarDeseo() {
        golondrina.volar(5);
    }
}
