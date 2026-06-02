package com.unrn.strategy.ejercicio3;

public class Main {
    public static void main(String[] args) {
        var p1 = new Producto(new CalcularLibro(), 30);
        var p2 = new Producto(new CalcularMedicina(), 330);
        var p3 = new Producto(new CalcularAlimento(), 130);
        var p4 = new Producto(new CalcularOtro(), 130);

        System.out.println(p1.precioFinal());
        System.out.println(p2.precioFinal());
        System.out.println(p3.precioFinal());
        System.out.println(p4.precioFinal());
    }
}
