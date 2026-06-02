package com.unrn.oo2.tp3.modelo.ejercicio1;
import com.unrn.oo2.tp3.modelo.ejercicio2.Notificador;
import com.unrn.oo2.tp3.persistence.ejercicio2.EmailSender;

public class Email implements Observer {
    private final EmailSenderMailtrap emailSender;

    public Email(EmailSenderMailtrap emailSender) {
        this.emailSender = emailSender;
    }

    @Override
    public void update(String dato) {
        emailSender.enviarEmail(dato,"Feliz cumpleaños!!!");
    }
}
