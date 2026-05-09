package com.unrn.oo2.tp4.inciso5;


public class RemeraImportada extends  Remera{
    private final float RECARGO_UNITARIO = 0.03F; // 3% de recargo unitario
    private final float RECARGO_ADUANA = 0.05F;// 5% de impuesto aduanero
    private final float REGARGO_COMERCIO= 0.20F; // 20% de recargo de comercio

    public RemeraImportada(float precio) {
        super(precio);
    }

    @Override
    float recargoDeComercio() {
        return 1 + REGARGO_COMERCIO;
    }
    @Override
    float recargoUnitario() {
        return RECARGO_UNITARIO;
    }

    @Override
    float recargoImpuesto() {
        return RECARGO_ADUANA;
    }
}
