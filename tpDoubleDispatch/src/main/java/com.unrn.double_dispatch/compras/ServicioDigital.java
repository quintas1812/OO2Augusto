package com.unrn.double_dispatch.compras;

public class ServicioDigital extends Producto {
    public ServicioDigital(String nombre, float precio, float iva) {
            super(precio, iva, nombre);
    }
    @Override
    public float calcularEnvioParaCliente(TipoCliente tipo) {
        return 0;//el envio de un servicio digital es gratis para todos los tipos de clientes
    }
    @Override
    protected float calcularImpuestoParaCliente(TipoCliente tipo) {
       return this.precio * tipo.calcularImpuestoParaServicio();
       //si el tipo de cliente es regular retorna 0.10 si es corporativo retorna 0
    }

//    @Override
//    public float costoEnvio(TipoCliente tipo) {
//        return 0;
//    }
//
//    @Override
//    public float impuesto(TipoCliente tipo) {
//        if (tipo.equals(TipoCliente.REGULAR)) {
//            return this.precio * 0.10f;
//        }
//        return 0;
//    }
}
