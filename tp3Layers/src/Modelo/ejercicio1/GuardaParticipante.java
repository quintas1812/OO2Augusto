package Modelo.ejercicio1;

public class GuardaParticipante   {
    private Guardar guardar;
    public GuardaParticipante(Guardar guardar){
        this.guardar = guardar;
    }
    public void guardar(Participante participante)  {
        this.guardar.guardar(participante);
    }
}