package com.unrn.oo2.tp5.ejercicio6;

public class TortaBuilder {
    public Producto producto;
    private int cantchoco;
    private int rocklet;
    public TortaBuilder(Producto producto) {
        this.producto = producto;
        this.cantchoco = 0;
        this.rocklet = 0;
    }
    public TortaBuilder(Torta producto) {
        this.producto = producto;
    }
    public TortaBuilder conBañoChocolate() {
        if(cantchoco == 1) {
            throw new RuntimeException("no se puede agregar mas de un baño de chocolate");
        }
        this.producto = new ConBañoChocolate(this.producto);
        this.cantchoco++;
        return this;

    }
    public TortaBuilder conRocklets() {
        if(cantchoco == 1) {
        throw new RuntimeException("no se puede agregar mas de un rocklet");
        }
        this.producto = new ConRocklets(this.producto);
        this.rocklet++;
        return this;
    }
    public Producto build(){
        return this.producto;
    }

}
