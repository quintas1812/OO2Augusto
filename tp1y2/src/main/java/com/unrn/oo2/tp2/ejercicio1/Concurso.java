package com.unrn.oo2.tp2.ejercicio1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Concurso implements Inscribible {
    private static int num = 0;
    private int id;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private ArrayList<Participante> participantes = new ArrayList<Participante>();
    protected Save save ;
    private String mensaje;
    public Concurso(LocalDate fechaInicio, LocalDate fechaFin,  Save save) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.id = num++;
        this.save = save;
    }
    @Override
    public void inscribirA(Participante participante) {
        LocalDate hoy = LocalDate.now();
        if (hoy.isBefore(this.fechaInicio) || hoy.isAfter(this.fechaFin)) {
            throw new RuntimeException("no se puede inscribir fuera de fechas");
        }
        participantes.add(participante);
        participante.setFechaInscripcion(hoy);
        if (hoy.equals(this.fechaInicio)) {
            int puntos = participante.cantPuntos() + 10;
            participante.cambiarPuntos(puntos);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(participante.fechaInscripcion()).append(", ").append(idCurso()).append(", ")
                .append(participante.Apellido()).append(" DNI: ")
                .append(participante.Dni()).append(System.lineSeparator());
        String datos = sb.toString();
        this.mensaje = datos;
        save.guardar(datos);
    }



    public int idCurso(){
        return this.id;
    }
    public int puntosDe(Participante participante){
        return participante.cantPuntos();
    }
    public void eliminarA(Participante participante) {
        participantes.remove(participante);
    }
    public int cantidadadParticipantes(){
        return this.participantes.size();
    }

    protected String Mensaje() {
        return this.mensaje;
    }
}
