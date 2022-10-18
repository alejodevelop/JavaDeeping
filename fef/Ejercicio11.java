
package ejercicio11;
import java.util.Scanner;


public class Ejercicio11 {

   
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        // TODO code application logic here
        String multiplo="";
        String multiplowhile="";
        boolean x=true;
        System.out.println("Digite el primer numero= ");
        int a= sn.nextInt();
        int y=a;
        System.out.println("Digite el segundo numero= ");
        int b= sn.nextInt();
        if(a<b){
                                    for(int i=1;i<b;i++){
                if(i%a==0){
                    multiplo=multiplo+i+",";
                    
                }
            }

            
            while(x){
                if(y>=b){
                    
                    break;
                }
                multiplowhile=multiplowhile+y+",";
                y=a+y;
            }
            
        }
        else{
            System.out.println("Debido a que el primer numero es mayor que el segundo,no existen multiplos del primero que sean menores que el segundo ");
            multiplo="ninguno";
            multiplowhile="ninguno";
        }
        System.out.println("_________________________________________________");
        System.out.println("Los multiplos de "+a+" menores que "+b+" son= "+multiplo+" usando for");
        System.out.println("Los multiplos de "+a+" menores que "+b+" son= "+multiplowhile+" usando while");
        // Es mas clara y sencilla la while
    }
    
}
