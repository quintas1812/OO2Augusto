package oop2.tp3.ejercicio4;

import org.jdbi.v3.core.Jdbi;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        Jdbi jdbi = Jdbi.create("jdbc:hsqldb:mem;create=true");
        new SetUpDatabase(jdbi).setUp();
        var repo = new PersonaRepository(jdbi);
        var personas = repo.buscarPorNombre("Vla");

        if (personas.isEmpty()) {
            System.out.println("No se encontraron personas");
        }
        for (Persona persona : personas) {
            System.out.println(persona.nombre() + " " + persona.apellido());
        }
        Optional<Persona> persona = repo.buscarId(10000L);
        if (persona.isEmpty()) {
            System.out.println("No se encontro la persona");
        }
        System.out.println(persona.get().nombre() + " " + persona.get().apellido());
    }
}
