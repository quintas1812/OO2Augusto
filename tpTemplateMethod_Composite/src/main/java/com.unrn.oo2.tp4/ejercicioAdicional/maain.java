package com.unrn.oo2.tp4.ejercicioAdicional;

public class maain {
    public static void main(String[] args) {
        var p1 = new Libro(110);
        var p2 = new Medicina(110);
        var p3 = new Alimento(110);
        var p4 = new OtroProducto(110);

        System.out.println(p1.precioFinal());
        System.out.println(p2.precioFinal());
        System.out.println(p3.precioFinal());
        System.out.println(p4.precioFinal());
    }

}
