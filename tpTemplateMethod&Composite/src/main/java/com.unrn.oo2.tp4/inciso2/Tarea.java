package com.unrn.oo2.tp4.inciso2;
import java.time.Duration;

public class Tarea extends ItemProyecto {
    public Tarea(String nombre, Duration horas) {
        super(nombre, horas);
    }
    @Override
    public void agregarItem(ItemProyecto item) {} // en una tarea no se puede agregar ptrp itemproyecto
}