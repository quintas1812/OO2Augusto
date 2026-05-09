package com.unrn.oo2.tp_refactoring.ejercicio4;

import org.jdbi.v3.core.Jdbi;
import java.util.List;
import java.util.Optional;

public class PersonaRepository {

    private final Jdbi jdbi;

    public PersonaRepository(Jdbi jdbi) {
        this.jdbi = jdbi;
    }

    /**
     * Busca por nombre a parte
     */
    public List<Persona> buscarPorNombre(String nombreOParte) {
        return jdbi.withHandle(handle -> 
            handle.createQuery("select nombre, apellido from persona where nombre like :nombre")
                .bind("nombre", "%" + nombreOParte + "%")
                .map((rs, ctx) -> new Persona(rs.getString("nombre"), rs.getString("apellido")))
                .list()
        );
    }

    /**
     * Dado un id, retorna:
     * - Optional.empty() si el id no se encuentra en la BD
     * - la instancia de Persona encontrada
     */
    public Optional<Persona> buscarId(Long id) {
        return jdbi.withHandle(handle -> 
            handle.createQuery("select nombre, apellido from persona where id_persona = :id")
                .bind("id", id)
                .map((rs, ctx) -> new Persona(rs.getString("nombre"), rs.getString("apellido")))
                .findOne()
        );
    }
}
