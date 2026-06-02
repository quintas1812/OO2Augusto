package com.unrn.double_dispatch.ejercicio1;

public abstract class ElementoJuego {
public abstract String leGanaA(ElementoJuego elemento);
 abstract String pierdeContraTijera(ElementoJuego elemento);
 abstract String pierdeContraPapel(ElementoJuego elemento);
 abstract String pierdeContraPiedra(ElementoJuego elemento);
 public static ElementoJuego crearElemento(String tipo){
     switch (tipo){
         case "piedra":
             return new Piedra();
         case "papel":
             return new Papel();
         case "tijera":
             return new Tijera();
         default:
              System.out.println("Opción inválida");
             return null ;
     }
 }
}
