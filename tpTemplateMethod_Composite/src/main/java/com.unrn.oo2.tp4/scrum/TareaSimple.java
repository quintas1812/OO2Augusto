package com.unrn.oo2.tp4.scrum;
import java.time.Duration;

public class TareaSimple extends ItemProyecto {
    public TareaSimple(String nombre, Duration horas) {
        super(nombre, horas);
    }

    @Override
    boolean puedeAgregarA(ItemProyecto item) {
        return false;  // no puede tener subitems
    }

    @Override
    boolean ComplejaMePuedeAgregar() {
        return false;
    }

    @Override
    boolean HUmePuedeAgregar() {
        return true;
    }

    @Override
    boolean EpicaMePuedeAgregar() {
        return false;
    }

    @Override
    boolean SpikeMePuedeAgregar() {
        return true;
    }

    @Override
    public String toString() {
        return "Tarea Simple";
    }

}