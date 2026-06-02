package com.unrn.strategy.ejercicio1;

public class CapitalFederal implements Destino{
    @Override
    public float calcularEnvioCorreoArg(int km) {
        return 500;
    }

    @Override
    public float calcularEnvioColectivoSur() {
        return 1000;
    }
    // Colectivos Sur: Si el destino es Capital Federal hay un costo fijo de 1000 pesos. Si el destino es
    //gran buenos aires el monto fijo es de 1500 pesosos
}
