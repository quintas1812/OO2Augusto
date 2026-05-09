package  com.unrn.oo2.tp4.ejemploComposite;
import java.util.ArrayList;
import java.util.List;

public class Proyecto {
    private List<ItemProyecto> tareas = new ArrayList<>();
    private PrintConsola printer;

    public Proyecto(PrintConsola printer) {
        this.printer = printer;
    }

    public void agregar(ItemProyecto tarea) {
        tareas.add(tarea);
    }

    public void mostrar() {
        for (ItemProyecto tarea : tareas) {
            tarea.mostrarTarea("");
        }
    }
}