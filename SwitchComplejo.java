import java.util.Scanner;

public class SwitchComplejo{
  public static void main(String args[]){

  Scanner read = new Scanner(System .in);

  int num1 = 0, num2 = 0, parametro = 0, resultado = 0;
 
  System.out.println("");
  System.out.println("|||||||||||||||||||||||||||||||||");
  System.out.println("|¡Hola, esto es una calculadora!|"); 
  System.out.println("|||||||||||||||||||||||||||||||||");
  System.out.println("");  
  System.out.println("-----------------------------------");
  System.out.println("-Escribe el primer número porfavor-");
  System.out.println("-----------------------------------");
  System.out.println("");
  num1 = read.nextInt();
  System.out.println("");  
  System.out.println("------------------------------------");
  System.out.println("-Escribe el segundo número porfavor-");
  System.out.println("------------------------------------");
  System.out.println("");
  num2 = read.nextInt();
  System.out.println("");
  System.out.println("---------------------");
  System.out.println("-Digita la operación-"); 
  System.out.println("---------------------");
  System.out.println("");
  System.out.println("-----------------------------------------------------------------");
  System.out.println("-1 si es (+), 2 si es (-), 3 si es (*), 4 si es (/), 5 si es (^)-");
  System.out.println("-----------------------------------------------------------------");
  System.out.println("");
  parametro = read.nextInt();

   switch(parametro){
   
    case 1: resultado = num1 + num2; 
    break;
  
    case 2: resultado = num1 - num2;   
    break;    
   
    case 3: resultado = num1 * num2;   
    break;

    case 4: resultado = num1 / num2;   
    break;  

    case 5: resultado = num1  ^num2;   
    break;
     
    default: System.out.println("la opción que escogiste es incorrecta" ); 
    break;
  }  
   System.out.println("");
   System.out.println("El resultado es: " + resultado ); 
 }
}