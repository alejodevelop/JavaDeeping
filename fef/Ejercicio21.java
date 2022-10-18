import java.util.Random;

public class Ejercicio21{
  public static void main(String args[]){
    int t[] = new int[10];
    int A[] = new int[10];
    //A[] = productos
    int B[] = new int[10];
    //B[] = pedidos
    int C[] = new int[10];
    int n = 0;
    

    for(int i = 0; i<=9; i++){
        n = (int) (Math.random() * 15) + 1;
        A[i] = 10;
        B[i] =  n;   
    }
    for(int i = 0; i<=9; i++){
        if(A[i] == B[i]){
           C[i] = A[i];
           t[i] = 1;
        }
        if(B[i] > A[i]){
           C[i] = (A[i] - B[i]) * 2; 
           t[i] = 2;  
        }   
        if(A[i] > B[i]){
           C[i] = B[i];  
           t[i] = 3; 
        }   
     }
     
     System.out.println("El vector C es: ");
 
     for(int i = 0; i <= 9; i++){
         System.out.println("[" + C[i] + "]  ");
         if(t[i] == 1){
            System.out.println("A[i] == B[i]");
         }
         if(t[i] == 2){
            System.out.println("B[i] > A[i]");
         }
         if(t[i] == 3){
            System.out.println("A[i] > B[i]");
         }


     }
    
  }
}

