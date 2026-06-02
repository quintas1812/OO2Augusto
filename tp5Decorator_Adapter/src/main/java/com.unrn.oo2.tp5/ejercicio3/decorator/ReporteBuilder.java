package com.unrn.oo2.tp5.ejercicio3.decorator;

public class ReporteBuilder {
    private  ExportFile reportBase;
    public ReporteBuilder(Reporte report) {
        this.reportBase = report;
    }

    public ReporteBuilder conSobreEscritura() {
        this.reportBase = new Sobreescribir(this.reportBase);
        return this;
    }

    public ReporteBuilder sinSobreEscritura() {
        this.reportBase = new SinSobreEscribir(this.reportBase);
        return this;
    }

    public ReporteBuilder conFirma() {
        this.reportBase = new AgregarFirmaAlFinal(this.reportBase);
        return this;
    }

    public ExportFile build() {
        return this.reportBase;
    }
}