package com.unrn.strategy.ejercicio1;

import java.util.List;

public class CorreoArg implements EnvioStrategy {
    private CalcularDistancia calcularDistancia = (D)-> 50; // Simulamos el servicio externo con un valor fijo de 50 kilómetros

    @Override
    public float calcular(List<Producto> productos, Destino destino) {

        float costo = destino.calcularEnvioCorreoArg(calcularDistancia.precioPorDistancia(destino));
        for (Producto producto : productos) {
            costo += producto.precio();
        }
        return costo;
    }


}
//Correo Argentino: Si el destino es Capital Federal se cobra un monto fijo de 500 pesos.
//Cualquier otro destino, se cobra un fijo de 800, más un monto que sale de calcular 5$
//multiplicado por la cantidad de kilómetros entre Capital Federal y el destino. Ésta distancia la
//brinda un servicio externo Web: http://distancia.ar?orgen=capital&destino=xxx (Este servicio no
//existe, es simplemente para ilustrar el ejercicio). El sistema debe permitir al cliente optar por
//cualquier forma de envío e informarle el costo asociado a la opción elegida.*/