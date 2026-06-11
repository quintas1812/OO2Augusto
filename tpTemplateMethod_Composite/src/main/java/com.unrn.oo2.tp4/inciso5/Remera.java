package com.unrn.oo2.tp4.inciso5;


public abstract class Remera {
    private float precio;
    public Remera(float precio) {
        this.precio = precio;
    }
    public float calcularPrecio(){
       float total;// como no explicaba en el inciso, asumi q los descuentos son siempre aplicados al precio de la remera
       total = precio * recargoUnitario();
       total += precio * recargoImpuesto();
       total += precio * recargoDeComercio();
       return total;
    }
     abstract float recargoUnitario(); // este es un impuesto unitario o una bonificacion
     abstract float recargoImpuesto(); // este impuesto es de Aduana o transporte (capaz no es tan descriptivo el nombre del metodo)
     abstract float recargoDeComercio();// este lo pone el comercio
}
/*
Además las remeras importadas sobre el precio unitario
tienen un 3% de recargo más un 5% de impuesto aduanero. Por último el comercio aplica un
25% para determinar el precio final.
Las remeras nacionales tienen un recargo de 1,5 % del costo de transporte y una bonificación
del 20%. Por último el comercio aplica un 15% para determinar el precio final.*/
//100=100* 0.80 ----->80 bonificacion --descuento
//100=100* 0.20 ----->120 impuesto unitario-- recarga