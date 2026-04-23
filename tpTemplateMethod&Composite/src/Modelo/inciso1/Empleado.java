package Modelo.inciso1;
import java.util.ArrayList;
import java.util.List;

public abstract class Empleado {
    private String nombre;
    private float salario;
    protected List<Empleado> empleados;
    public Empleado(String nombre, float salario) {
        this.nombre = nombre;
        this.salario = salario;
        this.empleados= new ArrayList<>();
    }
    public float calcularSalario(){
        float total = this.salario;
        for (Empleado empleado : this.empleados){
            total += empleado.calcularSalario();
        }
        return total;
    }
}
