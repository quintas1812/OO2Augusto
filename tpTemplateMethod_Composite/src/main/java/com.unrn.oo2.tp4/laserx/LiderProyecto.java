package com.unrn.oo2.tp4.laserx;

public class LiderProyecto extends Empleado {
    public LiderProyecto(String nombre, float salario) {
        super(nombre, salario);
    }

    @Override
    boolean PuedeAgregarA(Empleado empleado) {
        return empleado.LiderProyectoMePuedeMeAgregar();
    }

    @Override
    boolean directorMePuedeAgregar() {
        return false;
    }

    @Override
    boolean gerenteMePuedeAgregar() {
        return false;
    }

    @Override
    boolean mandoMedioMePuedeAgregar() {
        return true;
    }

    @Override
    boolean LiderProyectoMePuedeMeAgregar() {
        return false;
    }
    @Override
    public String toString() {
        return "Lider Proyecto";
    }
    //public void asiganarEmpleadoRegular(EmpleadoRegular regular){
    //    this.empleados.add(regular);
}
