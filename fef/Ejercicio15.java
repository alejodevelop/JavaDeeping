package ejercicio15;

import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {

        int total = 0, meses = 0, n1 = 0, n2 = 1, resultado = 0;
        Scanner read = new Scanner(System.in);

        System.out.println("Digite la cantidad de meses");
        meses = read.nextInt();

        for(int i = 1; i <= meses; i++){
          resultado = n1 + n2;
          n2 = n1;
          n1 = resultado;
          total = resultado * 2;                   
        }

        
        System.out.println("la cantidad de Parejas en " + meses + " mes(es) equivale a: ");
        System.out.println(resultado);
        System.out.println("la cantidad de crías en " + meses + " mes(es) equivale a: ");
        System.out.println(total);
    }

}

// 1 mes   = 1 n1
// 2 meses = 1 n2
// 3 meses = 2 re
// 4 meses = 3 n1
// 5 meses = 5 n2
// 6 meses = 8 re



