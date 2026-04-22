package main.test.ejercicio5;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadorTest {

    @Test
    public void test01() {
        var eventos = cargarEventos();
        var factura = crearFactura();

        assertEquals(
                "Facturación para c1 \n"+
                "Escuela de Rock: 156400.0. Asientos: 158\n"+
                "Hamlet: 113000.0. Asientos: 103\n"+
                "El Perfume: 40000.0. Asientos: 8\n"+
                "Monto ganado: 309400.0\n"+
                "Créditos ganados: 232.0\n"
                , new Calculador().reporte(factura, eventos));
    }

    private List<Evento> cargarEventos() {
        return List.of(new Evento("Escuela de Rock", new Comedia()),
                new Evento("Hamlet", new Drama()),
                new Evento("El Avion",  new Drama()),
                new Evento("Cantando en la playa", new Comedia()),
                new Evento("El Perfume", new Drama())
        );
    }

    private Factura crearFactura() {
        return new Factura("c1", List.of(new Actuacion("Escuela de Rock", 158),
                new Actuacion("Hamlet", 103),
                new Actuacion("El Perfume", 8)));
    }
}
