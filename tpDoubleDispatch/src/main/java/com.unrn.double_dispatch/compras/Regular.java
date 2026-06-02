package com.unrn.double_dispatch.compras;
public class Regular extends TipoCliente {
     static final int DESCUENTO_ENVIO_PRODUCTO = 0;
    public static final float DESCUENTO_IMPUESTO_SERVICIO = 0.10f;
    @Override
    protected float calcularEnvioParaProducto() {
        return DESCUENTO_ENVIO_PRODUCTO;
    }

    @Override
    protected float calcularImpuestoParaServicio() {
        return DESCUENTO_IMPUESTO_SERVICIO;
    }
}
