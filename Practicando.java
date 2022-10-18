import java.util.Scanner;

public class Practicando{
  public static void main(String args[]){

   Scanner read = new Scanner(System.in);
   String  nombre = "", nuevo_nombre = "";
   int desde = 0, hasta = 0, caracteres = 0;
   String nombres[] = new String[6];

   nombres[0] = "alejo";
   nombres[1] = "eduardo";
   nombres[2] = "daniel";
   nombres[3] = "fernando";
   nombres[4] = "david";
   nombres[5] = "juanes";
 
   System.out.println("Ingrese el nombre para verificar su longitud, y si esta en el vector");
   nombre = read.nextLine();

   if(nombre.equalsIgnoreCase(nombres[0]) || nombre.equalsIgnoreCase(nombres[1]) || nombre.equalsIgnoreCase(nombres[2]) || nombre.equalsIgnoreCase(nombres[3]) || nombre.equalsIgnoreCase(nombres[4]) || nombre.equalsIgnoreCase(nombres[5])){
     
     caracteres = nombre.length();
   
     System.out.println("Su nombre tiene " + caracteres + " caracteres");
     System.out.println("Ahora escriba desde donde quiere empezar a formar una nueva palabra con el nombre");
     desde = read.nextInt();
     System.out.println("Ahora escriba hasta donde quiere empezar a formar una nueva palabra con el nombre");  
     hasta = read.nextInt(); 
     
     nuevo_nombre = nombre.substring(desde, hasta);
     
     System.out.println(nuevo_nombre);
     
   }
 
   System.out.println("Su nombre no se encuentra en el vector");
 }
}