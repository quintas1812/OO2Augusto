package com.unrn.oo2.tp4.scrum;
import java.time.Duration;

public class MainTiempoProyecto {
    public static void main(String[] args) {
        ItemProyecto scrum = new TareaCompleja("Scrum", Duration.ofHours(10));
        ItemProyecto spike = new Spike("Spike", Duration.ofHours(5));
        ItemProyecto tarea1 = new TareaSimple("Tarea 1", Duration.ofHours(2));
        ItemProyecto tarea2 = new TareaSimple("Tarea 2", Duration.ofHours(3));
    scrum.agregarItem(spike);
    spike.agregarItem(tarea1);
    spike.agregarItem(tarea2);
    System.out.println("Horas totales: " + scrum.calcularHoras());
    }
}
