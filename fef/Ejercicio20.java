
public class Ejercicio20{
  public static void main(String args[]){
    
    int A[] = new int[20];
    int B[] = new int[20];
    int C[] = new int[20];

    for(int i = 0; i<=19; i++){
        A[i] = i + i;
        B[i] = A[i] + i;
    }
      
    
    for(int i = 0, d = 19; i<=19; i++, d--){
         C[i] = A[i] * B[d];

         if(i<=5){
           System.out.print( C[i] + " "); 
           if(i==5){
              System.out.println(" ");
           }   
         }
         if(i>5 && i<=10){
           System.out.print( C[i] + " ");
           if(i==10){
              System.out.println(" ");
           }       
         }
         if(i>10 && i<=15){
           System.out.print( C[i] + " ");
           if(i==15){
              System.out.println(" ");
           }       
         }
         if(i>15 && i<=20){
           System.out.print( C[i] + " ");
           if(i==20){
              System.out.println(" ");
           }       
         }
 
    }   
     
  }
}

