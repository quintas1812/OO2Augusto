package com.unrn.oo2.tp4.scrum;
import java.time.Duration;

public class TareaCompleja extends ItemProyecto {
    public TareaCompleja(String nombre, Duration horas) {
        super(nombre, horas);
    }

    @Override
    boolean puedeAgregarA(ItemProyecto item) {
        return item.ComplejaMePuedeAgregar();
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
        return false;
    }

    @Override
    boolean SpikeMePuedeAgregar() {
        return false;
    }

    @Override
    public String toString() {
        return "Tarea Compleja";
    }

}
