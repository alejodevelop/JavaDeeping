import java.util.Scanner;

public class Ejercicio16 {

  public static void main(String args[]) {
  
    Scanner read = new Scanner(System.in);

    int A[] = new int[25];
    int B[] = new int[25];
    int C[] = new int[25];

    

    for(int i=0; i<25; i++){
    System.out.println("digite el numero de el vector A");
    A[i] = read.nextInt();
    System.out.println("digite el numero de el vector B");
    B[i]= read.nextInt();
    C[i]= A[i] + B[i];
    }

    for(int i = 0; i<25; i++){

      System.out.print("[" +  C[i] + "]");
    }
  }
}
 

