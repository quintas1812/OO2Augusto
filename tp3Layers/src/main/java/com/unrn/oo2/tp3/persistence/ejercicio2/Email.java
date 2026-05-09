package com.unrn.oo2.tp3.persistence.ejercicio2;
import com.unrn.oo2.tp3.modelo.ejercicio2.Notificador;

public class Email implements Notificador {
    private final EmailSender emailSender;

    public Email(EmailSender emailSender) {
        this.emailSender = emailSender;
    }

    @Override
    public void notificar(String usuario, String nombre) {
        emailSender.enviarEmail(usuario,"Feliz cumpleaños: "+nombre+"!!!");
    }
}
