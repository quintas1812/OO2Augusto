package Modelo.inciso1;
public class Gerente extends Empleado {
    public Gerente(String nombre, float salario) {
        super(nombre, salario);
    }
    public void asiganarMandoMedio(MandoMedio medio){
        this.empleados.add(medio);
    }
}
