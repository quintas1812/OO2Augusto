package com.unrn.oo2.tp4.ejemploComposite;

import java.util.ArrayList;
import java.util.List;

public class TareaCompleja implements ItemProyecto {
    private String nombre;
    private List<ItemProyecto> subtareas = new ArrayList<>(); // No hay herencia común, usamos Object
    private PrintConsola printer;

    public TareaCompleja(String nombre, PrintConsola printer) {
        this.nombre = nombre;
        this.printer = printer;
    }

    public void agregarSubtarea(ItemProyecto tarea) {
        subtareas.add(tarea);
    }

    @Override
    public void mostrarTarea(String indent) {
        this.printer.println(indent + "+ " + nombre);
        for (ItemProyecto sub : subtareas) {
            sub.mostrarTarea(indent + "  ");
        }
    }
}