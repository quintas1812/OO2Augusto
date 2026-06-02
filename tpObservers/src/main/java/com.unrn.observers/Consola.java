package com.unrn.observers;

public class Consola implements Observer {
    @Override
    public void update(String dato) {
        if (Float.parseFloat(dato) < 12) {
            System.out.println("Hace frio, se encenderá la caldera");
        } else if (Float.parseFloat(dato) > 17) {
            System.out.println("Hace calor, se encenderá el aire acondicionado");
        }
    }
}
