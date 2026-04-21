package Modelo.ejercicio3;

import Persistence.ejercicio3.SaveBD;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Concurso {
    private static int num = 0;
    private int id;
    private String nombre;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private ArrayList<Participante> participantes = new ArrayList<Participante>();
    private Lector lector;
    public List<String> todosLosConcursos(Lector lector) {
        List<String> abiertos =lector.read();
        return abiertos;
    }
    public void saveInscription(Participante participante, int idCurso, Save save) {//guarda en bd y file
        participantes.add(participante);
        StringBuilder sb = new StringBuilder();
        sb.append(participante.Apellido()).append(", ")
                .append(participante.Nombre()).append(", ")
                .append(participante.Telefono()).append(", ")
                .append(participante.Email()).append(", ")
                .append(idCurso).append(", ")
                .append(System.lineSeparator());
        String datos = sb.toString();
        save.inscribir(datos);//aca se guarda en el archivo
        new SaveBD().inscribir(datos); //aca guarda en la base de datos
    }

}
