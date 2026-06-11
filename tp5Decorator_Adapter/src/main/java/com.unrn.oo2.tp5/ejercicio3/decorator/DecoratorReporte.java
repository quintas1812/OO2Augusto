package com.unrn.oo2.tp5.ejercicio3.decorator;
import java.io.File;
public abstract class DecoratorReporte implements ExportFile {
    private ExportFile exportFile;

    public DecoratorReporte(ExportFile exportFile) {
        this.exportFile = exportFile;
    }

    @Override
    public void export(File file, String contenido) {
        exportFile.export(file, contenido);
    }
}