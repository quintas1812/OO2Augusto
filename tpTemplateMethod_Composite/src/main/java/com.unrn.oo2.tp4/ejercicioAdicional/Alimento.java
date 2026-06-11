package com.unrn.oo2.tp4.ejercicioAdicional;

public class Alimento extends Producto{
    public static final double IMPUESTOS = 0.05;
    public static final double DESCUENTOS =  0.15;
    public static final double MONTO_DESCUENTO = 100;
    public static final double MONTO_ENVIO_GRATIS = 200;

    public Alimento(double precio) {
        super(precio);
    }
    @Override
    public double impuesto() {
        return IMPUESTOS;
    }
    @Override
    public double descuento() {
        return DESCUENTOS;
    }
    @Override
    public double montoDeDescuento() {
        return MONTO_DESCUENTO;
    }
    @Override
    public double montoDeEnvioGratis() {
        return MONTO_ENVIO_GRATIS;
    }
}
