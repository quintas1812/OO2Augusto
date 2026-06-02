package com.unrn.oo2.tp5.ejercicio6;

public class Main {
    public static void main(String[] args) {
        Producto torta= new ConBañoChocolate(new TortaChocolate());
        System.out.println(torta.descripcion());
        System.out.println(torta.precio());
        Producto bizcochuelo = new BizcochueloFrutilla();
        System.out.println(bizcochuelo.descripcion());
        System.out.println(bizcochuelo.precio());


        Producto torta2 = new TortaBuilder(new TortaChocolate()).conBañoChocolate().conRocklets().conRocklets().build();
    }
}
