package com.unrn.oo2.tp4.inciso5;


public class RemeraNacional extends Remera {
 private final float BONIFICACION = 0.2F; // 20% de bonificacion
 private final float RECARGO_TRANSPORTE = 0.015F;// 1.5% de recargo de transporte
 private final float REGARGO_COMERCIO= 0.15F; // 15% de recargo del comercio

    public RemeraNacional(float precio) {
        super(precio);
    }

    @Override
    float recargoUnitario() {
        return 1-BONIFICACION; // ES UN DESCUENTO
    }

    @Override
    float recargoImpuesto() {// RECARGO POR TRANSPORTE
        return RECARGO_TRANSPORTE;
    }

    @Override
    float recargoDeComercio() {
        return REGARGO_COMERCIO;
    }
}
