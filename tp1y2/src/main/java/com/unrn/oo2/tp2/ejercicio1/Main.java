package com.unrn.oo2.tp2.ejercicio1;

public class Main {
    public static void main(String[] args) {
        java.time.LocalDate hoy = java.time.LocalDate.now();
        Save save = new SaveFile("pruebaconcurso.txt");
        EmailSender emailSender = new EmailSender("sandbox.smtp.mailtrap.io", 2525, "c9604509b9b552", "ceea89428edb2f");

        Notificador notificador = new Email(emailSender);

        Concurso concurso = new Concurso(hoy, hoy.plusDays(10),save);
        DecoradorConcurso concurocondecorador= new ConcurosNotifica(concurso,notificador);
        Participante p1 = new Participante(12345678, "Juan", "Perez", "Jueanperez212@gmail.com");
        System.out.println("Inscribiendo participante...");
      concurocondecorador.inscribirA(p1);
        System.out.println("Puntos del participante: " + concurso.puntosDe(p1));
        System.out.println("Cantidad de inscriptos: " + concurso.cantidadadParticipantes());
    }
}
