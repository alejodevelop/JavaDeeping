 import java.util.Scanner;
 
public class EnsayoEntradas{
  public static void main(String args[]){
   
  Scanner leer = new Scanner (System .in);
  String nombre = ""; 
  int num1 = 0 , num2 = 0 , resultado = 0, operacion = 0;

   System.out.println("�c�mo te llamas?");
   nombre = leer.nextLine();
   System.out.println("escribe la operaci�n que deseas realizar 1 = + ,2 = - ,3 = *,4 = /");
   operacion = leer.nextInt();
   System.out.println("dame un n�mero");
   num1   = leer.nextInt(); 
   System.out.println("introduce el segundo n�mero");
   num2   = leer.nextInt();
  
    if (operacion == 1 ){
    resultado =  num1 + num2;
    System.out.println( "Hola " + nombre + " El resultado es: " + resultado);
  } else if ( operacion ==  2 ){
    resultado =  num1 - num2;
    System.out.println( "Hola " + nombre + " El resultado es: " + resultado);
  } else if ( operacion ==  3  ){
    resultado =  num1 * num2;
    System.out.println( "Hola " + nombre + " El resultado es: " + resultado);
  } else if ( operacion == 4 ){
    resultado =  num1 / num2;
    System.out.println( "Hola " + nombre + " El resultado es: " + resultado);
  } else{
    System.out.println ("no digitaste una operaci�n valida");
  }
 }
}