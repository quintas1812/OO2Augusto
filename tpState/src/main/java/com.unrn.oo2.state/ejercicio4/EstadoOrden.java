package com.unrn.oo2.state.ejercicio4;

public interface EstadoOrden {
    public void confirmarCompra();
    public void enviar();
    public void cancelar();
    public void agregarProducto(Producto producto);
}
