package com.unrn.oo2.tp5.ejercicio1;

public class Economico implements Motor{
     @Override
    public void acelerar() {
        System.out.println("El motor económico está acelerando de manera eficiente.");
    }

    @Override
    public void arrancar() {
        System.out.println("El motor económico ha arrancado con bajo consumo de combustible.");
    }

    @Override
    public void apagar() {
        System.out.println("El motor económico se ha apagado, ahorrando energía.");
    }
    @Override
    public String tipoMotor() {
         return "Economico";
    }
}
