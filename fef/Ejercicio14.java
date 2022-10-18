
package ejercicio14;
import java.util.Scanner;


public class Ejercicio14 {

   
    public static void main(String[] args) {    
        // TODO code application logic here
        Scanner sn=new Scanner(System.in);
                int num1,num2;
                int nummin,nummax;
        boolean MCD=false;
        
        while(true){
            System.out.println("Ingrese el primer numero: ");
            num1 = sn.nextInt();
            System.out.println("Ingrese el segundo numero: ");
            num2 = sn.nextInt();
            
            if (num1 > 0 && num2 > 0 ){
                if(num1>num2){
                    nummin=num2;
                    nummax=num1;
                }
                else{
                    nummin=num1;
                    nummax=num2;
                }
                int r= nummin;
                while(!MCD  && r>=1){
                    if(nummin%r == 0 && nummax%r ==0){
                        System.out.println("El máximo común divisor es ="+r);
                        MCD=true;
                    }
                    else{
                        r--;
                    }
                }
                break;
            }
            else {
                System.out.println("Los numeros deben ser positivos");
            }      
        }
    }
    
}
