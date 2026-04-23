package Modelo.inciso1;
public class MandoMedio extends Empleado {
    public MandoMedio(String nombre, float salario) {
        super(nombre, salario);
    }
    public void asiganarEmpleadoRegular(EmpleadoRegular regular){
        this.empleados.add(regular);
    }
}
