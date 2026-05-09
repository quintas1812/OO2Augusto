package com.unrn.oo2.tp3.main.ejercicio1;

import com.unrn.oo2.tp3.fronted.ejercicio1.MainView;
import com.unrn.oo2.tp3.modelo.ejercicio1.Guardar;
import com.unrn.oo2.tp3.persistence.ejercicio1.jdbcParticipante;

import java.awt.*;
import java.sql.SQLException;

public class Maiin {
    public static void main(String[] args) throws SQLException {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Guardar guardar = new jdbcParticipante();
                    new MainView(guardar);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        });
    }
}

