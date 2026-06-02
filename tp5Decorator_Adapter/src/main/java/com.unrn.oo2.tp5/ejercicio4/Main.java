package com.unrn.oo2.tp5.ejercicio4;

public class Main {
    static void main(String[] args) {
      Pedido ped = new AgregarCarne(new AgregarPapas(new ComboBasico(50,"combo basico" ), 150f), 200f);
      Pedido porcionpapas = new AgregarPapas(new ComboBasico(50,"combo basico" ), 150f);
      System.out.println(ped.Descripcion() + " - Precio: " + ped.Precio());
      System.out.println(porcionpapas.Descripcion() + " - Precio: " + porcionpapas.Precio());
    }
}
