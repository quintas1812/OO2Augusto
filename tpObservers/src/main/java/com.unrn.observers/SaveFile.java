package com.unrn.observers;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class SaveFile implements Observer {
    @Override
    public void update(String dato) {
        File file = new File("clima.txt");
        try {
            FileWriter w = new FileWriter(file, true);
            LocalDateTime fecha = LocalDateTime.now();
            String d = "Fecha: " + fecha.toString() + " Temperatura: " + dato+ "°C";
            w.write(d + "\n");
            w.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
