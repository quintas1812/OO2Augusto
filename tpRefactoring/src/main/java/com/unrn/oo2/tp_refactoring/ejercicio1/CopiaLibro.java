package com.unrn.oo2.tp_refactoring.ejercicio1;

public class CopiaLibro {
    private Libro libro;

    public CopiaLibro(Libro libro) {
        this.libro = libro;
    }

    public Libro libro() {
        return libro;
    }
}