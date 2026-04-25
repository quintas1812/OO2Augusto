package Modelo.inciso2;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTiempoProyecto {
    @Test
    public void testTiempoProyecto(){
        ItemProyecto scrum = new ProyectoScrum("Scrum", Duration.ofHours(10));
        ItemProyecto spike = new Spike("Spike", Duration.ofHours(5));
        ItemProyecto tarea1 = new Tarea("Tarea 1", Duration.ofHours(2));
        ItemProyecto tarea2 = new Tarea("Tarea 2", Duration.ofHours(3));
        scrum.agregarItem(spike);
        spike.agregarItem(tarea1);
        spike.agregarItem(tarea2);
        assertEquals(20,scrum.calcularHoras());
    }
    @Test
    public void testTiempoProyecto2(){
        ItemProyecto scrum = new ProyectoScrum("Scrum", Duration.ofHours(10));
        ItemProyecto spike = new Spike("Spike", Duration.ofHours(5));
        ItemProyecto historia1 = new HistoriaUsuario("Historia 1", Duration.ofHours(2));
        ItemProyecto historia2 = new HistoriaUsuario("Historia 2", Duration.ofHours(3));
        scrum.agregarItem(spike);
        spike.agregarItem(historia1);
        spike.agregarItem(historia2);
        assertEquals(15,scrum.calcularHoras());
    }
}
