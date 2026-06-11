package com.unrn.oo2.tp5.ejercicio3.decorator;

import java.io.File;

public class SinSobreEscribir extends DecoratorReporte {
    //sin sobre escribir me refiero a agregarle mas contenido al archivo
    public SinSobreEscribir(ExportFile export) {
        super(export);
    }
    @Override
    public void export(File file, String contenido) {
        if (file.exists()) {
          throw new RuntimeException("el archivo ya existe");
        }
        super.export(file, contenido);
    }
}

