/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.facturaproductos;

import java.util.List;

/**
 *
 * @author alejo
 */
public class Factura {

    private String nombreEmpresa;
    private int nit;
    private String lema;
    private List<Producto> productos;

    public Factura(String nombreEmpresa, int nit, String lema, List<Producto> productos) {
        this.nombreEmpresa = nombreEmpresa;
        this.nit = nit;
        this.lema = lema;
        this.productos = productos;
    }

    public void imprimir() {
        System.out.println("********************************");
        System.out.println("Empresa: " + this.nombreEmpresa);
        System.out.println("NIT: " + this.nit);
        System.out.println("---------------------------------");
        float precioTotal = 0;
        for (Producto producto : this.productos) {
            System.out.println(producto.getNombre() + " Precio base --> $" + String.format("%.2f", producto.getPrecioBase()));
            System.out.println(" Precio despues deducciones --> $" + String.format("%.2f", producto.getPrecioDespuesDeducciones()));
            precioTotal += producto.getPrecioDespuesDeducciones();
        }
        System.out.println("---------------------------------");
        System.out.println("Descuento --> " + this.productos.get(0).getDescuento() * 100 + "%");
        System.out.println("IVA --> " + this.productos.get(0).getIva() * 100 + "%");
        System.out.println("Precio Total --> " + String.format("%.2f", precioTotal));
        System.out.println("---------------------------------");
        System.out.println("Lema: " + this.lema);
        System.out.println("********************************");

    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public String getLema() {
        return lema;
    }

    public void setLema(String lema) {
        this.lema = lema;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "Factura{" + "nombreEmpresa=" + nombreEmpresa + ", nit=" + nit + ", lema=" + lema + ", productos=" + productos + '}';
    }

}
