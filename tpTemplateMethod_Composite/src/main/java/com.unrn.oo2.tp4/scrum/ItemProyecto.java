package com.unrn.oo2.tp4.scrum;


import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public abstract class ItemProyecto {
    protected String nombre;
    protected Duration horas;
    protected List<ItemProyecto> subItem;
    public ItemProyecto(String nombre, Duration horas) {
        this.horas = horas;
        this.subItem = new ArrayList<>();
        this.nombre = nombre;
    }
    public long calcularHoras(){
        long horasTotales = this.horas.toHours();
        for (ItemProyecto item : subItem) {
            horasTotales += item.calcularHoras();
        }
        return  horasTotales;
    }

// ejercicio del tp double dispatch agregar las siguientes validaciones:
    // TareaCompleja puede ser una HU o una Epica
    // HU solo permite TareaSimple
    // Epica solo permite Spikes
    // Spike solo permite TareaSimple
    //TareaSimple no se le pueden agregar ningun tipo de tareas

    public  void agregarItem(ItemProyecto item){
        if(this.puedeAgregarA(item)){
            this.subItem.add(item);
        }
        else {
            throw new RuntimeException("el " +this +" no puede agregar a " + item.toString());
        }
    }
    abstract boolean puedeAgregarA(ItemProyecto item);
    abstract boolean ComplejaMePuedeAgregar();
    abstract boolean HUmePuedeAgregar();
    abstract boolean EpicaMePuedeAgregar();
    abstract boolean SpikeMePuedeAgregar();

}
