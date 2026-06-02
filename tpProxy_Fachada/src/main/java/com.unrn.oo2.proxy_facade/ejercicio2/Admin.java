package com.unrn.oo2.proxy_facade.ejercicio2;

public class Admin implements StrategyPermisos {
    @Override
    public boolean puedeAcederA(String nombreArchivo) {
        return true; //admin tiene acceso a todos los archivos
    }
}
