package com.unrn.oo2.tp2.ejercicio1;

import com.unrn.oo2.tp2.ejercicio1.Save;

public class FakeSaveFile implements Save {
    private String datos;
    public String Datos() {
        return datos;
    }
    @Override
    public void guardar(String datos) {
        this.datos = datos;
    }
}
