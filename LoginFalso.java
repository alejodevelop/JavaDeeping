import java.util.Scanner;

public class LoginFalso{
  public static void main(String args[]){

   Scanner read = new Scanner (System .in);
   int password = 0, c = 1076909715;
   String user = "", u = "alejandro";

   System.out.println("");
   System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
   System.out.println("%Bienvenido a este inicio de sesión simulado%");
   System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
   System.out.println("");
   System.out.println("%%%%%%%%%%%%%%%%%%%%");
   System.out.println("%Escriba su usuario%");
   System.out.println("%%%%%%%%%%%%%%%%%%%%");
   System.out.println("");
   user = read.nextLine();
   System.out.println("");
   System.out.println("%%%%%%%%%%%%%%%%%%%%%%");
   System.out.println("%Digíte su contraseña%");
   System.out.println("%%%%%%%%%%%%%%%%%%%%%%");
   System.out.println("");
   password = read.nextInt();
   System.out.println("");

   if(password == c && user.equals(u) ){
     System.out.println(":):):):):):):):):):):):):):):):):):):):):):):):):):):");
     System.out.println(":)Bievenido a su prospera y dichosa cuenta bancaria:)");
     System.out.println(":):):):):):):):):):):):):):):):):):):):):):):):):):):");
   }  else{
     System.out.println("EL usuario o contraseña que ingreso, no corresponde al correcto");
   }
   
  
   
 }
}
