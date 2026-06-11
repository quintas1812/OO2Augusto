package com.unrn.observers;

import java.util.List;
// esta es una clase decoradora que extiende de observado para notificar a sus observer
// el fin es aplicar el patron decorator para poder dejar a la clase base (medidor)como esta y poder
// agregarle el patron onbserver, asi le notificamos a las clases que requieren la temperatura

public class MedidorQueNotifica extends Observado implements Termometro {
    public MedidorQueNotifica(Termometro termometro, List<Observer> observers) {
        super(observers,termometro);
    }
    @Override
    public String temperatura () {
        String tempConsultada = super.temperatura(); // esta es la temperatura de la clase base
        super.notificar(tempConsultada);// le notificamos a las clases observadoras
        return tempConsultada;//
    }



}