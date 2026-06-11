package com.unrn.oo2.tp2.ejercicio2;

import com.unrn.oo2.tp2.ejercicio2.itempedidos.ItemPedido;
import com.unrn.oo2.tp2.ejercicio2.tarjetas.TarjetaCredito;

import java.util.ArrayList;
import java.util.List;

public class Restaurante extends Observado{
    private int porcentajeDePropina;
   private List<Observer> observers;
private Save1 save ;
    public Restaurante(List<Observer> observers, Save1 save1) {
        super(observers); this.save = save1;
    }

    public float RealizarPedido(ArrayList<ItemPedido> consumiciones, TarjetaCredito tarjeta, int porcentajeDePropina){
        float costoTotal = 0;
        float descuentoTotal = 0;
        for (ItemPedido consumicion : consumiciones) {
            costoTotal += consumicion.Precio();
            descuentoTotal +=  consumicion.Precio() * consumicion.aplicarDescuento(tarjeta);
        }
        float montoPropina = (float) (costoTotal * (porcentajeDePropina / 100.0));
        float total = descuentoTotal + montoPropina;
        this.notificar(String.valueOf(total)); // la clase observadora es MontoPedidoUI
        this.save.guardar(String.valueOf(total));
        return total;
    }
}
//Utilizando el ejercicio del restaurante del TP 1 y TP 2, implemente
//utilizando el patrón Observer, una pantalla que tendrá el gerente general del restaurante con el
//monto de la facturación de la última mesa. Cree una pantalla para seleccionar platos, bebidas
//y permita pagar el total. Cada vez que se efectúa una venta, la pantalla del gerente reflejará el
//monto facturado. Si el monto facturado supera los 300.000 pesos, el monto en la pantalla debe
//aparecer de color rojo.