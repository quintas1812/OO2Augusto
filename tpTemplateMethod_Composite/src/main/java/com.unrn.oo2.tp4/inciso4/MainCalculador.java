package com.unrn.oo2.tp4.inciso4;


public class MainCalculador {
    public static void main(String[] args){
        LogTransaction log = new ImprimirLogTransaction();
        Calculador calculadorJubilado = new CalculadorJubilado(5,log);
        Calculador calculadorNoJubilado = new CalculadorNoJubilado(1,log);
        System.out.println(calculadorJubilado.calcularPrecio(100));
    }
}
