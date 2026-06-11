package com.unrn.oo2.tp2.ejercicio1;

public abstract class DecoradorConcurso implements Inscribible {
    protected Concurso concurso;
    protected Notificador notificador;

    public DecoradorConcurso(Concurso concurso, Notificador notificador) {
        this.concurso = concurso;
        this.notificador = notificador;
    }

    @Override
    public void inscribirA(Participante participante) {
        concurso.inscribirA(participante);
    }
}
