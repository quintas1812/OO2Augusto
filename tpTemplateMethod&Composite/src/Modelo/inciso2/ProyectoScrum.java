package Modelo.inciso2;

import java.time.Duration;

public class ProyectoScrum extends ItemProyecto {
    public ProyectoScrum(String nombre, Duration horas) {
        super(nombre, horas);
    }
    @Override
    void agregarItem(ItemProyecto item) {
        this.subItem.add(item);
    }
}
