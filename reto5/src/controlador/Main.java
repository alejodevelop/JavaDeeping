/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import vista.GUI;
import modelo.ConexionBD;

/**
 *
 * @author alejo
 */
public class Main {

    public static void main(String[] args) {
        GUI ventanaPrincipal = new GUI();
        ventanaPrincipal.setVisible(true);
        ConexionBD conexion = new ConexionBD();
    }

}
