package com.unrn.double_dispatch.compras;

public class Corporativo extends TipoCliente {

    public static final float DESCUENTO_ENVIO_PRODUCTO = 0.5f;
    public static final float DESCUENTO_IMPUESTO_SERVICIO = 0;
    @Override
    protected float calcularEnvioParaProducto() {
        return DESCUENTO_ENVIO_PRODUCTO;
    }

    @Override
    protected float calcularImpuestoParaServicio() {
        return DESCUENTO_IMPUESTO_SERVICIO;
    }
}
