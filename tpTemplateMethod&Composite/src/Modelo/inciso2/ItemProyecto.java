package Modelo.inciso2;


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
     abstract void agregarItem(ItemProyecto item);

    public long calcularHoras(){
        long horasTotales = this.horas.toHours();
        for (ItemProyecto item : subItem) {
            horasTotales += item.calcularHoras();
        }
        return  horasTotales;
    }
}
