package com.unrn.oo2.tp5.ejercicio2;

public interface Panel {
    public void dibujarLinea(Coordenada coordenada, int longitud);
    public void dibujarCirculo(Coordenada coordenada, int radio);
    public void dibujarTexto(Coordenada coordenada, String texto);
}
