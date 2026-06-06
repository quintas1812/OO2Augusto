package com.unrn.double_dispatch.ejercicio5;

import java.time.Year;

import static com.unrn.double_dispatch.ejercicio5.Revista.DIAS_PRESTACION;

public class Deteriorado extends Condicion{
    @Override
    public int calcularDiasParaLibro(Libro libro) {
        return (libro.cantPaginas() + 99) / 100; // redondeo hacia arriba ejemplo si son 101 pag retorna 2 dias
    }

    @Override
    public int calcularDiasParaDisco(Disco disco) {
        if(disco.año().isBefore(Year.of(1980))){
                throw new RuntimeException("no se puede prestar en estas condiciones");
        }
        return 4; // a los 5 dias base le resto 1 dia
    }

    @Override
    public int calcularDiasParaRevista(Revista revista) { // EN DETERIORADO REDUCE 3 DIAS SI LA REVISTA TIENE MAS DE 10 AÑOS DE PUBLICADA, SINO LE REDUCE 1 DIA AL DIAS BASE Q ES 5
        return revista.fechaPublicacion().isBefore(Year.now().minusYears(10)) ? DIAS_PRESTACION -3 : DIAS_PRESTACION -1;
    }
}