package com.unrn.oo2.tp5.ejercicio2;

import java.awt.*;

public class AdapterGraphics2d implements Panel {
    private Graphics2D g2d;

    public AdapterGraphics2d(Graphics2D g2d) {
        this.g2d = g2d;
    }
    @Override
    public void dibujarLinea(Coordenada coordenada, int longitud) {
        g2d.drawLine(coordenada.x(), coordenada.y(), coordenada.x() + longitud , coordenada.y());

    }
    @Override
    public void dibujarCirculo(Coordenada coordenada, int radio) {
        g2d.drawOval(coordenada.x(), coordenada.y(), radio * 2, radio * 2);;
    }

    @Override
    public void dibujarTexto(Coordenada coordenada, String texto) {
        g2d.drawString(texto, coordenada.x(), coordenada.y());

    }
}
