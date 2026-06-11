package com.unrn.oo2.tp5.ejercicio4;
//esta es la clase abstracta decoradora
public abstract class Porcion implements Pedido{
    private Pedido combo;
   private float precioExtra;
    public Porcion(Pedido combo, float preciodelExtra) {
        this.combo = combo;
        this.precioExtra = preciodelExtra;
    }
    @Override
    public String Descripcion() {
       return this.combo.Descripcion() + this;
    }

    @Override
    public float Precio() {
        return this.combo.Precio() +  this.precioExtra;
    }

}
