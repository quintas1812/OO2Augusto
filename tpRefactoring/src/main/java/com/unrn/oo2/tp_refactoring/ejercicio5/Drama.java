package com.unrn.oo2.tp_refactoring.ejercicio5;
public class Drama extends Tipo {
    private final static int MONTO_INICIAL = 40000;
    private final static int CANT_ESPECTADORES =30; //si supera esta cantidad habra un descuento
    @Override
    public double calcularMonto(int cantEspectadores) {
        double monto = MONTO_INICIAL;
        if (cantEspectadores > CANT_ESPECTADORES) {
            monto += (cantEspectadores - CANT_ESPECTADORES) * 1000;
        }
        return monto;
    }

    @Override
    public double creditosExtras(int cantEspectadores) {
        return 0;
    }
}
