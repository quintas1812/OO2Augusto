package com.unrn.oo2.tp3.persistence.ejercicio1;

import com.unrn.oo2.tp3.modelo.ejercicio1.Guardar;
import com.unrn.oo2.tp3.modelo.ejercicio1.Participante;

import java.sql.SQLException;

public class jdbcParticipante implements Guardar {
    public void guardar(Participante participante)  {
        String nombre = participante.Nombre();
        String telefono = participante.Telefono();
        String region = participante.Region();
        setupBaseDeDatos setupBaseDeDatos = new setupBaseDeDatos();
        String sql = "insert into participantes(nombre, telefono, region) values(?,?,?)";
        try (java.sql.PreparedStatement st = setupBaseDeDatos.getDbConn().prepareStatement(sql)) {
            st.setString(1, nombre);
            st.setString(2, telefono);
            st.setString(3, region);
            st.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
