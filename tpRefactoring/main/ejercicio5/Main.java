package oop2.tp3.ejercicio5;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        var eventos = cargarEventos();
        var factura = crearFactura();

        System.out.println(new Calculador().reporte(factura, eventos));
    }

    private static List<Evento> cargarEventos() {
        return List.of(new Evento("Escuela de Rock", new Comedia()),
                new Evento("Hamlet", new Drama()),
                new Evento("El Avion", new Drama()),
                new Evento("Cantando en la playa", new Comedia()),
                new Evento("El Perfume", new Drama())
        );
    }

    private static Factura crearFactura() {
        return new Factura("c1", List.of(new Actuacion("Escuela de Rock", 158),
                new Actuacion("Hamlet", 103),
                new Actuacion("El Perfume", 8)));
    }
}
