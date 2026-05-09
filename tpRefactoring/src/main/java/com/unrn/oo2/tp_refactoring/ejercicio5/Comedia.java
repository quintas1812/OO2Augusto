package com.unrn.oo2.tp_refactoring.ejercicio5;



public class Comedia extends Tipo {
    private final static int MONTO_INICIAL = 30000;
    private final static int CANT_ESPECTADORES =20; //si supera esta cantidad habra un descuento
    @Override
    public double calcularMonto(int cantEspectadores) {
        double monto = MONTO_INICIAL;
        if (cantEspectadores > CANT_ESPECTADORES) {
            monto += 10000 + 500 * (cantEspectadores - CANT_ESPECTADORES);
        }
        monto += 300 * cantEspectadores;
        return monto;
    }

    @Override
    public double creditosExtras(int cantEspectadores) {
        return Math.floor(cantEspectadores / 5);
    }
}
