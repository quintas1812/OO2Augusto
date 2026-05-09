package com.unrn.oo2.tp_refactoring.ejercicio3;

public class Gasto {
    TipoDeGasto tipoGasto;
    int monto;
    public Gasto(TipoDeGasto tipoGasto, int monto) {
        this.tipoGasto = tipoGasto;
        this.monto = monto;
    }
    public int monto(){
        return this.tipoGasto.esGastoComida() ? this.monto : 0;
    }

}
