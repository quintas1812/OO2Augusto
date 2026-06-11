package com.unrn.oo2.tp2.ejercicio2;

import javax.swing.*;

public class MontoPedidoUI implements Observer{
private JLabel montoLabel;

    public MontoPedidoUI() {
        JFrame frame = new JFrame("Monto del Pedido");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        montoLabel = new JLabel("Monto: $0.00");
        montoLabel.setHorizontalAlignment(SwingConstants.CENTER);
        frame.add(montoLabel);

        frame.setVisible(true);
    }
    @Override
    public void update(String monto) {
        montoLabel.setText("Monto: $" + monto);
        if (Float.parseFloat(monto) > 300000) {
            montoLabel.setForeground(java.awt.Color.RED);
        } else {
            montoLabel.setForeground(java.awt.Color.BLACK);
        }
    }
    }
