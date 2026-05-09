package com.unrn.oo2.tp3.persistence.ejercicio3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
    private static final String URL_DB = "jdbc:mysql://localhost:3306/ej3tpLayers?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASS = "91218";
    private static Connection conn = null;

    private ConnectionManager() {
    }

    /**
     * Devuelve una conexión activa a la base de datos.
     * En versiones modernas de Java y JDBC, el driver se carga automáticamente.
     */
    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL_DB, USER, PASS);
        } catch (SQLException e) {
            throw new RuntimeException("Error al conectar a la base de datos: " + URL_DB, e);
        }
    }

    /**
     * Cierra la conexión si existe.
     * Útil para limpieza general, aunque con try-with-resources es menos necesario.
     */
    public static void disconnect() {
        if (conn != null) {
            try {
                conn.close();
                conn = null;
            } catch (SQLException e) {
                System.err.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }

    // El resto de métodos como connect() o reconnect() se pueden mantener o simplificar según uso.
}
