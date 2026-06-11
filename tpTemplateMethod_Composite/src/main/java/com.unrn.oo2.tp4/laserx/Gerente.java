package com.unrn.oo2.tp4.laserx;

public class Gerente extends Empleado {
    public Gerente(String nombre, float salario) {
        super(nombre, salario);
    }

    @Override
    boolean PuedeAgregarA(Empleado empleado) {
        return empleado.gerenteMePuedeAgregar();
    }

    @Override
    boolean directorMePuedeAgregar() {
        return true;
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
        return false;
    }
    @Override
    public String toString() {
        return "Gerente";
    }


    //  public void asiganarMandoMedio(MandoMedio medio){
    //    this.empleados.add(medio);
    //}
}
