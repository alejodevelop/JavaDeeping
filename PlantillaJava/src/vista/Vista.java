/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Controlador;

public class Vista {

    public static void main(String[] args) {
        Controlador modelo = new Controlador();
        modelo.agregarArbol(1, "julian", 10, 10, 5);
        modelo.agregarArbol(2, "alejandro", 5, 5, 2);
        modelo.listarArboles();
    }
}
