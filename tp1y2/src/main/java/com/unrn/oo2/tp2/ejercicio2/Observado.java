package com.unrn.oo2.tp2.ejercicio2;

import java.util.List;

public abstract class Observado {
   private List<Observer> observers;
    public Observado(List<Observer> observers){
        this.observers = observers;
    }
    public void notificar(String monto){
        for (Observer o : observers){
            o.update(monto);
        }
    }
}
