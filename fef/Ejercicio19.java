import java.util.Scanner;
import java.util.Random;

public class Ejercicio19{
  public static void main(String args[]){
    
    Scanner read = new Scanner(System.in);
    int n = 0, c = 0, d = 0;
    int elementos[] = new int[80]; 
    
    System.out.println("Ingrese el número que desea buscar");
     n = read.nextInt();
   
    for(int i = 0; i<=79; i++){
        c = (int) (Math.random() * 10) + 1;
        elementos[i] = c;
        
          if(n == c){
          d = elementos[i];
        }        
    }

    if(d == n){
       System.out.println("El numero " + n + " se encuentra en el vector");  
    }  else {
       System.out.println("El numero " + n + " no se encuentra en el vector");
    }
  }
}

