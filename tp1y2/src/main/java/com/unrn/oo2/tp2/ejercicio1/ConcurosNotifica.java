package com.unrn.oo2.tp2.ejercicio1;

public class ConcurosNotifica extends DecoradorConcurso{
    public ConcurosNotifica(Concurso concurso, Notificador notificador) {
        super(concurso, notificador);
    }
    @Override
    public void inscribirA(Participante participante) {
        concurso.inscribirA(participante);
        String mensaje = concurso.Mensaje();
        notificador.notificar(mensaje, participante.email());
    }

}
