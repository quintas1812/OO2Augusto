package com.unrn.double_dispatch.ejercicio1;

public class Papel extends ElementoJuego{
    @Override
    public String leGanaA(ElementoJuego elemento) {
        return	elemento.pierdeContraPapel(elemento);
    }

    @Override
    String pierdeContraTijera(ElementoJuego elemento) {
            	return Jugada.PERDISTE;
    }

    @Override
    String pierdeContraPapel(ElementoJuego elemento) {
                	return Jugada.EMPATE;
    }

    @Override
    String pierdeContraPiedra(ElementoJuego elemento) {
                	return Jugada.GANASTE;
    }
    @Override
    public String toString() {
        return "Papel";
    }
}
