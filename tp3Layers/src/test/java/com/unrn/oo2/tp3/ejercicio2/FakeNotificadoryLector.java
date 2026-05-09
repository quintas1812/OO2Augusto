package com.unrn.oo2.tp3.ejercicio2;

import com.unrn.oo2.tp3.modelo.ejercicio2.Empleado;
import com.unrn.oo2.tp3.modelo.ejercicio2.Lector;
import com.unrn.oo2.tp3.modelo.ejercicio2.Notificador;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FakeNotificadoryLector implements Notificador, Lector {
    private int contarNotificaciones= 0;

    @Override
    public void notificar(String usuario, String nombre) {
        contarNotificaciones++;
    }

    @Override
    public List<Empleado> read() {
       List<Empleado> lista = new ArrayList<>();
        try {
            lista.add(new Empleado("Juan", "Perez", "juan.perez@example.com", LocalDate.now()));
            lista.add(new Empleado("Maria", "Garcia", "maria.garcia@example.com", LocalDate.now()));
            lista.add(new Empleado("Ana", "Martinez", "ana.martinez@example.com",  LocalDate.of(1978, 3, 12)));
            lista.add(new Empleado("Pedro", "Lopez", "pedro.lopez@example.com",LocalDate.of(1990, 3, 10)));
            lista.add(new Empleado("Luis", "Rodriguez", "luis.rodriguez@example.com",  LocalDate.of(1998, 3, 12)));

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return lista;
    }
    public int CantNotificaciones(){
        return this.contarNotificaciones;

    }
}
