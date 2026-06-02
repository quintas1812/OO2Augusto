package com.unrn.double_dispatch.compras;

public abstract class TipoCliente {
    protected abstract float calcularEnvioParaProducto();
    protected abstract float calcularImpuestoParaServicio();

}

