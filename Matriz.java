import java.util.Scanner;

public class Matriz{
  public static void main(String args[]){

    Scanner read = new Scanner(System.in);

    int A[][] = new int[2][3];
    int B[][] = new int[2][3];
    int C[][] = new int[2][3];
 
    for(int f = 0; f<2; f++){
        
       for(int c = 0; c<3; c++){
          System.out.println( "digite el dato a guardar vector A " + " fila = " + f + " columna = " + c );  
          A[f][c] = read.nextInt(); 
          System.out.println( "digite el dato a guardar vector B" + " fila = " + f + " columna = " + c );  
          B[f][c] = read.nextInt(); 
          C[f][c] = A[f][c] + B[f][c];
       }
     }  

       System.out.println("El vector impreso es :");     
       System.out.println("");

     for(int f = 0; f<2; f++){
        
       for(int c = 0; c<3; c++){
          System.out.print("[" + C[f][c] + "]");   
          if(c==2){
            System.out.println("");
          }
       }
     }   
  }
}

//a
// 5 6 7
// 3 4 2
//b
// 2 3 1
// 5 2 2
//c
// 7 9 8
// 8 6 4