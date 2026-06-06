package com.unrn.double_dispatch.ejercicio5;

import java.time.Year;

public class Revista extends Articulo{
    private Year fechaPublicacion;
    private int cantPaginas;
    static final int DIAS_PRESTACION= 5;
    public Revista(Condicion condicion, float precio, Year fechaPublicacion, int cantPaginas) {
        super(condicion, precio);
        this.fechaPublicacion = fechaPublicacion;
        this.cantPaginas = cantPaginas;
    }
    public Year fechaPublicacion() {
        return fechaPublicacion;
    }

    public int cantPaginas() {
        return cantPaginas;
    }

    @Override
    protected int calcularDiasDePrestacion() {
        int dias = this.condicion.calcularDiasParaRevista(this);
        if(dias<1){ // minimo tiene que ser un dia
            throw new RuntimeException("la revista no se encuentra en condiciones para ser prestada");
        }
        return dias;
    }
}
