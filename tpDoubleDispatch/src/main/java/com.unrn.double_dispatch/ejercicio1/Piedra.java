package com.unrn.double_dispatch.ejercicio1;

public class Piedra extends ElementoJuego{
    @Override
    public String leGanaA(ElementoJuego elemento) {
        return	elemento.pierdeContraPiedra(elemento);
    }

    @Override
    String pierdeContraTijera(ElementoJuego elemento) {
        return Jugada.GANASTE;
    }

    @Override
    String pierdeContraPapel(ElementoJuego elemento) {
        return Jugada.PERDISTE;
    }

    @Override
    String pierdeContraPiedra(ElementoJuego elemento) {
        return Jugada.EMPATE;
    }
    @Override
    public String toString() {
        return "Piedra";
    }
}
