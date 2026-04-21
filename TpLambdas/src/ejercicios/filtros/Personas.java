package oop2.ejercicios.filtros;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Personas {
    private List<Persona> personas = new ArrayList<>();

    public Personas(List<Persona> personas) {
        this.personas = personas;
    }

    //filtra la lista de personas devolviendo otra lista con
    //solo aquellas cuyo nombre comienza con E
    public List<Persona> nombresQueEmpiezanConE() {
        return filtrar((persona) -> persona.nombre().startsWith("E"));
    }

    public List<Persona> nombresCuyaCantidadDeLetrasEsPar() {
        return filtrar((persona) -> persona.nombre().length() % 2 == 0);
    }

    private List<Persona> filtrar(Predicate<Persona> predicate) {
        List<Persona> resultado = new ArrayList<>();
        for (Persona persona : this.personas) {
            if (predicate.test(persona)) {
                resultado.add(persona);
            }
        }
        return resultado;
    }
}
