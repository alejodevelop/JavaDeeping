import java.util.Scanner;

public class LoginFalModificado{
  public static void main(String args[]){

   Scanner read = new Scanner (System .in);
   String user = "", password = "";

   System.out.println("");
   System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
   System.out.println("%Bienvenido a este inicio de sesi�n simulado%");
   System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
   System.out.println("");
   System.out.println("%%%%%%%%%%%%%%%%%%%%");
   System.out.println("%Escriba su usuario%");
   System.out.println("%%%%%%%%%%%%%%%%%%%%");
   System.out.println("");
   user = read.nextLine();
   System.out.println("");
   System.out.println("%%%%%%%%%%%%%%%%%%%%%%");
   System.out.println("%Dig�te su contrase�a%");
   System.out.println("%%%%%%%%%%%%%%%%%%%%%%");
   System.out.println("");
   password = read.nextLine();
   System.out.println("");

   if(password.equals("1076909715alejo") && user.equals("alejandro") ){
     System.out.println(":):):):):):):):):):):):):):):):):):):):):):):):):):):");
     System.out.println(":)Bievenido a su prospera y dichosa cuenta bancaria:)");
     System.out.println(":):):):):):):):):):):):):):):):):):):):):):):):):):):");
   }  else{
     System.out.println("EL usuario o contrase�a que ingreso, no corresponde al correcto");
   }
   
  
   
 }
}
