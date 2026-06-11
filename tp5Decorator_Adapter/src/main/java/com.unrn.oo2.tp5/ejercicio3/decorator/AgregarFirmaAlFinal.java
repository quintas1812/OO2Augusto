package com.unrn.oo2.tp5.ejercicio3.decorator;

import java.io.File;

public class AgregarFirmaAlFinal extends DecoratorReporte {
    // esta clase es un decorador que agrega una firma al final del contenido del archivo, lo hice para comprender un poco mas
    public AgregarFirmaAlFinal(ExportFile export) {
        super(export);
    }
    @Override
    public void export(File file, String contenido) {
        String firma = contenido + "\n Archivo firmado.";
        super.export(file, firma); // sobre escribe el contenido y delega el contenido al exportador original, pero con la firma agregada al final
    }
}
