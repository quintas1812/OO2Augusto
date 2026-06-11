package com.unrn.oo2.tp2.ejercicio2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;


public class SaveBD1 implements Save1 {
    private String DRIVER;
    private String URL_DB ;
    private String USER ;
    private String PASS;
    private static Connection conn = null;
   public SaveBD1(String DRIVER, String URL_DB, String USER, String PASS) {
       this.DRIVER = DRIVER;
       this.URL_DB = URL_DB;
       this.USER = USER;
       this.PASS = PASS;
   }
    @Override
    public void guardar(String datos) {
        try {
            connect();

            String sql = "INSERT INTO cenas (fecha, monto) VALUES (?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setDate(1, new Date(System.currentTimeMillis()));
            stmt.setString(2, datos);
            stmt.executeUpdate();
            disconnect();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void connect() {
        try {
            // Cargar el driver
            Class.forName(this.DRIVER);
            // Crear la conexión
           conn = DriverManager.getConnection(this.URL_DB, this.USER, this.PASS);
            System.out.println("✅ Conexión exitosa a la base de datos.");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException ("❌ Driver no encontrado: " + this.DRIVER);

        } catch (SQLException e) {
            throw new RuntimeException("❌ No se ha podido conectar a " + this.URL_DB + ". " + e.getMessage());
        }
    }

    public  void disconnect() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                System.err.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }

}
