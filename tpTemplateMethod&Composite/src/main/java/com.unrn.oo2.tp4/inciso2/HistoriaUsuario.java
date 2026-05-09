package com.unrn.oo2.tp4.inciso2;

import java.time.Duration;

public class HistoriaUsuario extends ItemProyecto{
    public HistoriaUsuario(String nombre, Duration horas) {
        super(nombre, horas);
    }
    @Override
    public void agregarItem(ItemProyecto item) {
        this.subItem.add(item);
    }
}
