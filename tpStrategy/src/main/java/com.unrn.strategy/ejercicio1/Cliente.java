package com.unrn.strategy.ejercicio1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Cliente {
List<Producto> productos = new ArrayList<>();

    public void agregarProductos(Producto producto) {
        productos.add(producto);
    }
    public float calcularEnvio(EnvioStrategy opcion, Destino destino){
        return opcion.calcular(this.productos, destino);
    }
}
/*1. Una empresa que se dedica a la comercialización de productos informáticos a través de
internet ofrece a sus clientes la posibilidad de optar entre diferentes formas de envío de los
productos. El cliente va almacenando productos en su carrito de compras y finalmente el sistema
calcula el costo total incluyendo el envío. El costo total será la suma de precio de cada producto
del carrito, más el envío que cada compañía ofrece su forma de cálculo específica.
- Colectivos Sur: Si el destino es Capital Federal hay un costo fijo de 1000 pesos. Si el destino es
gran buenos aires el monto fijo es de 1500 pesos. Cualquier otro destino el monto fijo es 3000
pesos. Además, si el peso total de los productos superan los 5kg (hasta 30kg), se le agrega un
adicional de 500 pesos. Pasados los 30kg el adicional es de 2000 pesos.
- Correo Argentino: Si el destino es Capital Federal se cobra un monto fijo de 500 pesos.
Cualquier otro destino, se cobra un fijo de 800, más un monto que sale de calcular 5$
multiplicado por la cantidad de kilómetros entre Capital Federal y el destino. Ésta distancia la
brinda un servicio externo Web: http://distancia.ar?orgen=capital&destino=xxx (Este servicio no
existe, es simplemente para ilustrar el ejercicio). El sistema debe permitir al cliente optar por
cualquier forma de envío e informarle el costo asociado a la opción elegida.*/