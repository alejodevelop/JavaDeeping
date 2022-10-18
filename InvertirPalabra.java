import java.util.Scanner;

public class InvertirPalabra{
  public static void main(String args[]){

    Scanner read = new Scanner(System.in);    
    String acum = "";

    System.out.println(""); 
    System.out.println("Bienvenido, este programa toma texto y lo invierte");
    System.out.println("");
    System.out.println("Escribe el texto que deseas invertir");
    String texto= read.nextLine();
    System.out.println("");
    
    int num_caracteres= texto.length();
    
    for(int desde = num_caracteres - 1, hasta = num_caracteres; hasta > 0; desde--, hasta--){
      acum+= texto.substring(desde,hasta);
    }

    System.out.println("la cadena invertida es");
    System.out.println("");
    System.out.println(acum);
    
  }
}