package com.unrn.oo2.tp3.modelo.ejercicio1;

import java.util.List;

public abstract class Observado {
 protected List<Observer> observers;

    public Observado(List<Observer> observers) {
        this.observers = observers;
    }


 public void notificar(String dato){
     for (Observer o: observers) {
         o.update(dato);
     }
 }


}
