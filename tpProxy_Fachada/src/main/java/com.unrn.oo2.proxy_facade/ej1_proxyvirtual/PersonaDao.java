package com.unrn.oo2.proxy_facade.ej1_proxyvirtual;

import java.sql.*;
import java.util.HashSet;
import java.util.Set;

public class PersonaDao{
    private Connection obtenerConexion(){
        try {
            return DriverManager.getConnection("jdbc:mysql://root:ezmPNKnEXpRgprnCIlvjyLdRNlNVCdXx@yamabiko.proxy.rlwy.net:35052/railway", "root", "ezmPNKnEXpRgprnCIlvjyLdRNlNVCdXx");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public Persona personaPorId(int id) {
        String sql = "select p.nombre "
                + "from personas p "
                + "where p.id = ?";
        try (Connection conn = obtenerConexion();
             PreparedStatement statement =
                     conn.prepareStatement(sql);) {
            statement.setInt(1, id);
            ResultSet result = statement.executeQuery();

            String nombrePersona = null;
            if (result.next()) {
                nombrePersona = result.getString(1);
            }
            return new Persona(id, nombrePersona, new ProxyTelefonos(id,this));
        } catch(SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public Set<Telefono> telefonosPersonaId(int id){
        String sql = "select t.numero "
                + "from telefonos t "
                + "where t.idpersona = ?";
        try (Connection conn = obtenerConexion();
             PreparedStatement statement =
                     conn.prepareStatement(sql);) {
            statement.setInt(1, id);
            ResultSet result = statement.executeQuery();
            Set<Telefono> telefonos = new HashSet<Telefono>();
            while (result.next()) {
                telefonos.add(new Telefono(result.getString(1)));
            }
            return telefonos;
        } catch(SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
