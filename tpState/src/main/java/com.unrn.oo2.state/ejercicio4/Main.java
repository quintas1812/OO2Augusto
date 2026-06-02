package com.unrn.oo2.state.ejercicio4;

public class Main {
    static void main() {
        OrdenDeCompra orden = new OrdenDeCompra();
        System.out.println(orden.estado());
        orden.agregarProducto(new Producto("Coca-cola", 100));
        orden.agregarProducto(new Producto("Fanta", 150));
        orden.confirmarCompra();
        System.out.println(orden.estado());
        orden.enviar();
        System.out.println(orden.estado());
        orden.cancelar();
        System.out.println(orden.estado());
    }
}
