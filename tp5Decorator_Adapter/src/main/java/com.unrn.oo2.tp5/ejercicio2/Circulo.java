package com.unrn.oo2.tp5.ejercicio2;


import java.awt.*;

class Circulo implements Figura {
    private int radio;
    private Coordenada coordenada;
    public Circulo(Coordenada coordenada, int radio) {
        this.radio = radio;
        this.coordenada = coordenada;
    }
    @Override
    public void dibujar(Panel panel ) {
//        g2d.drawOval(coordenada.x() - radio,
//                coordenada.y() - radio,
//                radio * 2,
//                radio * 2);
        panel.dibujarCirculo(this.coordenada, this.radio);
    }
}
