package oop2.ejercicios.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Usuarios {
    private final String jdbcUrl;

    public Usuarios(String jdbcUrl) {
        this.jdbcUrl = jdbcUrl;
    }

    public void insertar(String nombre, String email) {
        luegolopienso("INSERT INTO usuarios (nombre, email) VALUES (?, ?)",
                ps -> {
                    ps.setString(1, nombre);
                    ps.setString(2, email);
                }, "Error al insertar usuario");
    }

    public void actualizarEmail(int id, String nuevoEmail) {
        luegolopienso("UPDATE usuarios SET email = ? WHERE id = ?",
                ps -> {
                    ps.setString(1, nuevoEmail);
                    ps.setInt(2, id);
                }, "Error al actualizar usuario");
    }

    private void luegolopienso(String sql, miInterface accion, String errorMsg) {
        try (Connection connection = DriverManager.getConnection(this.jdbcUrl);
             PreparedStatement statement = connection.prepareStatement(sql)) {
            connection.setAutoCommit(false);
            try {
                accion.ejecutar(statement);
                statement.executeUpdate();
                connection.commit();
            } catch (SQLException e) {
                connection.rollback();
                throw new RuntimeException(errorMsg, e);
            }
        } catch (SQLException e) {
            throw new RuntimeException(errorMsg, e);
        }
    }

    @FunctionalInterface
    private interface miInterface {
        void ejecutar(PreparedStatement ps) throws SQLException;
    }
}
