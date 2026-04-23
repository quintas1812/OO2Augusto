package ejercicio3;

public class EjemploDeUsoDelReporte {
    public static void main(String[] args) {
        TipoDeGasto desayuno = new Desayuno();
        TipoDeGasto cena = new Cena();
        ReporteDeGastos reporte = new ReporteDeGastos();
        Gasto g1 = new Gasto(cena, 5000);
        Gasto g2 = new Gasto(desayuno, 10000);
        reporte.agregarGasto(g1);
        reporte.agregarGasto(g2);
        System.out.println(reporte.imprimir());
    }
}