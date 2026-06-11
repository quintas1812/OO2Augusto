package com.unrn.oo2.tp4.laserx;

import java.util.ArrayList;
import java.util.List;
//ejercicio empresa LaserX
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
    public void agregarEmpleado(Empleado empleado){
        if(this.PuedeAgregarA(empleado)){
            this.empleados.add(empleado);
        }else {
            throw new RuntimeException("el " +this+" no puede agregar a " + empleado.toString());
        }

    }
    abstract boolean PuedeAgregarA(Empleado empleado) ;
    abstract boolean directorMePuedeAgregar();
    abstract boolean gerenteMePuedeAgregar();
    abstract boolean mandoMedioMePuedeAgregar();
    abstract boolean LiderProyectoMePuedeMeAgregar();

    //. Todos tienen gente a su
    //cargo, salvo los empleados regulares. Los directores tienen a su cargo gerentes, los
    //gerentes a mandos medios, los mandos medios a líderes de proyecto y éstos a
    //empleados regulares.

}
