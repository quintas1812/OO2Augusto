package Modelo.inciso3;

import java.util.ArrayList;
import java.util.List;

public abstract class Seguro {
    protected double costo;
    protected String nombre;
    public static final double PORCENTAJE_DESCUENTO = 0.05;
    private List<Seguro> paquete;
    public double calcularCostoTotal() {
        double total = this.costo;
        for (Seguro seguro : this.paquete) {
            total += this.costo * (1 - PORCENTAJE_DESCUENTO);
        }
        return total;
    }
    public Seguro(String nombre, double costo) {
        this.nombre = nombre;
        this.costo = costo;
        this.paquete = new ArrayList<>();
    }
    public void agregarSeguro(Seguro seguro) {
        this.paquete.add(seguro);
    }
}
