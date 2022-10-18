import java.util.Scanner;

public class LengthSubString{
  public static void main(String args[]){
 
   Scanner read            = new Scanner(System.in);
   String  cadena_original = "" , cadena_substraccion = ""; 
   int     num_caracteres = 0,    desde = 0,   hasta = 0;

   System.out.println("");
   System.out.println("Este programa indíca el número de caracteres que posee una cadena de caracteres");
   System.out.println("");
   System.out.print("Escriba la cadena de caracteres que desee: ");
   cadena_original = read.nextLine();
   System.out.println("");
   
   num_caracteres = cadena_original.length();

   System.out.println("");
   System.out.println("La cadena de caracteres " + cadena_original + " posee "  
   + num_caracteres + " caracteres.");

   System.out.println("");
   System.out.print("¿Desde que caracter deseas obtener la nueva cadena?: ");
   desde = read.nextInt();
   System.out.print("¿Hasta que caracter deseas obtener la cadena?: ");
   hasta=  read.nextInt();

   cadena_substraccion = cadena_original.substring(desde, hasta);
   System.out.println("");
   System.out.print("La nueva cadena es: " + cadena_substraccion );

 }
}