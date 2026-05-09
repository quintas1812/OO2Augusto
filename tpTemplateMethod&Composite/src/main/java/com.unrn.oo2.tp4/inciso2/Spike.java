package com.unrn.oo2.tp4.inciso2;
import java.time.Duration;

public class Spike extends ItemProyecto {
    public Spike(String nombre, Duration horas) {
        super(nombre, horas);
    }
    @Override
    public void agregarItem(ItemProyecto item) {
        this.subItem.add(item);
    }
}
