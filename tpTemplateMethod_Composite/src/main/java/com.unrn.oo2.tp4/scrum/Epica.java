package com.unrn.oo2.tp4.scrum;

public class Epica extends ItemProyecto{
    public Epica(String nombre, java.time.Duration horas) {
        super(nombre, horas);
    }

    @Override
    boolean puedeAgregarA(ItemProyecto item) {
        return item.EpicaMePuedeAgregar();
    }

    @Override
    boolean ComplejaMePuedeAgregar() {
        return true;
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
        return "Epica";
    }

}
