package com.unrn.oo2.tp4.scrum;
import java.time.Duration;

public class Spike extends ItemProyecto {
    public Spike(String nombre, Duration horas) {
        super(nombre, horas);
    }
    @Override
    boolean puedeAgregarA(ItemProyecto item) {
        return item.SpikeMePuedeAgregar();
    }

    @Override
    boolean ComplejaMePuedeAgregar() {
        return false;
    }

    @Override
    boolean HUmePuedeAgregar() {
        return false;
    }

    @Override
    boolean EpicaMePuedeAgregar() {
        return true;
    }

    @Override
    boolean SpikeMePuedeAgregar() {
        return false;
    }

    @Override
    public String toString() {
        return "Spike";
    }
}
