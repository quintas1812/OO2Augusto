package Main.ejercicio2;

import Modelo.ejercicio2.Empleado;
import Modelo.ejercicio2.Lector;
import Modelo.ejercicio2.Saludar;
import Persistence.ejercicio2.Email;
import Persistence.ejercicio2.EmailSender;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Mainn {
    public static void main(String[] args) {
        String host = "sandbox.smtp.mailtrap.io";
        int port = 2525;
        String user = "c9604509b9b552";
        String password = "ceea89428edb2f";
        
        EmailSender emailsender = new EmailSender(host, port, user, password);
        Email notificador = new Email(emailsender);
        
        Lector lector = () -> {
            List<Empleado> lista = new ArrayList<>();
            try {
                lista.add(new Empleado("Juan", "Perez", "juan.perez@example.com", LocalDate.now()));
                lista.add(new Empleado("Luis", "Rodriguez", "luis.rodriguez@example.com", LocalDate.of(1998, 3, 12)));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            return lista;
        };

        Saludar saludar = new Saludar(lector, notificador);
        saludar.enviar();
    }
}
