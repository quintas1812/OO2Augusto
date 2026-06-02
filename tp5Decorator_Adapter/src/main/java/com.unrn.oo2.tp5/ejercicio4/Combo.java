package com.unrn.oo2.tp5.ejercicio4;

import java.util.List;

public abstract class Combo implements Pedido {
    private String descripcion;
    private float precio;
    public Combo(float precio, String descripcion){
        this.precio = precio;
        this.descripcion = descripcion;
    }


    @Override
    public String Descripcion() {
        return this.descripcion;
    }

    @Override
    public float Precio() {
        return this.precio;
    }
}
/*. Un restaurante de comidas rápidas ofrece 3 tipos de combos (Combo Básico, Combo
Familiar, Combo Especial). De cada combo podemos conocer su descripción que nos detalla
el contenido del combo, y por otro lado podemos conocer su precio.
El restaurante también ofrece la posibilidad de aumentar el pedido mediante diferentes
porciones adicionales (Tomate, Papas, Carne, Queso). Cada porción que se agrega al combo
tiene un costo adicional.
Se desea crear un sistema de pedidos que permita al usuario seleccionar el combo deseado, así
como armar su propio pedido con las porciones adicionales que desee. El sistema deberá
informar sobre el pedido del usuario detallando su descripción y el valor total del mismo.
a) Aplique el patrón Decorator para diseñar el modelo de clases que de solución al problema
planteado.
*/