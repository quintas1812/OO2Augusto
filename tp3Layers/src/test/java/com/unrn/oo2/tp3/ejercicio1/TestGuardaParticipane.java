package com.unrn.oo2.tp3.ejercicio1;

import com.unrn.oo2.tp3.modelo.ejercicio1.*;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestGuardaParticipane {

    @Test
    public void testGuardarParticipante() throws Exception {
        FakeGuardar fakeGuardar = new FakeGuardar();
        Participante participante = new Participante("Juan Perez", "1234-567890", "China", "augustoq3k@gmail.com");
        String host = "sandbox.smtp.mailtrap.io";
        int port = 2525;
        String user = "c9604509b9b552";
        String password = "ceea89428edb2f";
        EmailSenderMailtrap emailsender = new EmailSenderMailtrap( host , port, user, password);
        Email notificador = new Email(emailsender);
        List<Observer> observers = List.of(notificador);
        Concurso concurso = new Concurso(fakeGuardar, observers);
        concurso.guardar(participante);
        assertEquals(participante.Nombre(), fakeGuardar.nombre(), "El nombre guardado debe coincidir");        assertEquals(participante.email(), fakeGuardar.email(), "El email guardado debe coincidir");
        assertEquals(participante.email(),fakeGuardar.email());
    }
    @Test
    public void testTelefonoInvalidoLanzaExcepcion() {
        Exception exception = assertThrows(Exception.class, () -> {
            new Participante("Juan", "123-456", "China","Augusto@.com");
        });
        assertEquals("El teléfono debe ingresarse de la siguiente forma: NNNN-NNNNNN", exception.getMessage());
    }

    @Test
    public void testNombreVacioLanzaExcepcion() {
        Exception exception = assertThrows(Exception.class, () -> {
            new Participante("", "1234-567890", "China","Augusto@.com");
        });

        assertEquals("El nombre no puede estar vacío", exception.getMessage());
    }

    @Test
    public void testRegionInvalidaLanzaExcepcion() {
        Exception exception = assertThrows(Exception.class, () -> {
            new Participante("Juan", "1234-567890", "Argentina","Augusto@.com");
        });

        assertEquals("La región debe ser China, US o Europa", exception.getMessage());
    }
}
