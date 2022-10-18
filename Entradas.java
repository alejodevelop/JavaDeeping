 import java.util.Scanner;

public class Entradas{ 
  public static void main(String args[]){
 
   Scanner entrada = new Scanner(System. in);
   String nombre = "";
   int numUno = 0 , numDos = 0, resultado = 0; 
  
   System.out.println("	¿cómo te llamas?");
   nombre = entrada.nextLine();
   System.out.println("digíta el primer número");
   numUno = entrada.nextInt();
   System.out.println("digíta el segundo número");
   numDos = entrada.nextInt();
    
   resultado = numUno + numDos;

   System.out.println("Hola " + nombre + " el resultado es: " + resultado);

 }
}