package com.unrn.oo2.tp3.modelo.ejercicio1;

import java.util.List;

public class Concurso extends Observado {
    private Guardar guardar;

    public Concurso(Guardar guardar, List<Observer> observers){
        super(observers);
        this.guardar = guardar;
    }
    public void guardar(Participante participante)  {
        this.notificar(participante.email());
        this.guardar.guardar(participante);

    }
}