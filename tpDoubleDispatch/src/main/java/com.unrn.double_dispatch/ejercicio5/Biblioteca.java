package com.unrn.double_dispatch.ejercicio5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Articulo> inventario;
    private static Biblioteca instance;
    private Biblioteca() {}
    public synchronized static Biblioteca getInstance() {
        if (instance == null) {
            instance = new Biblioteca();
            instance.inventario = new ArrayList<>();
        }
        return instance;
    }
    public void agregarArticulo(Articulo ar){
        inventario.add(ar);
    }
    public void prestarArticulo(Articulo ar, String usuario){
        if (!inventario.contains(ar)) {
            throw new RuntimeException("el articulo no se encuentra en el inventario");
        }
        ar.PrestarArticulo(usuario);
    }
    LocalDate verFechaDevolucion(Articulo ar){
        if (!inventario.contains(ar)) {
            throw new RuntimeException("el articulo no se encuentra en el inventario");
        }
       return ar.verFechaDevolucion();
    }

}
