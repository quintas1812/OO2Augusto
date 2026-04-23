package test.ejercicio2;

import mainn.ejercicio2.Save1;

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
