package com.unrn.double_dispatch.ejercicio1;


public class Jugada {
    public static final String GANASTE = "¡Ganaste!";
    public static final String PERDISTE = "¡Perdiste!";
    public static final String EMPATE = "¡Es un empate!";


    public String jugar(ElementoJuego eleccionUsuario, ElementoJuego eleccionComputadora) {
        return eleccionUsuario.leGanaA(eleccionComputadora);
    }



//    public String jugar(String eleccionUsuario, String eleccionComputadora) {
//        String resultado;
//        if (eleccionUsuario.equals(eleccionComputadora)) {
//            resultado = EMPATE;
//        } else if ((eleccionUsuario.equals(PIEDRA) && eleccionComputadora.equals(TIJERA)) ||
//                (eleccionUsuario.equals(PAPEL) && eleccionComputadora.equals(PIEDRA)) ||
//                (eleccionUsuario.equals(TIJERA) && eleccionComputadora.equals(PAPEL))) {
//            resultado = GANASTE;
//        } else {
//            resultado = PERDISTE;
//        }
//        return resultado;
//    }
}
