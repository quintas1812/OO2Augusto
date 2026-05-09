package com.unrn.oo2.tp3.ejercicio2;

import com.unrn.oo2.tp3.modelo.ejercicio2.Empleado;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class TestSaludar {
//    @DisplayName("Validación de cantidad de notificaciones por cumpleaños, con un fake")
//    @Test
//    public void testCantidadNotificaciones(){
//        Tests.ejercicio2.FakeNotificadoryLector notificador = new Tests.ejercicio2.FakeNotificadoryLector();
//        Saludar saludar = new Saludar(notificador, notificador);
//        saludar.enviar();
//        assertEquals(2 ,notificador.CantNotificaciones());
//    }
//    @Test
//    public void testSaludarConMailtrap(){
//        String host = "sandbox.smtp.mailtrap.io";
//        int port = 2525;
//        String user = "c9604509b9b552";
//        String password = "ceea89428edb2f";
//        EmailSender emailsender = new EmailSender( host , port, user, password);
//        Email notificador = new Email(emailsender);
//        Tests.ejercicio2.FakeNotificadoryLector lector = new Tests.ejercicio2.FakeNotificadoryLector();
//        Saludar saludar = new Saludar(lector, notificador);
//        saludar.enviar();
//    }

    @Test
    public void testExcepcionesApellido(){
        Exception exception = assertThrows(Exception.class, () -> new Empleado("augusto", "", "augustoq3k@gmil.com" , LocalDate.of(2006, 3, 6) ));
     assertEquals("El apellido no es valido", exception.getMessage());

    } @Test
    public void testExcepcionesNombre(){
        Exception exception = assertThrows(Exception.class, () -> new Empleado("", "Quintas", "augustoq3k@gmil.com" , LocalDate.of(2006, 3, 6) ));
     assertEquals("El nombre no es valido", exception.getMessage());

    } @Test
    public void testExcepcionesEmail(){
        Exception exception = assertThrows(Exception.class, () -> new Empleado("augusto", "Quintas", "augustoqil.com" , LocalDate.of(2006, 3, 6) ));
     assertEquals("El email no es valido", exception.getMessage());

    }

}
