package Modelo.ejemploComposite;

public class Tarea implements ItemProyecto {
    private final String nombre;
    private PrintConsola printer;

    public Tarea(String nombre, PrintConsola printer) {
        this.nombre = nombre;
        this.printer = printer;
    }

    @Override
    public void mostrarTarea(String indent) {
        this.printer.println(indent + "- " + this.nombre);
    }
}
