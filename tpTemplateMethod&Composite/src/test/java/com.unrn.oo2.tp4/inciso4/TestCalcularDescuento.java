package com.unrn.oo2.tp4.inciso4;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import java.time.Month;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalcularDescuento {
    @Test
    public void testCalcularRecargoJubiladosMismoMes(){
        //recargo de 0.10
        LogTransaction log = new ImprimirLogTransaction();
        Month m = LocalDateTime.now().getMonth();
       CalculadorJubilado calculador = new CalculadorJubilado(m.getValue(),log);
       assertEquals(110.0F, calculador.calcularPrecio(100.0), 0.001);
    }
    @Test
    public void testCalcularRecargoJubiladosDistintoMes(){
        //recargo de 0.0
        LogTransaction log = new ImprimirLogTransaction();

        Month m = LocalDateTime.now().getMonth();
        m = m.minus(1);
        CalculadorJubilado calculador = new CalculadorJubilado(m.getValue(),log);
        assertEquals(100.0F, calculador.calcularPrecio(100.0), 0.001);
    }
    @Test
    public void testCalcularRecargoNOJubiladosMismoMes(){
        //recargo de 0.15
        LogTransaction log = new ImprimirLogTransaction();
        Month m = LocalDateTime.now().getMonth();
        CalculadorNoJubilado calculador = new CalculadorNoJubilado(m.getValue(),log);
        assertEquals(115.0F, calculador.calcularPrecio(100.0), 0.001);
    }
    @Test
    public void testCalcularRecargoNOJubiladosDistintoMes(){
        //recargo de 0.21
        LogTransaction log = new ImprimirLogTransaction();
        Month m = LocalDateTime.now().getMonth();
        m = m.minus(1);
        CalculadorNoJubilado calculador = new CalculadorNoJubilado(m.getValue(),log);
        assertEquals(121.0F, calculador.calcularPrecio(100.0), 0.001);
    }
}
