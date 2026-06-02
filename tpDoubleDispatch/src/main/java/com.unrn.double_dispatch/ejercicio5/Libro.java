package com.unrn.double_dispatch.ejercicio5;

public class Libro extends Articulo {
    private int paginas;

    public Libro(Condicion condicion, float precio, int cantPag) {
        super(condicion, precio);
        this.paginas = cantPag;
    }


    // por lo que entendi de la consigna los dias que va a ser alquilado el libro, se calculan segun la cantidad de paginas de el libro
    // 100 pag = 1 dia ; 200 pag = 2 dias ; 260 pag = 3 dias (redondeando hacia arriba)
    @Override
    protected int calcularDiasDePrestacion() {
        int dias = 0;
        for (int i = 0; i <= this.paginas; i+=100) {
            dias ++;
        }
        if((100*dias)- this.paginas <50){ // si el libro tiene 140 pag redondeo hacia abajo
            dias = dias -1;
        }
        return dias;
    }

    @Override
    public float precio(int dias) {
        if(!condicion.libroEstaEncondiciones()){
            throw new RuntimeException("El libro no se encuentra en condiciones para ser prestado");
        }
        return super.precio * dias;
    }


}
