package Modelo.inciso2;

import java.time.Duration;

public class MainTiempoProyecto {
    public static void main(String[] args) {
    ItemProyecto scrum = new ProyectoScrum("Scrum", Duration.ofHours(10));
    ItemProyecto spike = new Spike("Spike", Duration.ofHours(5));
    ItemProyecto tarea1 = new Tarea("Tarea 1", Duration.ofHours(2));
    ItemProyecto tarea2 = new Tarea("Tarea 2", Duration.ofHours(3));
    scrum.agregarItem(spike);
    spike.agregarItem(tarea1);
    spike.agregarItem(tarea2);
    System.out.println("Horas totales: " + scrum.calcularHoras());
    }
}
