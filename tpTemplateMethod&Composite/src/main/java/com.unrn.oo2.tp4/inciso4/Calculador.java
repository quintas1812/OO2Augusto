package com.unrn.oo2.tp4.inciso4;

import static java.time.LocalDate.now;
import static java.time.Month.of;

public abstract class Calculador {
    protected int mesEnPromocion; // Cambiado a protected para que las subclases puedan acceder si es necesario
    protected LogTransaction log; // Cambiado a protected para que las subclases puedan usarlo

    public Calculador(int mesEnPromocion, LogTransaction log) {
        this.mesEnPromocion = mesEnPromocion;
        this.log = log;
    }

    public final double calcularPrecio(double precioProducto) {
        double precioTotal = precioProducto;
        
        if (of(this.mesEnPromocion).equals(now().getMonth())) {
            // Es el mes de promoción
            precioTotal += precioProducto * recargoMismoMes();
        } else {
            // NO es el mes de promoción
            precioTotal += precioProducto * recargoDistintomes();
        }
        
        log.log("Cálculo de precio para " + nombre() + " finalizado. Precio base: " + precioProducto + ", Precio final: " + precioTotal);
        return precioTotal;
    }

    public abstract String nombre();
    protected abstract float recargoMismoMes(); // Renombrado para mayor claridad
    protected abstract float recargoDistintomes(); // Renombrado para mayor claridad
}
