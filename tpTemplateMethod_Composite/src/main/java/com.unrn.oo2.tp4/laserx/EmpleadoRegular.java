package com.unrn.oo2.tp4.laserx;

public class EmpleadoRegular extends  Empleado{
    public EmpleadoRegular(String nombre, float salario) {
        super(nombre, salario);
    }

    @Override
    boolean PuedeAgregarA(Empleado empleado) {
        return false;
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
        return false;
    }

    @Override
    boolean LiderProyectoMePuedeMeAgregar() {
        return true;
    }
    @Override
    public String toString() {
        return "Empleado Regular";
    }


}
