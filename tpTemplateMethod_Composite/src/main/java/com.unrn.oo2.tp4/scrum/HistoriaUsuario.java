package com.unrn.oo2.tp4.scrum;

import java.time.Duration;

public class HistoriaUsuario extends ItemProyecto{
    public HistoriaUsuario(String nombre, Duration horas) {
        super(nombre, horas);
    }
    @Override
    public void agregarItem(ItemProyecto item) {
        this.subItem.add(item);
    }

    @Override
    boolean puedeAgregarA(ItemProyecto item) {
        return item.HUmePuedeAgregar();
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
        return "Historia de Usuario";
    }
}
