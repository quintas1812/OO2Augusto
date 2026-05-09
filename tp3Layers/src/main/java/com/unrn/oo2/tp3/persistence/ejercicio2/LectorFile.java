package com.unrn.oo2.tp3.persistence.ejercicio2;

import com.unrn.oo2.tp3.modelo.ejercicio2.Empleado;
import com.unrn.oo2.tp3.modelo.ejercicio2.Lector;
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
//Johnson, Brian, 1975/09/11, brian@acdc.com
    public List<Empleado> read() {
        List<Empleado> empleados = new ArrayList<>();
        try (CSVReader reader = new CSVReader(new FileReader(this.pathfile))) {
            String[] row;
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
            reader.readNext();// salto a la siguiente row
            while ((row = reader.readNext()) != null) {
                String nombre = row[1];
                String apellido = row[2];
                LocalDate fecha_nac = LocalDate.parse(row[3].trim(), formatter);
                String email = row[4];
                empleados.add(new Empleado(nombre, apellido, email, fecha_nac));
            }
        }catch (Exception e) {
            throw new RuntimeException("Error al leer el archivo CSV: " + e.getMessage(), e);
        }
        return empleados;
    }
}
