import java.util.Scanner;

public class CompararNumeros{
  public static void main(String args []){

   Scanner read = new Scanner(System.in);
   String p1 = "", p2 = "";
   
   System.out.println("");
   System.out.println("Compara nombres");
   System.out.println("");
   System.out.println("Por favor escriba el primer nombre");
   p1 = read.nextLine();
   System.out.println("");
   System.out.println("Ahora, digíte el otro nombre");
   p2 = read.nextLine();
   System.out.println("");

   if(p1.equalsIgnoreCase(p2)){
     System.out.println("los dos nombres que ingresaste son iguales");   
   }  else{       
   System.out.println("Los dos nombres que ingresaste son diferentes" );
   }
 }
}