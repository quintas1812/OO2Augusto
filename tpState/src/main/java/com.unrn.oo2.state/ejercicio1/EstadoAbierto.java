package com.unrn.oo2.state.ejercicio1;

public class EstadoAbierto implements EstadoPuerta {
    private Puerta puerta;

    public EstadoAbierto(Puerta puerta) {
        this.puerta = puerta;
    }

    @Override
    public void cerrar() {
        this.puerta.cambiarEstado(new EstadoCerrado(this.puerta));
        System.out.print("Cerrando la puerta...");
    }

    @Override
    public void abrir() {
        System.out.println("NO se puede abrir una puerta abierta");
    }

    @Override
    public String toString() {
        return "ABIERTA" ;
    }
}
