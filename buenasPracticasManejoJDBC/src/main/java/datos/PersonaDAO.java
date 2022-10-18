/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import domain.Persona;
import java.util.*;
import java.sql.*;

/**
 *
 * @author alejo
 */
//DAO DATA ACCESs OBJECT
public class PersonaDAO {

    private static final String SQL_SELECT = "SELECT id_persona, nombre, apellido, email, telefono FROM persona";

    public List<Persona> seleccionar() {
        Connection conn = null;
        // PreparedStament mas eficiente que Stament, aunque ambos sirven
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Persona persona = null;
        List<Persona> personas = new ArrayList<>();
    }
}
