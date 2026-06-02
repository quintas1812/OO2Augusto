package com.unrn.strategy.ejercicio1;

import java.util.List;

public class ColectivoSur implements EnvioStrategy{

    @Override
    public float calcular(List<Producto> productos, Destino destino) {
        float costo = destino.calcularEnvioColectivoSur();
        int peso = 0;
        for (Producto producto : productos) {
            peso += producto.peso();
            costo += producto.precio();
        }
        if(peso >5 && peso <=30){
            costo+= 500;
        } else if (peso > 30) {
            costo += 2000;
        }
        return costo;
    }

}
// Colectivos Sur: Si el destino es Capital Federal hay un costo fijo de 1000 pesos. Si el destino es
//gran buenos aires el monto fijo es de 1500 pesos. Cualquier otro destino el monto fijo es 3000
//pesos. Además, si el peso total de los productos superan los 5kg (hasta 30kg), se le agrega un
//adicional de 500 pesos. Pasados los 30kg el adicional es de 2000 pesos.
