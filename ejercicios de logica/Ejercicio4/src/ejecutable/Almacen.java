package ejecutable;

import electrodomesticos.*;

/**
 *
 * @author alejo
 */
public class Almacen {

    public static void main(String[] args) {
        //creando el array que contendra mis objetos de tipo electrodomestico
        Electrodomesticos electrodomesticos[] = new Electrodomesticos[10];

        //llenando el array
        electrodomesticos[0] = new Electrodomesticos(100, "rojo", "A", 50);
        electrodomesticos[1] = new Lavadora(100, 40);
        electrodomesticos[2] = new Television(50, true, 100, "rojo", "A", 10);
        electrodomesticos[3] = new Electrodomesticos(100, "rojo", "A", 50);
        electrodomesticos[4] = new Lavadora(100, 40);
        electrodomesticos[5] = new Television(50, true, 100, "rojo", "A", 10);
        electrodomesticos[6] = new Electrodomesticos(100, "rojo", "A", 50);
        electrodomesticos[7] = new Lavadora(100, 40);
        electrodomesticos[8] = new Television(50, true, 100, "rojo", "A", 10);
        electrodomesticos[9] = new Electrodomesticos(100, "rojo", "A", 50);

        //otro for each todo bonito para recorrer el areglo
        int tv = 0, lavadora = 0, electro = 0;
        for (Electrodomesticos elemento : electrodomesticos) {
            elemento.precioFinal();
            if (elemento instanceof Electrodomesticos) {
                electro += elemento.getPrecioBase();
            }
            if (elemento instanceof Lavadora) {
                lavadora += elemento.getPrecioBase();
            } else if (elemento instanceof Television) {
                tv += elemento.getPrecioBase();
            }
            System.out.println(elemento.getClass() + ": " + elemento.getPrecioBase() + '$');
        }

        System.out.println("");

        System.out.println("Precio total electrodomesticos: " + electro + '$' );
        System.out.println("");
        System.out.println("Precio total lavadoras: " + lavadora + '$');
        System.out.println("");
        System.out.println("Precio total televisores: " + tv + '$');
    }
}
