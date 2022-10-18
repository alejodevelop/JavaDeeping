/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author alejo
 */
public class Arbol implements IcuidadoArbol {

    private String nombre;
    private float largo;
    private float altura;
    private float ancho;

    public Arbol(String nombre, float largo, float altura, float ancho) {
        this.nombre = nombre;
        this.largo = largo;
        this.altura = altura;
        this.ancho = ancho;
    }

    public Arbol(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void podar() {
        System.out.println("Podando arbol...");
        this.altura = this.altura - 2;
        System.out.println("Arbol podado! ");
    }

    @Override
    public void regar() {
        System.out.println("Regando arbol...");
        this.altura = this.altura + 2;
        System.out.println("Arbol regado! ");

    }

    protected float calcularVolumen() {
        float volumen = 0;

        volumen = this.largo * this.ancho * this.altura;

        return volumen;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + " {nombre=" + nombre + ", largo=" + largo + ", altura=" + altura + ", ancho=" + ancho;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getLargo() {
        return largo;
    }

    public void setLargo(float largo) {
        this.largo = largo;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

}
