package com.unrn.strategy.ejercicio1;

public class GranBuenosAires implements Destino{

    public static final int PRECIO_CORREOARG_FUERA_CAP = 800;

    @Override
    public float calcularEnvioCorreoArg(int km) {
        return PRECIO_CORREOARG_FUERA_CAP + km*5;
    }

    @Override
    public float calcularEnvioColectivoSur() {
        return 1500;
    }
}/*
Colectivos Sur: Si el destino es Capital Federal hay un costo fijo de 1000 pesos. Si el destino es
gran buenos aires el monto fijo es de 1500 pesos. Cualquier otro destino el monto fijo es 3000
pesos. Además, si el peso total de los productos superan los 5kg (hasta 30kg), se le agrega un
adicional de 500 pesos. Pasados los 30kg el adicional es de 2000 pesos.
- Correo Argentino: Si el destino es Capital Federal se cobra un monto fijo de 500 pesos.
Cualquier otro destino, se cobra un fijo de 800, más un monto que sale de calcular 5$
multiplicado por la cantidad de kilómetros entre Capital Federal y el destino. Ésta distancia la
brinda un servicio externo Web: http://distancia.ar?orgen=capital&destino=xxx (Este servicio no
existe, es simplemente para ilustrar el ejercicio). El sistema debe permitir al cliente optar por
cualquier forma de envío e informarle el costo asociado a la opción elegida.*/