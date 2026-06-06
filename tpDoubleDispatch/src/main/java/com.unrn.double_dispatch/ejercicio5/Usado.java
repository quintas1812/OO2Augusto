package com.unrn.double_dispatch.ejercicio5;

import java.time.Year;

public class Usado extends Condicion{
    @Override
    public int calcularDiasParaLibro(Libro libro) {
        return (libro.cantPaginas() + 99) / 100; // redondeo hacia arriba ejemplo si son 101 pag retorna 2 dias
    }

    @Override
    public int calcularDiasParaDisco(Disco disco) {
        return disco.año().isBefore(Year.of(1980)) ? 3 : 5; // retorna 3 si es antes de 1980 sino 5
    }

    @Override
    public int calcularDiasParaRevista(Revista revista) {
        if (revista.cantPaginas() < 100) return 2;
        return revista.cantPaginas() < 2000 ? 3 : 5;
    }
}