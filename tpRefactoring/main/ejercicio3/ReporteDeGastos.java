package oop2.tp3.ejercicio3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class ReporteDeGastos {
    private static final String CENA = "Cena";
    private static final String DESAYUNO = "Desayuno";
    private  List<Gasto> gastos = new ArrayList<>();
    public String imprimir () {
        int total = 0;
        int gastosDeComida = 0;
        StringBuilder reporte = new StringBuilder().append("Expenses ").append(LocalDate.now().toString()).append("\n");
        for (Gasto gasto : gastos) {
            gastosDeComida += gasto.monto();
            String nombreGasto = gasto.tipoGasto.tipo();
            String marcaExcesoComidas = getMarca(gasto);

            reporte.append(nombreGasto).append("\t").append(gasto.monto).append("\t").append(marcaExcesoComidas)
                    .append(System.lineSeparator());
            total += gasto.monto;
        }
        reporte.append("Gastos de comida: ").append(gastosDeComida).append("\n").append("Total de gastos: ").append(total);
        return reporte.toString();
    }
    private static String getMarca(Gasto gasto) {
        return gasto.tipoGasto.estaExcedido(gasto.monto);
    }
    public void agregarGasto (Gasto gasto){
        this.gastos.add(gasto);
    }
}
