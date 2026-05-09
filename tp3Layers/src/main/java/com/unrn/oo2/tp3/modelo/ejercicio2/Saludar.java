package com.unrn.oo2.tp3.modelo.ejercicio2;

public class Saludar {
    private Empleado empleado;
    private Lector lector;
    private Notificador notificador;
    public Saludar(Lector lector, Notificador notificador ) {
        this.lector = lector;
        this.notificador = notificador;
    }
    public void enviar() {
        for (Empleado empleado : lector.read()) {
            if (empleado.esCumple()){
                notificador.notificar( empleado.Email(),empleado.Nombre());
            }
        }
    }

}
