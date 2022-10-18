/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.datospersonas;

/**
 *
 * @author alejo
 */
public class Persona {

    //variables
    private long cedula;
    private String nombre;
    private String apellido;
    private int edad;
    private String genero;

    //constructores
    public Persona() {

    }

    public Persona(long cedula, String nombre, String apellido, int edad, String genero) {
        this.cedula = cedula;
        this.apellido = apellido;
        this.edad = edad;
        this.nombre = nombre;
        this.genero = genero;
    }

    //getters and setters
    public long getCedula() {
        return cedula;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Persona{" + "cedula= " + cedula + ", nombre= " + nombre + ", apellido= " + apellido + ", edad= " + edad + ", genero= " + genero + '}';
    }

}
