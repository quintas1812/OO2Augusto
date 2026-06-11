package com.unrn.oo2.tp4.inciso4;

import static java.time.LocalDate.now;
public class CalculadorJubilado extends Calculador {
    private final float  RECARGO_MISMO_MES = 0.1F;
    private final float RECARGO_DISTINTO_MES = 0.0F;

    public CalculadorJubilado(int mesEnPromocion, LogTransaction log) {
        super(mesEnPromocion, log);
    }@Override
    public String nombre() {
        return "Jubilado";
    }
    @Override
    public float recargoMismoMes() {
        return  RECARGO_MISMO_MES;
    }
    @Override
    public float recargoDistintomes() {
        return RECARGO_DISTINTO_MES;
    }
}