/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.facturaproductos;

/**
 *
 * @author alejo
 */
public class Producto {

    private String nombre;
    private float precioBase;
    private final float iva = 0.19f;
    private float descuento = 0.05f;
    private float precioDespuesDeducciones;

    public Producto(String nombre, float precioBase) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.calcularPrecioDespuesDeducciones();
    }

    private void calcularPrecioDespuesDeducciones() {
        this.precioDespuesDeducciones = ((this.precioBase * iva) + this.precioBase) - (this.precioBase * descuento);
    }

    public float getIva() {
        return iva;
    }

    public float getPrecioDespuesDeducciones() {
        return precioDespuesDeducciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(float precioBase) {
        this.precioBase = precioBase;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", precioBase=" + precioBase + ", iva=" + iva + ", descuento=" + descuento + ", precioDespuesDeducciones=" + precioDespuesDeducciones + '}';
    }

}
