package com.unrn.oo2.proxy_facade.ejercicio2;

public class Basico implements StrategyPermisos{
    @Override
    public boolean puedeAcederA(String nombreArchivo) {
        return !nombreArchivo.startsWith("i") && !nombreArchivo.startsWith("m");
    }
}
