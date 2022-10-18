import java.util.Scanner;

public class MatricesDinamicas{
  public static void main(String args[]){
 
   Scanner read = new Scanner (System.in);
   int contador = 1, filas = 0, columnas = 0;

   System.out.println("");
   System.out.println("Escribe cuantas filas tendra la matriz");
   filas    = read.nextInt();
   System.out.println("Escribe cuantas columnas tendra");
   columnas = read.nextInt();
   System.out.println("");

   int matriz [] [] = new int [filas] [columnas];
   
   for(int j = 0; j < filas; j++ ){ 
     for(int i = 0; i < columnas; i++){
       
       matriz [j] [i] = contador;      
       System.out.print("[" + matriz [j] [i] + "]");
       contador++;       
     }
     System.out.println("");
   }

 }
}