package com.unrn.oo2.tp_refactoring.ejercicio1;

import java.util.List;

public class Biblioteca {
    public double CalcularPago(Cliente cliente){
        List<Alquiler> alquileres = cliente.LibrosAlquilados();
        double monto = 0;
        for (Alquiler alquiler : alquileres) {
              monto +=  alquiler.copia().libro().Precio(alquiler.diasAlquilados());
        }
        return monto;
    }
    public int CalcularPuntos(Cliente cliente){
        List<Alquiler> alquileres = cliente.LibrosAlquilados();
        int puntos = 0;
        for (Alquiler alquiler : alquileres) {
          puntos+= alquiler.copia().libro().sumaPuntos(alquiler.diasAlquilados());
        }
        return puntos;
    }
}
