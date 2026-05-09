package com.unrn.oo2.tp3.ejercicio1;

import com.unrn.oo2.tp3.modelo.ejercicio1.Guardar;
import com.unrn.oo2.tp3.modelo.ejercicio1.Participante;

public class FakeGuardar implements Guardar {
    private String nombre;

    @Override
    public void guardar(Participante participante) {
        this.nombre = participante.Nombre();
    }
    public String nombre(){
        return this.nombre;
    }
}
