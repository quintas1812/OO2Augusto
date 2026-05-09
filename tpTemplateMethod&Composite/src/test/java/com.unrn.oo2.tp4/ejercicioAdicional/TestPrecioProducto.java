package  com.unrn.oo2.tp4.ejercicioAdicional;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPrecioProducto {
    @Test
    public void testPrecioLibro(){
        Producto libro = new Libro(110);
        assertEquals(98.90, libro.precioFinal(), 0.001);
    }
    @Test
    public void testPrecioMedicina(){
        Producto libro = new Medicina(110);
        assertEquals(89.0, libro.precioFinal(), 0.001);
    }
    @Test
    public void testPrecioOtroPruducto(){
        Producto libro = new OtroProducto(110);
        assertEquals(120.1749, libro.precioFinal(), 0.001);
    }
    @Test
    public void testPrecioAlimento(){
        Producto libro = new Alimento(110);
        assertEquals(98.175, libro.precioFinal(), 0.001);
    }
}
