package Persistence.ejercicio3;

import Modelo.ejercicio3.Lector;
import Modelo.ejercicio3.Save;

import javax.xml.transform.Result;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static Persistence.ejercicio3.ConnectionManager.disconnect;
import static Persistence.ejercicio3.ConnectionManager.getConnection;

public class SaveBD implements Save, Lector {
    @Override
    public void inscribir(String datos) {
            String[] partes = datos.split(", ");
            String nombre = partes[0];
            String apellido = partes[1];
            String telefono = partes[2];
            String email = partes[3];
            int idconcurso= Integer.parseInt(partes[4]);
            String sql = "INSERT INTO Inscriptos (nombre, apellido, telefono, email, idconcurso) VALUES (?,?,?,?,?)";
            try(Connection conn = ConnectionManager.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setString(1, nombre);
            stmt.setString(2, apellido);
            stmt.setString(3, telefono);
            stmt.setString(4, email);
            stmt.setInt(5, idconcurso);
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<String> read() {
        String sql = "SELECT nombre FROM Concurso WHERE fechaInicioInscripcion <= CURDATE() AND fechaFinInscripcion >= CURDATE()";
        List<String> lista = new ArrayList<>();
        try(Connection conn = ConnectionManager.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)){
            ResultSet result = stmt.executeQuery();
            while (result.next()) {
                String nombre = result.getString("nombre");
                lista.add(nombre);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return lista;
    }
}
