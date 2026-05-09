package com.unrn.oo2.tp3.persistence.ejercicio3;

import com.unrn.oo2.tp3.modelo.ejercicio3.Lector;
import com.opencsv.CSVReader;

import java.io.FileReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class LectorFile implements Lector {
    private String pathfile;

    public LectorFile(String pathfile) {
        this.pathfile = pathfile;
    }

    public List<String> read() {
        List<String> abiertos = new ArrayList<>();
        try (CSVReader reader = new CSVReader(new FileReader(this.pathfile))) {
            String[] row;
            LocalDate hoy = LocalDate.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
            reader.readNext();// salto a la siguiente row
            while ((row = reader.readNext()) != null) {
                String nombreConcurso = row[1];
                LocalDate inicio = LocalDate.parse(row[2].trim(), formatter);
                LocalDate fin = LocalDate.parse(row[3].trim(), formatter);
                if (!hoy.isBefore(inicio) && !hoy.isAfter(fin)) {
                    abiertos.add(nombreConcurso);
                }
            }
        }catch (Exception e) {
            throw new RuntimeException("Error al leer el archivo CSV: " + e.getMessage(), e);
        }
        return abiertos;
    }
}
