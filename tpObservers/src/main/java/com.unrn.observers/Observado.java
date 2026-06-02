package com.unrn.observers;

import java.util.List;
//esta clase funciona como clase abstracta de decorador y observado
public abstract class Observado  implements Termometro  {
    private List<Observer> observers;
    protected Termometro termometro;
     public Observado(List<Observer> observers, Termometro termometro) {
        this.observers = observers;
        this.termometro = termometro;
     }

     public void notificar(String dato){ // metodo para notificar a los observadores
         for (Observer o: observers) {
             o.update(dato);
         }
     }
     @Override
     public String temperatura() { // metdodo para delegar la temperatura del medidor (la base)
        return this.termometro.temperatura();
     }
}
