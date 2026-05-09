package com.unrn.oo2.tp3.persistence.ejercicio1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class setupBaseDeDatos {
    public static Connection dbConn;
    public void setupBaseDeDatos() throws SQLException {
        String url = "jdbc:derby://localhost:1527/participantes";
        String user = "app";
        String password = "app";
        this.dbConn = DriverManager.getConnection(url, user, password);
    }
    public static Connection getDbConn() {
        return dbConn;
    }
}
