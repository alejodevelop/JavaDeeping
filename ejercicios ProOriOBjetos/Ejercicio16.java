public class Ejercicio16 { 
    
    public static void main(String[] args) {

        int A[] = new int[5];
        int B[] = new int[5];
        int C[] = new int[5];
        
        A[0] = 4;
        A[1] = 6;
        A[2] = 7;
        A[3] = 2;
        A[4] = 8;
        
        B[0] = 9;
        B[1] = 1;
        B[2] = 2;
        B[3] = 3;
        B[4] = 5;
        
        C[0] = A[0] + B[0];
        C[1] = A[1] + B[1];
        C[2] = A[2] + B[2];
        C[3] = A[3] + B[3];
        C[4] = A[4] + B[4];
        
        
        System.out.print("Vector C : ");
        
        System.out.print(C[0] + ", " );
        System.out.print(C[1] + ", " );
        System.out.print(C[2] + ", " );
        System.out.print(C[3] + ", " );
        System.out.print(C[4] + ", " );
    }

}

/**
 *
 * @author Santiago Andrés Diáz Herrera y Alejandro Cabarcas Perdomo
 */