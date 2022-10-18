/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadjava;

import java.util.Scanner;

/**
 *
 * @author alejo
 */
public class ActividadJava {
    
     public static Scanner  reader = new Scanner(System.in);
    
    public static void PrimerPunto(int edad) {
        if (edad >= 18) {
            System.out.println("La persona puede votar");
        } else {
            System.out.println("La persona no es apta para votar");
            
        }
    }
    
    public static void SegundoPunto(int numero) {
        
        if (numero % 2 != 0) {
            System.out.println("El numero es Impar");
        } else {
            System.out.println("El numero es par");
        }
    }
    
    public static void TercerPunto(int numero) {

        //un numero es NoPrimo si solo es divisible entre 1 y el mismo
        boolean NoPrimo = true;
        int divisor = 2;
        
        do {
            
            if (numero % divisor == 0) {
                NoPrimo = false;
                divisor=numero;
            } else {
                divisor++;
            }
            
        } while (NoPrimo == true || divisor < numero);
        
        if (NoPrimo) {
            System.out.println("El numero " + numero +  " SI es primo");
        } else{
            System.out.println("El numero " + numero +  " NO es primo");

        }
        
    }
    
    public static void CuartoPunto() {

//Codigo con errores

//        int first, second;
//        System.out.println("Ingrese el primer numero");
//        first= texto.nextInt();
//        System.out.println("Ingrese el segundo numero");
//        second= texto.nextInt();
//        
//        if(first == second){
//            System.out.println("Los numeros son iguales");
//        } else {
//            System.out.println("Los numeros son iguales");
//        }
      
//Codigo sin errores
        
        int first, second;
        System.out.println("Ingrese el primer numero: ");
        first = reader.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        second = reader.nextInt();
        System.out.println("");
        
        if (first == second) {
            System.out.println("Los numeros son iguales");
        } else {
            System.out.println("Los numeros no son iguales");
        }
        
        System.out.println("");
        
        System.out.println(""
                + "int first, second; \n"
                + "System.out.println(\"Ingrese el primer numero\"); \n"
                + "first = reader.nextInt(); \n"
                + "System.out.println(\"Ingrese el segundo numero\" \n);"
                + "second = reader.nextInt(); \n"
                + "if (first == second) { \n"
                + "System.out.println(\"Los numeros son iguales\"); \n"
                + "} else { \n"
                + "System.out.println(\"Los numeros no son iguales\"); \n"
                + "} \n");
        
    }
    
    public static void QuintoPunto(int puntaje) {
        
        if (puntaje >= 90) {
            System.out.println("El puntaje del estudiante es: A");
        } else if (puntaje >= 80) {
            System.out.println("El puntaje del estudiante es: B");
        } else if (puntaje >= 70) {
            System.out.println("El puntaje del estudiante es: C");
        } else if (puntaje >= 60) {
            System.out.println("El puntaje del estudiante es: E");
        } else if (puntaje < 60) {
            System.out.println("El puntaje del estudiante es tan malo que nisiquiera esta en la clasificacion!");
        }
    }
    
    public static void SextoPunto(int temperatura){
        
        if (temperatura < 30) {
            System.out.println("Esta helando!");
        } else if (temperatura < 50) {
            System.out.println("Hace frio!");
        } else if (temperatura < 90) {
            System.out.println("Es agradable!");
        } else if (temperatura >= 90) {
            System.out.println("Hace calor!");
        }
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("1.Digite la edad de la persona: ");
        int edad= reader.nextInt();
        System.out.println("");
        PrimerPunto(edad);
        System.out.println("");
        
        System.out.println("------------------------------------------------------------------");
        
        System.out.println("2.Digite el numero para analizar si es o no par: ");
        int numero= reader.nextInt();
        System.out.println("");
        SegundoPunto(numero);
        System.out.println("");
        
        System.out.println("------------------------------------------------------------------");
        
        System.out.println("3.Digite el numero que desea comprobar si es primo o no: ");
        numero = reader.nextInt();
        TercerPunto(numero);
        System.out.println("");
        
        System.out.println("------------------------------------------------------------------");
        
        System.out.println("4.Este es el problema funcionando bien y con su codigo correcto: ");
        System.out.println("");
        CuartoPunto();
        System.out.println("");
        
        System.out.println("------------------------------------------------------------------");
        
        System.out.println("5.Ingrese el puntaje del estudiante a calificar: ");
        int puntaje= reader.nextInt();
        QuintoPunto(puntaje);
        System.out.println("");
        
        System.out.println("------------------------------------------------------------------");
        
        System.out.println("6.Ingrese la temperatura para determinar el clima: ");
        int temperatura = reader.nextInt();
        SextoPunto(temperatura);
        System.out.println("");
           
    }
    
}
