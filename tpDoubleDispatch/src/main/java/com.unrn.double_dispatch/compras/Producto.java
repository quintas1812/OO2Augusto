package com.unrn.double_dispatch.compras;

public abstract class Producto {
    protected float precio;
    protected float iva;
    protected String nombre;
    public Producto(float precio, float iva, String nombre) {
        this.precio = precio;
        this.iva = iva;
        this.nombre = nombre;
    }
    float precio(){return this.precio;}
    public float costoEnvio(TipoCliente tipo){
        return calcularEnvioParaCliente(tipo);
    }
    protected abstract float calcularEnvioParaCliente(TipoCliente tipo);
    public  float impuesto(TipoCliente tipo){
        return calcularImpuestoParaCliente(tipo);
    }
    protected abstract float calcularImpuestoParaCliente(TipoCliente tipo);
}
