package com.unrn.oo2.tp_refactoring.ejercicio6;

public class MainCalculadoraPedido {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(10000, true, true);
        double totalVip = pedido.calcularTotalConDescuentoVip();
        double totalPrioritario = pedido.calcularTotalConDescuentoPrioritario();
        System.out.println("Total con descuento VIP: " + totalVip);
        System.out.println("Total con descuento por envio prioritario: " + totalPrioritario);
    }
}

