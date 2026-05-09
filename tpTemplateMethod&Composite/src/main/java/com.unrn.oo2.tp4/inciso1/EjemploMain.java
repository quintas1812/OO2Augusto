package com.unrn.oo2.tp4.inciso1;


public class EjemploMain {
    public static void main(String[] args){
        Director director = new Director("augusto", 110);
        Gerente gerente= new Gerente("daniel",100);
        Gerente gerente2= new Gerente("juan",100);
        MandoMedio mandomedio = new MandoMedio("carina", 70);
        EmpleadoRegular regular= new EmpleadoRegular("morena", 50);
        
        director.asiganarGerente(gerente);
        director.asiganarGerente(gerente2);
        gerente.asiganarMandoMedio(mandomedio);
        mandomedio.asiganarEmpleadoRegular(regular);
        
        System.out.println("Salario Director: " + director.calcularSalario());
        System.out.println("Salario Empleado Regular: " + regular.calcularSalario());
    }
}
