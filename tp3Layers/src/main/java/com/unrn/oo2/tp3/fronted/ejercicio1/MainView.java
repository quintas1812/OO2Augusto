package com.unrn.oo2.tp3.fronted.ejercicio1;

import com.unrn.oo2.tp3.modelo.ejercicio1.GuardaParticipante;
import com.unrn.oo2.tp3.modelo.ejercicio1.Guardar;
import com.unrn.oo2.tp3.modelo.ejercicio1.Participante;
import java.awt.ComponentOrientation;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class MainView extends JFrame {
    private JTextField nombre;
    private JTextField telefono;
    private JTextField region;
    private Guardar guardar;

    public MainView(Guardar guardar) {
       this.guardar = guardar;
       setupUIComponents();
   }


    private void setupUIComponents() {
        setTitle("Add Participant");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.nombre = new JTextField(10);
        this.telefono = new JTextField(10);
        this.region = new JTextField(10);
        this.nombre.setText("");
        this.telefono.setText("");
        this.region.setText("China");
        JPanel contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new FlowLayout());
        contentPane.add(new JLabel("Nombre: "));
        contentPane.add(nombre);
        contentPane.add(new JLabel("Telefono: "));
        contentPane.add(telefono);
        contentPane.add(new JLabel("Region: "));
        contentPane.add(region);
        JButton botonCargar = new JButton("Cargar");
        botonCargar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    accionboton();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(MainView.this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        contentPane.add(botonCargar);
        setContentPane(contentPane);
        contentPane.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        pack();
        setVisible(true);
    }

    private void accionboton() throws Exception {
            Participante participante = new Participante(nombre.getText(), telefono.getText(),region.getText());
            GuardaParticipante guardaParticipante = new GuardaParticipante(this.guardar);
            guardaParticipante.guardar(participante);

    }

}