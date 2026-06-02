package com.unrn.oo2.tp5.ejercicio2;

import javax.swing.*;
import java.awt.*;

class Canvas extends JPanel {
    private java.util.List<Figura> figuras;

    public Canvas() {
        figuras = new java.util.ArrayList<>();
    }

    public void agregarFigura(Figura figura) {
        figuras.add(figura);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        Panel panel = new AdapterGraphics2d(g2d);

        for (Figura figura : figuras) {
            figura.dibujar(panel);
        }
    }
}