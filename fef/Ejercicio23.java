import java.util.Scanner;

public class Ejercicio23{
  public static void main(String args[]){

    Scanner read = new Scanner(System.in);
    int N;

    System.out.println("");
    System.out.println("Digite el numero de vacas: ");
    N = read.nextInt();
    
    int P[][] = new int[7][N];

    for(int f = 0, v = 1; f<N; f++, v++){
        for(int c = 0, d = 1 ; c<7; c++, d++){
          System.out.println("Digite la produccion de la vaca " + v + " para el dia " + d);
          P[f][c] = read.nextInt();
        }
    }
 
    int T[] = new int[N];
    
    for(int c = 0; c<N; c++){  
         
       for(int f = 0; f<7; f++){
         T[c] += P[f][c];
       }
    }

    for(int f = 0, v = 0, d = 1; f<7; f++, d++){
        System.out.print("Dia " + d + " " + T[f]);
        if(T[f] > T[f + d]){
          v = T[f];
        }
        if(f==6){
          System.out.print("La vaca que mas produjo es: " + v );
        }
    }
    
   

  }
}