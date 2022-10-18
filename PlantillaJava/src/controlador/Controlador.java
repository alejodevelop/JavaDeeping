/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import entidades.*;
import java.util.List;
import modelo.*;

/**
 *
 * @author alejo
 */
public class Controlador {

    Modelo modelo;

    public Controlador() {
        modelo = new Modelo();
    }

    public void listarArboles() {
        List<Arbol> listaArboles = modelo.listarArboles();
        listaArboles.forEach((arbol) -> {
//            arbol.podar();
//            arbol.regar();
            System.out.println(arbol.toString());
        });
    }

    public void agregarArbol(int tipo, String nombre, float largo, float altura, float ancho) {
        if (tipo == 1) {
            Arbol arbol = new Arbol(nombre, largo, altura, ancho);
            modelo.agregarArbol(arbol);
        }
        if (tipo == 2) {
            ArbolFrutal arbolFrutal = new ArbolFrutal(nombre, largo, altura, ancho);
            modelo.agregarArbol(arbolFrutal);
        }
        if (tipo == 3) {
            ArbolOrnamental arbolOrnamental = new ArbolOrnamental(nombre, largo, altura, ancho);
            modelo.agregarArbol(arbolOrnamental);
        }

    }
}
