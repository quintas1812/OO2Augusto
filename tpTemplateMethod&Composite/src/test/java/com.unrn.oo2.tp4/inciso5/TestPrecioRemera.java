package com.unrn.oo2.tp4.inciso5;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPrecioRemera {
    @Test
    public void testCalcularRemeraNacional(){
        Remera remera = new RemeraNacional(100);
        assertEquals( 96.5,remera.calcularPrecio(),0.01);
    }
    @Test
    public void testCalcularRemeraImportada(){
        Remera remera = new RemeraImportada(100);
        assertEquals(128.0,remera.calcularPrecio(),0.01);
    }
}
