package com.unrn.oo2.state.ejercicio2;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        System.out.println("Estado inicial: " + calculadora.estado());

        calculadora.valor(10);

        System.out.println("Estado después de ingresar operando: " + calculadora.estado());

        calculadora.por();
        calculadora.por();
        calculadora.valor(10);


        System.out.println("Estado después de ingresar operando cero: " + calculadora.estado());


        calculadora.mostrar();
    }
}
