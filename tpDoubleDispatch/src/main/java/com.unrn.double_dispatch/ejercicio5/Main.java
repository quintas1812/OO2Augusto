package com.unrn.double_dispatch.ejercicio5;

import java.time.Year;

public class Main {
    public static void main(String[] args) {
        Articulo libro = new Libro(new Nuevo(), 1000, 150);
        Articulo disco = new Disco(new Usado(), 500, Year.of(1975));
        Articulo revista = new Revista(new Nuevo(), 200, Year.of(2010), 50);
        Biblioteca biblioteca = Biblioteca.getInstance();
        biblioteca.agregarArticulo(libro);
        biblioteca.agregarArticulo(disco);
        biblioteca.agregarArticulo(revista);
        biblioteca.prestarArticulo(libro, "Juan");
        biblioteca.prestarArticulo(disco, "Maria");
        biblioteca.prestarArticulo(revista, "Carlos");
        System.out.println("Fecha de devolución del libro prestado: " + biblioteca.verFechaDevolucion(libro));
        biblioteca.prestarArticulo(new Libro(new Nuevo(), 10, 150), "Juan");

    }
}
