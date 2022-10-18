/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.facturaproductos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author alejo
 */
public class FacturaProductos {

    public static void main(String[] args) {

        System.out.println("Bienvenido al sistema de Facturacion de productos");
        Scanner scanner = new Scanner(System.in);
        Usuario usuario = new Usuario("admin", "1234");

        while (true) {

            System.out.println("------------------------------------------");
            System.out.println("Digite su usuario: ");
            String inputUsuario = scanner.nextLine();
            System.out.println("Digite su clave de acceso: ");
            String inputClave = scanner.nextLine();
            if (inputUsuario.equalsIgnoreCase(usuario.getUsuario())) {
                if (inputClave.equals(usuario.getClave())) {
                    System.out.println("------------------------------------------");
                    break;
                }
            }
            System.out.println("------------------------------------------");
            System.out.println("Credenciales incorrectas, intente nuevamente!");

        }

        List<Producto> productos = new ArrayList<>();

        while (true) {

            System.out.println("Menu");
            System.out.println("1. Agregar producto.");
            System.out.println("2. Mostrar productos.");
            System.out.println("3. Borrar producto.");
            System.out.println("4. Realizar venta.");
            System.out.println("5. Salir.");
            String inputSeleccion = scanner.nextLine();
            System.out.println("------------------------------------------");

            switch (inputSeleccion) {
                case "1" -> {
                    System.out.println("Digite el nombre del producto: ");
                    String inputNombre = scanner.nextLine();
                    System.out.println("Digite el precio del producto: ");
                    String inputPrecio = scanner.nextLine();
                    Producto producto = new Producto(inputNombre, Float.parseFloat(inputPrecio));
                    productos.add(producto);
                    break;
                }
                case "2" -> {
                    for (Producto producto : productos) {
                        System.out.println(producto.getNombre() + " --> $" + producto.getPrecioBase());
                    }
                    break;
                }
                case "3" -> {
                    System.out.println("Digite el nombre del producto a eliminar: ");
                    String inputNombre = scanner.nextLine();
                    Producto productoEliminar = null;
                    for (Producto producto : productos) {
                        if (producto.getNombre().equalsIgnoreCase(inputNombre)) {
                            productoEliminar = producto;
                        }
                    }
                    productos.remove(productoEliminar);
                    break;
                }
                case "4" -> {
                    Factura factura = new Factura("Merkar", 1278, "From eaters to eaters", productos);
                    factura.imprimir();
                    break;
                }
                case "5" -> {
                    break;
                }
                default ->
                    System.out.println("Realiza una eleccion valida!");

            }

            System.out.println("------------------------------------------");

            if (inputSeleccion.equals("5")) {
                break;
            }
        }

    }
}
