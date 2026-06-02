package com.unrn.oo2.state.ejercicio4;

import static com.unrn.oo2.state.ejercicio4.OrdenDeCompra.*;

public class Cancelada implements EstadoOrden{
   private OrdenDeCompra orden;

    public Cancelada(OrdenDeCompra orden) {
        this.orden = orden;
    }

    @Override
    public void confirmarCompra() {
        throw new IllegalStateException(MSG_ERROR_PREPARACION);
    }

    @Override
    public void enviar() {
        throw new IllegalStateException(MSG_ERROR_ENVIAR);

    }

    @Override
    public void cancelar() {
        throw new IllegalStateException(MSG_ERROR_CANCELAR);
    }

    @Override
    public void agregarProducto(Producto producto) {
        throw new IllegalStateException(MSG_ERROR_PREPARACION);
    }
    @Override
    public String toString() {
        return "CANCELADA";
    }
}
