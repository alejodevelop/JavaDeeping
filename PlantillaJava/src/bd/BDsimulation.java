/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import entidades.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alejo
 */
public class BDsimulation {

    private List<Arbol> listaArboles = new ArrayList<>();

    public BDsimulation() {

        Arbol cedro = new Arbol("Cedro", 3, 20, 10);
        ArbolFrutal manzano = new ArbolFrutal("manzano", 7, 10, 3);
        ArbolOrnamental helecho = new ArbolOrnamental("helecho", 5, 9, 2);

        listaArboles.add(cedro);
        listaArboles.add(manzano);
        listaArboles.add(helecho);

    }

    public List<Arbol> getListaArboles() {
        return listaArboles;
    }

    public void setListaArboles(List<Arbol> listaArboles) {
        this.listaArboles = listaArboles;
    }

    @Override
    public String toString() {
        return "BDsimulation{" + "listaArboles=" + listaArboles + '}';
    }

}
