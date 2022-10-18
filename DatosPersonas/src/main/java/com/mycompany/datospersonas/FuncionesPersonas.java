/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.datospersonas;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author alejo
 */
public class FuncionesPersonas {

//    Persona[] personas;
    public FuncionesPersonas() {

    }

    public ArrayList<Persona> compararCedula(Persona persona, ArrayList<Persona> listaPersonas) {

        boolean estaAlmacenada = false;

        //si la lista esta vacia, agrega el primer elemento sin la comprobacion
        if (listaPersonas.isEmpty()) {
            listaPersonas.add(persona);
            estaAlmacenada = true;
        } else {

            //se realiza la verificacion de que la cedula no se repita
            for (int i = 0; i < listaPersonas.size(); i++) {

                if (persona.getCedula() == listaPersonas.get(i).getCedula()) {
                    estaAlmacenada = true;
                    JOptionPane.showMessageDialog(null, " La cedula ya se encuentra registrada!, porfavor ingrese otra");
                }

            }
        }

        if (estaAlmacenada == false) {
            listaPersonas.add(persona);
        }

        return listaPersonas;

    }

    public ArrayList<Persona> crearPersona(long cedula, String nombre, String apellido, int edad, String genero, ArrayList<Persona> listaPersonas) {
        Persona persona = new Persona(cedula, nombre, apellido, edad, genero);
        ArrayList<Persona> listaActualizadaPersonas = compararCedula(persona, listaPersonas);
        return listaActualizadaPersonas;
    }

}

//1076909715, "Alejandro", "Cabarcas", 18, "Masculino"
