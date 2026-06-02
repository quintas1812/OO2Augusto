package com.unrn.oo2.tp5.ejercicio3.decorator;
import java.io.File;

public class Sobreescribir extends DecoratorReporte  {
   //sobre escribir me refiero a pisar el contenido viejo por el nuevo
   public Sobreescribir(ExportFile export) {
       super(export);
   }
    @Override
    public void export(File file, String contenido) {
       file.delete(); // lo elimino entonces el reporte crea uno nuevo
       super.exportFile.export(file, contenido);
    }
}
