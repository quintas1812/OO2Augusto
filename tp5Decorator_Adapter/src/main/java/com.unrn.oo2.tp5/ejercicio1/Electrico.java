package com.unrn.oo2.tp5.ejercicio1;

public class Electrico {
    public Electrico() {}
    public void conectar() {
        System.out.println("El motor eléctrico se ha conectado.");
    }
    public void desconectar() {
        System.out.println("El motor se ha conectado.");
    }
    public void moverMasRapido() {
        System.out.println("El motor se ha mover mas rapido.");
    }
    public void activar() {
        System.out.println("El motor se ha activado");
    }
    public void desactivar() {
        System.out.println("El motor se ha desactivado");
    }

}
/*Se desea incorporar al sistema una clase ya existente de tipo motor eléctrico con un
funcionamiento diferente al de los demás. Estos motores pueden realizar operaciones como
conectar y activar, moverMasRapido, detener y desconectar.
*/