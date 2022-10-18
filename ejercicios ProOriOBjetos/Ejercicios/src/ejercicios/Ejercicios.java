package ejercicios;

import java.util.Scanner;

public class Ejercicios {

    public static void main(String args[]) {

        Scanner read = new Scanner(System.in);
        int Numestud;

        System.out.println("Digíte el número de estudiantes: ");
        Numestud = read.nextInt();

        String Nombres[] =  new String[Numestud];
        int  promedios[] =  new int[Numestud];
        
        for (int i = 0, ne = 1; i <= Numestud; i++, ne++) {
            System.out.println("Digíte el nombre del estudiante " + ne);
            Nombres[i] = read.nextLine();
            System.out.println("Digíte el promedio del estudiante " + ne);
            promedios[i] = read.nextInt();
        }
    }
}
