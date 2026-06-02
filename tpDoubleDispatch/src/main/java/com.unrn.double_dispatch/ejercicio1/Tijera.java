package com.unrn.double_dispatch.ejercicio1;

public class Tijera extends ElementoJuego{
    @Override
    public String leGanaA(ElementoJuego elemento) {
        return	elemento.pierdeContraTijera(elemento);
    }

    @Override
    String pierdeContraTijera(ElementoJuego elemento) {
                	return Jugada.EMPATE;
    }

    @Override
    String pierdeContraPapel(ElementoJuego elemento) {
        	return Jugada.GANASTE;
    }

    @Override
    String pierdeContraPiedra(ElementoJuego elemento) {
        return Jugada.PERDISTE;
    }
    @Override
    public String toString() {
        return "Tijera";
    }

}
