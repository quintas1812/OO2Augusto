package ejercicio5;

import java.util.List;

public class Calculador {

    public String reporte(Factura factura, List<Evento> eventos) {
        float totalAmount = 0;
        float creditos = 0;
        var result = "Facturación para " + factura.nombreCliente() + System.lineSeparator();
        var actuaciones = factura.actuaciones();
        for (var actuacion : actuaciones) {
            double monto = 0;
            var tipo = eventos.stream()
                    .filter(e -> e.nombreEvento().equals(actuacion.nombreEvento()))
                    .findFirst()
                    .orElseThrow(() -> new RuntimeException("Evento no encontrado"))
                    .tipo();
            monto = tipo.calcularMonto(actuacion.numberoEspectadores());
            // creditos a ganar
            creditos += Math.max(actuacion.numberoEspectadores() - 30, 0);
            // creditos extras para comedia
            creditos += tipo.creditosExtras(actuacion.numberoEspectadores());
            result += actuacion.nombreEvento() + ": " + monto + ". Asientos: " + actuacion.numberoEspectadores() + System.lineSeparator();//` ${play.name}: ${format(thisAmount/100)} (${perf.audience} seats)\n`;
            totalAmount += monto;
        }
        result += "Monto ganado: " + totalAmount + System.lineSeparator();
        result += "Créditos ganados: " + creditos + System.lineSeparator();

        return result;
    }
}
