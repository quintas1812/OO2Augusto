package ejAdicionales;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Vistas extends JFrame {
    public void agregarBoton() {
        setTitle("Ventana de Prueba");
        setSize(400, 400);
        JButton boton = new JButton("Presioname");
        boton.addActionListener((l)-> JOptionPane.showMessageDialog(Vistas.this, "Presionaste el botón"));
        add(boton);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
