package com.unrn.double_dispatch.compras;

public class ProductoFisico extends Producto {
    public static final float IVA = 0.21f;
    int peso;
    public ProductoFisico(String nombre, float precio, int peso) {
        super(precio, IVA, nombre);
        this.peso = peso;
    }
    @Override
    protected float calcularEnvioParaCliente(TipoCliente tipo) {
        var costo = this.precio * this.peso;
        return costo - (costo * tipo.calcularEnvioParaProducto());
        // si el tipo es corporativo retorna 0.5 , si es regular retorna 0
    }
    @Override
    protected float calcularImpuestoParaCliente(TipoCliente tipo) {
        //aca no importa el tipo de cliente siempre retorna el mismo valor
        return this.precio * this.iva;
    }
//
//    @Override
//    public float costoEnvio(TipoCliente tipo) {
//        var costo = this.precio * peso;
//        if (tipo.equals(TipoCliente.CORPORATIVO)) {
//            return costo - (costo * 0.5f);
//        }
//        return costo;
//    }
//
//    @Override
//    public float impuesto(TipoCliente tipo) {
//        return this.precio * iva;
//    }
}
