
package ejercicio12;
import java.util.Scanner;


public class Ejercicio12 {

  
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sn=new Scanner(System.in);
        boolean opcion=false;
        int salir;
        int i;
        int suma=0;
        int numero1;
        int numero2;
        while(!opcion){
        System.out.println("_________________________________");    
        System.out.println("Introduce primer número: ");
        numero1 = sn.nextInt();
        System.out.println("Introduce segundo número: ");
        numero2 = sn.nextInt();
        for(i=1;i<numero1;i++){ 
             if(numero1%i==0){
                suma=suma+i;
             }
        }
       
        if(suma==numero2){
           suma=0;
           for(i=1;i<numero2;i++){ 
                if(numero2%i==0){
                   suma=suma+i;
               }
           }
     
           if(suma==numero1){
              System.out.println("Son Amigos");
           }else{
                   System.out.println("No son amigos");
           }
        }        
        else{
               System.out.println("No son amigos");
        }
        System.out.println("____________________________________");
        System.out.println("Si desea cerrar el programa digite 1");
                salir= sn.nextInt();
                if(salir==1) break;
                    
    }
    }
}

           
    
    
