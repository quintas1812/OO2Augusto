package Persistence.ejercicio2;

import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import java.util.Properties;

public class EmailSender {
    public static final String CUERPO = "Feliz cumpleaños, siempre brillaras";
    private final String host;
    private final int port;
    private final String username;
    private final String password;

    public EmailSender(String host, int port, String username, String password) {
        this.host = host;
        this.port = port;
        this.username = username;
        this.password = password;
    }
    public void enviarEmail(String destinatario, String asunto ) {
        // Configuración de propiedades para Mailtrap
        Properties prop = new Properties();
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true");
        prop.put("mail.smtp.host", this.host);
        prop.put("mail.smtp.port", String.valueOf(this.port));
        prop.put("mail.smtp.ssl.trust", this.host);

        // Crear la sesión con autenticación usando jakarta.mail.Authenticator
        Session session = Session.getInstance(prop, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            // Crear el mensaje
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("ConcursoLic_Sistemas@gmail.com"));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(destinatario));
            message.setSubject(asunto);
            message.setText(CUERPO);

            // Enviar usando el Transport de jakarta.mail
            Transport.send(message);

        } catch (MessagingException e) {
            throw new RuntimeException("❌ Error al enviar el email a " + destinatario, e);
        }
    }
}
