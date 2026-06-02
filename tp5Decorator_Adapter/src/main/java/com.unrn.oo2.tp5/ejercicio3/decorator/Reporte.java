package com.unrn.oo2.tp5.ejercicio3.decorator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Reporte implements ExportFile {
    @Override
    public void export(File file, String contenido) {
        if (file == null) {
            throw new IllegalArgumentException("File es NULL; no puedo exportar...");
        }
        try {
            FileWriter fw = new FileWriter(file, false);
            fw.write(contenido);
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
/*Utilice el pattern Decorador para reescribir la funcionalidad de Reporte, de modo tal que le
permita escribir Reportes que exporten sin verificar si el archivo existe (o sea, lo sobreescriba)
y Reportes que no permitan sobrescribir el archivo.*/