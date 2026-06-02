package com.unrn.oo2.state.ejercicio1;

public class EstadoCerrado implements EstadoPuerta {
   private Puerta puerta;

    public EstadoCerrado(Puerta puerta) {
        this.puerta = puerta;
    }

    @Override
    public void abrir() {
        this.puerta.cambiarEstado(new EstadoAbierto(this.puerta));
        System.out.print("Abriendo la puerta...");
    }
    @Override
    public void cerrar() {
        System.out.println("no se puede cerrar una puerta cerrada");
    }
    @Override
    public String toString() {
        return "CERRADA" ;
    }
}
