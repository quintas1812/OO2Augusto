package Tests.ejercicio1;

import Modelo.ejercicio1.Guardar;
import Modelo.ejercicio1.Participante;

public class FakeGuardar implements Guardar {
    private String nombre;

    @Override
    public void guardar(Participante participante) {
        this.nombre = participante.Nombre();
    }
    public String nombre(){
        return this.nombre;
    }
}
