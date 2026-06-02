package com.unrn.oo2.state.ejercicio4;

import static com.unrn.oo2.state.ejercicio4.OrdenDeCompra.MSG_ERROR_AGREGAR_PRODUCTO;
import static com.unrn.oo2.state.ejercicio4.OrdenDeCompra.MSG_ERROR_PREPARACION;

public class EnPreparacion implements EstadoOrden {
    private OrdenDeCompra orden;

    public EnPreparacion(OrdenDeCompra orden) {
        this.orden = orden;
    }

    @Override
    public void agregarProducto(Producto producto) {
        throw new IllegalStateException(MSG_ERROR_AGREGAR_PRODUCTO);
    }

    @Override
    public void confirmarCompra() {
        throw new IllegalStateException(MSG_ERROR_PREPARACION);
    }

    @Override
    public void enviar() {
        this.orden.cambiarEstado(new Enviada(this.orden));
    }

    @Override
    public void cancelar() {
        this.orden.cambiarEstado(new Cancelada(this.orden));
    }
    @Override
    public String toString() {
        return "EN_PREPARACION";
    }
}
