package Tests.ejercicio2;

import Modelo.ejercicio2.Empleado;
import Modelo.ejercicio2.Saludar;
import Persistence.ejercicio2.Email;
import Persistence.ejercicio2.EmailSender;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class TestSaludar {
    @DisplayName("Validación de cantidad de notificaciones por cumpleaños, con un fake")
    @Test
    public void testCantidadNotificaciones(){
        FakeNotificadoryLector notificador = new FakeNotificadoryLector();
        Saludar saludar = new Saludar(notificador, notificador);
        saludar.enviar();
        assertEquals(2 ,notificador.CantNotificaciones());
    }
    @Test
    public void testSaludarConMailtrap(){
        EmailSender emailsender = new EmailSender( "sandbox.smtp.mailtrap.io", 2525, "c9604509b9b552", "****db2f");
        Email notificador = new Email(emailsender);
        FakeNotificadoryLector lector = new FakeNotificadoryLector();
        Saludar saludar = new Saludar(lector, notificador);
        saludar.enviar();
    }

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
