package com.unrn.double_dispatch.ejercicio5;

public class Libro extends Articulo {
    private int paginas;
    public Libro(Condicion condicion, float precio, int cantPag) {
        super(condicion, precio);
        this.paginas = cantPag;
    }
    public int cantPaginas() {
        return paginas;
    }
    @Override
    protected int calcularDiasDePrestacion() {
        return this.condicion.calcularDiasParaLibro(this);
    }
}
