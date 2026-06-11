package com.unrn.oo2.tp2.ejercicio2;

import com.unrn.oo2.tp2.ejercicio2.itempedidos.Bebida;
import com.unrn.oo2.tp2.ejercicio2.itempedidos.ItemPedido;
import com.unrn.oo2.tp2.ejercicio2.itempedidos.Plato;
import com.unrn.oo2.tp2.ejercicio2.tarjetas.*;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class RealizarPedidoUI {
    JPanel panel = new JPanel();



    public void mostrar() {
        JFrame frame = new JFrame("Realizar Pedido");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        JLabel jplato = new JLabel("Plato: ");
        JLabel jbebida = new JLabel("Bebida: ");
        JLabel jpropina = new JLabel("Descuento: ");
        JLabel jtarjeta = new JLabel("Tarjeta: ");


        JComboBox<Plato> platos = new JComboBox<> ();
        JComboBox<Bebida> bebidas = new JComboBox<> ();
        JComboBox<Integer> propina = new JComboBox<> ();
        JComboBox<TarjetaCredito> tarjetas = new JComboBox<> ();

        platos.addItem(new Plato("Pizza", 150000));
        platos.addItem(new Plato("Hamburguesa", 300000));

        bebidas.addItem(new Bebida("Coca-Cola", 50000));
        bebidas.addItem(new Bebida("Agua", 20000));

        propina.addItem(5);
        propina.addItem(10);
        propina.addItem(15);

        tarjetas.addItem(new Visa());
        tarjetas.addItem(new Mastercard());
        tarjetas.addItem(new ComarcaPlus());
        tarjetas.addItem(new Viedma());


        panel.add(jplato);
        panel.add(jbebida);
        panel.add(jpropina);
        panel.add(jtarjeta);
        panel.add(platos);
        panel.add(bebidas);
        panel.add(propina);
        panel.add(tarjetas);
        JButton ok = new JButton("confirmar pedido");
        ok.addActionListener(e -> {
            Plato platoSeleccionado = (Plato) platos.getSelectedItem();
            Bebida bebidaSeleccionada = (Bebida) bebidas.getSelectedItem();
            ArrayList<ItemPedido> pedidos = new java.util.ArrayList<>();
            pedidos.add(platoSeleccionado);
            pedidos.add(bebidaSeleccionada);
            int propinaSeleccionada = (Integer) propina.getSelectedItem();
            TarjetaCredito tarjetaSeleccionada = (TarjetaCredito) tarjetas.getSelectedItem();

            Restaurante restaurante = new Restaurante(List.of( new MontoPedidoUI()), new SaveFile1("export-pagos.csv"));
            restaurante.RealizarPedido(pedidos, tarjetaSeleccionada, propinaSeleccionada);
        });
        panel.add(ok);
        frame.add(panel);
        frame.setVisible(true);

    }
}
