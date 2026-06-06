package com.unrn.double_dispatch.ejercicio5;

import java.time.Year;

public abstract class Condicion {
    public  abstract int calcularDiasParaLibro(Libro libro);
    public  abstract int calcularDiasParaDisco(Disco disco);
    public abstract int calcularDiasParaRevista(Revista revista);
}
