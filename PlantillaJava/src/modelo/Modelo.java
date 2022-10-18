/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import bd.BDsimulation;
import entidades.Arbol;
import java.util.List;

/**
 *
 * @author alejo
 */
public class Modelo {

    BDsimulation baseDatos;

    public Modelo() {
        baseDatos = new BDsimulation();
    }

    public void agregarArbol(Arbol arbol) {
        var listaArboles = this.baseDatos.getListaArboles();
        listaArboles.add(arbol);
        this.baseDatos.setListaArboles(listaArboles);
    }

    public void buscarArbol(String nombre) {
        var listaArboles = this.baseDatos.getListaArboles();

        for (int i = 0; i < listaArboles.size(); i++) {

            var arbol = (Arbol) listaArboles.get(i);
            if (arbol.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("El arbol " + nombre + " Si se encuentra en la lista");
                System.out.println((String) arbol.toString());
            }

        }

    }

    public void eliminarArbol(String nombre) {
        List listaArboles = this.baseDatos.getListaArboles();

        for (int i = 0; i < listaArboles.size(); i++) {

            var arbol = (Arbol) listaArboles.get(i);
            if (arbol.getNombre().equalsIgnoreCase(nombre)) {
                listaArboles.remove(arbol);
            }

        }

        this.baseDatos.setListaArboles(listaArboles);
    }

    public List<Arbol> listarArboles() {
        return this.baseDatos.getListaArboles();
    }
}
