package Main.ejercicio1;

import Fronted.ejercicio1.MainView;
import Modelo.ejercicio1.Guardar;
import Persistence.ejercicio1.jdbcParticipante;

import java.awt.*;
import java.sql.SQLException;

public class Main {
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

