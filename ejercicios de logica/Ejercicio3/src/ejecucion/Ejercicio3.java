package ejecucion;

import clases.Password;

/**
 *
 * @author alejo
 */
public class Ejercicio3 {

    public static void main(String[] args) {

        Password contraseña1 = new Password(12);
        System.out.println(contraseña1.toString());
        contraseña1.esFuerte();

        System.out.println("");
        System.out.println("");

        int longitud = 8;
        int tamaño = 2;

        Password password[] = new Password[tamaño];
        boolean comprobacion[] = new boolean[tamaño];

        for (int i = 0; i < tamaño; i++) {
            password[i] = new Password(longitud);
            System.out.println(password[i]);
            if (password[i].esFuerte()) {
                comprobacion[i] = true;
                System.out.println("comprobacion usando el arreglo, aunque en el metodo ya tengo automatizada la comprobación: " + comprobacion[i]);
            } else {
                comprobacion[i] = false;
                System.out.println("comprobacion usando el arreglo, aunque en el metodo ya tengo automatizada la comprobación: " + comprobacion[i]);
            }
            System.out.println("");

        }

    }
}
