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

//El programa genera un vector con 80 valores los cuales llena con números del 1
//al 10 de forma aleatoria, todo valor ingresado por el usuario que sea superior a 10
//0 inferior a 0 siempre sera tomado como un valor que no exite en e vector.

//Para aumentar el rango de números con los que puede ser llenado el vector solo
//hace falta cambiar el valor que se encuentra multiplicando el metodo Math.random.

//El vector solo posee valores enteros.

/**
 *
 * @author Santiago Andrés Diáz Herrera y Alejandro Cabarcas Perdomo
 */