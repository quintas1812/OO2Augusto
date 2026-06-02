package com.unrn.strategy.ejercicio1;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.agregarProductos(new Producto("Sillon", 100000, 20));
        cliente.agregarProductos(new Producto("silla", 1100, 2));
        cliente.agregarProductos(new Producto("Mesa", 20000, 7));
        System.out.println(cliente.calcularEnvio(new CorreoArg(), new CapitalFederal()));
         System.out.println(cliente.calcularEnvio(new ColectivoSur(), new GranBuenosAires()));

    }
}
