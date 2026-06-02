package com.unrn.oo2.state.ejercicio4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.unrn.oo2.state.ejercicio4.OrdenDeCompra.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestOrdenCompra {
    @Test
    @DisplayName("verifica el monto y el estado tiene que ser en preparacion luego de confirmar la compra")
    public void testConfirmarCompra() {
        Producto p = new Producto("Producto 1", 100);
        OrdenDeCompra orden = new OrdenDeCompra();
        orden.agregarProducto(p);
        orden.confirmarCompra();
        assertEquals(100, orden.monto(), 0.01);
        assertEquals("EN_PREPARACION", orden.estado());
    }

    @Test
    @DisplayName("verifica que no se puedan agregar productos si la orden esta en estado iniciada")
    public void testAgregarProducto() {
        Producto p = new Producto("Producto 1", 100);
        OrdenDeCompra orden = new OrdenDeCompra();
        orden.agregarProducto(p);
        orden.confirmarCompra();
        Producto p2 = new Producto("Producto 2", 100);
        IllegalStateException exc = assertThrows(IllegalStateException.class, () -> orden.agregarProducto(p2));
        assertEquals(OrdenDeCompra.MSG_ERROR_AGREGAR_PRODUCTO, exc.getMessage());
    }

    @Test
    @DisplayName("verifica que se lancen las excepciones correspondientes al confirmar la compra")
    public void testExcepcionesConfirmarCompra() {
        Producto p = new Producto("Producto 1", 100);
        OrdenDeCompra orden = new OrdenDeCompra();
        IllegalStateException exc = assertThrows(IllegalStateException.class, () -> orden.confirmarCompra());
        assertEquals(MSG_ERROR_SIN_PRODUCTOS, exc.getMessage());
        orden.agregarProducto(p);
        orden.confirmarCompra();//confirmo para cambiarle el estado a en preparacion
        exc = assertThrows(IllegalStateException.class, () -> orden.confirmarCompra());
        assertEquals(MSG_ERROR_PREPARACION, exc.getMessage());
    }

    @Test
    public void testEnviar() {
        Producto p = new Producto("Producto 1", 100);
        OrdenDeCompra orden = new OrdenDeCompra();
        orden.agregarProducto(p);
        orden.confirmarCompra();
        orden.enviar();
        assertEquals("ENVIADA", orden.estado());
    }

    @Test
    public void testExcepcionesEnviar() {
        Producto p = new Producto("Producto 1", 100);
        OrdenDeCompra orden = new OrdenDeCompra();
        IllegalStateException exc = assertThrows(IllegalStateException.class, () -> orden.enviar());
        assertEquals(MSG_ERROR_ENVIAR, exc.getMessage());
    }

    @Test
    public void testCancelar() {
        Producto p = new Producto("Producto 1", 100);
        OrdenDeCompra orden = new OrdenDeCompra();
        orden.agregarProducto(p);
        orden.confirmarCompra();
        orden.cancelar();
        assertEquals("CANCELADA", orden.estado());
    }
    @Test
    public void testExepcionesCancelar() {
        Producto p = new Producto("Producto 1", 100);
        OrdenDeCompra orden = new OrdenDeCompra();
        orden.agregarProducto(p);
        orden.confirmarCompra();
        orden.enviar();
        IllegalStateException exc = assertThrows(IllegalStateException.class, () -> orden.cancelar());
        assertEquals(MSG_ERROR_CANCELAR, exc.getMessage());
    }
}
