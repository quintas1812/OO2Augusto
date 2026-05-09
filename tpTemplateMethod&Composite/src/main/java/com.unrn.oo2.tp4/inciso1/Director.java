package com.unrn.oo2.tp4.inciso1;
public class Director extends Empleado{
    public Director(String nombre, float salario) {
        super(nombre, salario);
    }
    public void asiganarGerente(Gerente gerente){
        this.empleados.add(gerente);
    }
}
