import java.util.Scanner;
public class VectorDinamico{
  public static void main(String args[]){

   Scanner read = new Scanner (System.in);
   int p = 0;

   System.out.println("");
   System.out.println("Hola, escribe cuantas posiciones quieres que tenga el vector ");
   p = read.nextInt();
   
   int numeros[] = new int [p];

   for(int i = 0; i < numeros.length; i++ ){
     System.out.println("Escribe el dato # " + ( i + 1) );  
     System.out.println("");
     
     numeros[i] = read.nextInt();    
   }
   for(int i = 0; i < numeros.length; i++ ){
      System.out.print("[" + numeros[i] + "] " );
    }
 }
}