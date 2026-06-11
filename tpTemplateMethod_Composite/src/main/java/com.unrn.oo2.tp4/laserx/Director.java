package com.unrn.oo2.tp4.laserx;
public class Director extends Empleado{
    public Director(String nombre, float salario) {
        super(nombre, salario);
    }
    @Override
    boolean PuedeAgregarA(Empleado empleado) {
        return empleado.directorMePuedeAgregar();
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
        return false;
    }
    @Override
    public String toString() {
        return "Director";
    }

    //public void asiganarGerente(Gerente gerente){
    //  this.empleados.add(gerente);
   // }
}
