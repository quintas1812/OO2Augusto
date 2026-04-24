package Modelo.inciso4;

import static java.time.LocalDate.now;
import static java.time.Month.of;
// template method
public abstract class Calculador {
    private int mesEnPromocion;
    //private LogTransaction log;
    public Calculador(int mesEnPromocion) {
        this.mesEnPromocion = mesEnPromocion;
    }
     public double calcularPrecio(double precioProducto){
            double precioTotal = precioProducto;
            if (of(this.mesEnPromocion).equals(now().getMonth())) {
                precioTotal += precioProducto * recargoMismoMes();
            }
            precioTotal+= precioProducto * recargoDistintomes() ;
            //   log.log(CalculadorJubilado.class.getName());
            return precioTotal;

    }
    public abstract float recargoMismoMes();
     public abstract float recargoDistintomes();
}
