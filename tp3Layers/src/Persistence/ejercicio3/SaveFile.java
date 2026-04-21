package Persistence.ejercicio3;

import Modelo.ejercicio3.Save;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SaveFile implements Save {
    private String path;

    public SaveFile(String path) {
        this.path = path;
    }
    @Override
    public void inscribir(String datos) {
        File aFile = new File(this.path);
        boolean isNewFile = !aFile.exists();
        try (FileWriter writer = new FileWriter(aFile, true)) { //fileWriter para escribir al final del archivo(append true)
            if (isNewFile) {
                writer.write("apellido, nombre, teléfono, email, idconcurso");
                writer.write(System.lineSeparator());
            }
            writer.write(datos);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
