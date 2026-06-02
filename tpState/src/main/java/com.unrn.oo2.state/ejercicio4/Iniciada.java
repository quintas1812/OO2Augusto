package com.unrn.oo2.state.ejercicio4;

import static com.unrn.oo2.state.ejercicio4.OrdenDeCompra.*;

public class Iniciada implements EstadoOrden{
    private OrdenDeCompra orden;

    public Iniciada(OrdenDeCompra orden) {
        this.orden = orden;
    }
    @Override
    public void confirmarCompra() {
        if (this.orden.productos().isEmpty()) {
            throw new IllegalStateException(MSG_ERROR_SIN_PRODUCTOS);
        }
        this.orden.cambiarEstado(new EnPreparacion(this.orden));

    }

    @Override
    public void enviar() {
        throw new IllegalStateException(MSG_ERROR_ENVIAR);
    }

    @Override
    public void cancelar() {
        this.orden.cambiarEstado(new Cancelada(this.orden));

    }

    @Override
    public void agregarProducto(Producto producto) {
        this.orden.productos(producto);
    }

    @Override
    public String toString() {
        return "INICIADA";
    }
}
