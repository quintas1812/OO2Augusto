package com.unrn.oo2.tp5.ejercicio3.decorator;

import java.io.File;

public class Mainn {
    public static void main(String[] args) {
        ExportFile reporte = new AgregarFirmaAlFinal(new Sobreescribir(new Reporte()));
        reporte.export(new File("C:\\Users\\augus_r4ret8\\IdeaProjects\\OO2Augusto\\tp5Decorator_Adapter\\archivo.txt"), "Contenido del reporte");
        ExportFile buil =  new ReporteBuilder(new Reporte()).conFirma().sinSobreEscritura().conSobreEscritura().build();
        new ReporteBuilder(new Reporte()).conFirma().conSobreEscritura().build();
        buil.export(new File("C:\\Users\\augus_r4ret8\\IdeaProjects\\OO2Augusto\\tp5Decorator_Adapter\\archivo2.txt"), "Contenido del reporte");
    }
}
