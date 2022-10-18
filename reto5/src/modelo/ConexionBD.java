/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.*;

/**
 *
 * @author alejo
 */
public class ConexionBD {

    private final String URL = "jdbc:sqlite:C:/Program Files/sqlite-tools-win32-x86-3360000/dbs/carlostruji85_reto5db.db";

    Connection con = null;

    public ConexionBD() {
        Conexion();
        ObtenerProductos();
    }

    public Connection Conexion() {
        try {
            con = DriverManager.getConnection(URL);
            if (con != null) {
                System.out.println("Conexion exitosa!");
            }
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Error en la conexion");
        }
        return con;
    }

    public void ObtenerProductos() {
        String sql = "SELECT * FROM productos";

        try {

            Connection con = this.Conexion();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                System.out.println(rs.getInt("id") + "\t"
                        + rs.getString("nombre") + "\t"
                        + rs.getString("cantidad") + "\t"
                        + rs.getString("categoria") + "\t"
                        + rs.getDouble("precio") + "\t"
                );
            }

            con.close();

        } catch (SQLException e) {
            System.out.println();
        }

    }

    public void agregarProducto() {

    }
}
