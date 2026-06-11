package com.unrn.oo2.tp4.laserx;
public class MandoMedio extends Empleado {
    public MandoMedio(String nombre, float salario) {
        super(nombre, salario);
    }

    @Override
    boolean PuedeAgregarA(Empleado empleado) {
        return empleado.mandoMedioMePuedeAgregar();
    }
    @Override
    boolean directorMePuedeAgregar() {
        return false;
    }

    @Override
    boolean gerenteMePuedeAgregar() {
        return true;
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
        return "Mando Medio";
    }
    //    public void asiganarEmpleadoRegular(LiderProyecto regular){
//        this.empleados.add(regular);
//    }
}
