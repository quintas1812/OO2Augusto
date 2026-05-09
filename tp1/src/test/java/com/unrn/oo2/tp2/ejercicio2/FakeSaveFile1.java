package com.unrn.oo2.tp2.ejercicio2;

import com.unrn.oo2.tp2.ejercicio2.Save1;

public class FakeSaveFile1 implements Save1 {
    private String datos;
    public String Datos() {
        return datos;
    }
    @Override
    public void guardar(String datos) {
        this.datos = datos;
    }
}
