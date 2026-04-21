package oop2.tp3.ejercicio1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

public class CalcularPagoTest {
    @Test
    public void testCalcuarAlquilerRegularMenos2dias(){
        Biblioteca biblioteca = new Biblioteca();
        Libro libro1 = new LibroRegular("Narnia");
        CopiaLibro copia1 = new  CopiaLibro(libro1);
        Alquiler alquilerRegularMenos2dias = new Alquiler(copia1, 1);
        Cliente Juan = new Cliente("Juan");
        Juan.alquilar(alquilerRegularMenos2dias);
        double totalDeuda = biblioteca.CalcularPago(Juan);
        int puntosAlquilerFrecuente =  biblioteca.CalcularPuntos(Juan);
        assertEquals(2.0, totalDeuda);
        assertEquals(1, puntosAlquilerFrecuente);
    }
    @Test
    public void testCalcuarAlquilerRegularMas2dias(){
        Biblioteca biblioteca = new Biblioteca();
        Libro libro1 = new LibroRegular("Narnia");
        CopiaLibro copia1 = new  CopiaLibro(libro1);
        Alquiler alquilerRegularMenos2dias = new Alquiler(copia1, 3);
        Cliente Juan = new Cliente("Juan");
        Juan.alquilar(alquilerRegularMenos2dias);
        double totalDeuda = biblioteca.CalcularPago(Juan);
        int puntosAlquilerFrecuente =  biblioteca.CalcularPuntos(Juan);
        assertEquals(3.5, totalDeuda);
        assertEquals(1, puntosAlquilerFrecuente);
    }
    @Test
    public void testCalcuarAlquilerNuevoLanzamiento(){
        Biblioteca biblioteca = new Biblioteca();
        Libro libro2 = new LibroNuevoLanzamiento("El Principito");
        CopiaLibro copia2 = new  CopiaLibro(libro2);
        Alquiler alquilerNuevoLanzamiento = new Alquiler(copia2, 3);
        Cliente Juan = new Cliente("Juan");
        Juan.alquilar(alquilerNuevoLanzamiento);
        double totalDeuda = biblioteca.CalcularPago(Juan);
        int puntosAlquilerFrecuente =  biblioteca.CalcularPuntos(Juan);
        assertEquals(9.0, totalDeuda);
        assertEquals(2, puntosAlquilerFrecuente);
    }
    @Test
    public void testCalcuarAlquilerInfantilMas3dias(){
        Biblioteca biblioteca = new Biblioteca();
        Libro libro3 = new LibroInfantil("Harry Potter");
        CopiaLibro copia3 = new  CopiaLibro(libro3);
        Alquiler alquilerInfantilMenos3dias = new Alquiler(copia3, 4);
        Cliente Juan = new Cliente("Juan");
        Juan.alquilar(alquilerInfantilMenos3dias);
        double totalDeuda = biblioteca.CalcularPago(Juan);
        int puntosAlquilerFrecuente =  biblioteca.CalcularPuntos(Juan);
        assertEquals(3.0, totalDeuda);
        assertEquals(1, puntosAlquilerFrecuente);
    }
    @Test
    public void testCalcuarAlquilerInfantilMenos3dias(){
        Biblioteca biblioteca = new Biblioteca();
        Libro libro3 = new LibroInfantil("Harry Potter");
        CopiaLibro copia3 = new  CopiaLibro(libro3);
        Alquiler alquilerInfantilMenos3dias = new Alquiler(copia3, 2);
        Cliente Juan = new Cliente("Juan");
        Juan.alquilar(alquilerInfantilMenos3dias);
        double totalDeuda = biblioteca.CalcularPago(Juan);
        int puntosAlquilerFrecuente =  biblioteca.CalcularPuntos(Juan);
        assertEquals(1.5, totalDeuda);
        assertEquals(1, puntosAlquilerFrecuente);
    }

    @Test
    public void testCalcuarpuntosAlquilerFrecuente(){
        Biblioteca biblioteca = new Biblioteca();
        Libro libro1 = new LibroRegular("Narnia");
        Libro libro2 = new LibroNuevoLanzamiento("El Principito");
        Libro libro3 = new LibroInfantil("Harry Potter");
        CopiaLibro copia1 = new  CopiaLibro(libro1);
        CopiaLibro copia2 = new  CopiaLibro(libro2);
        CopiaLibro copia3 = new  CopiaLibro(libro3);
        Alquiler alquilerRegularMenos2dias = new Alquiler(copia1, 1);
        Alquiler alquilerRegularMas2dias = new Alquiler(copia1, 3);
        Alquiler alquilerNuevoLanzamiento = new Alquiler(copia2, 3);
        Alquiler alquilerInfantilMas3dias = new Alquiler(copia3, 4);
        Alquiler alquilerInfantilMenos3dias = new Alquiler(copia3, 2);
        Cliente Juan = new Cliente("Juan");
        Juan.alquilar(alquilerRegularMenos2dias);
        Juan.alquilar(alquilerRegularMas2dias);
        Juan.alquilar(alquilerNuevoLanzamiento);
        Juan.alquilar(alquilerInfantilMas3dias);
        Juan.alquilar(alquilerInfantilMenos3dias);
        int puntosAlquilerFrecuente =  biblioteca.CalcularPuntos(Juan);
        // 5 libros + 1 punto de libro nuevo lanzamiento con +1 dia de alquiler
        assertEquals(6, puntosAlquilerFrecuente);
   }
}
