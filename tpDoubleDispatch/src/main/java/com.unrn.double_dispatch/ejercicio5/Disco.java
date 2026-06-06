package com.unrn.double_dispatch.ejercicio5;

import java.time.Year;

public class Disco extends Articulo{
    private Year año;

    public Disco(Condicion condicion, float precio, Year año) {
        super(condicion, precio);
        this.año = año;
    }

    public Year año() {
        return año;
    }

    @Override
    protected int calcularDiasDePrestacion() {
        int dias= this.condicion.calcularDiasParaDisco(this);
        if(dias<1){ // minimo tiene que ser un dia
            throw new RuntimeException("el disco no se encuentra en condiciones para ser prestada");
        }
        return dias;
    }
}
