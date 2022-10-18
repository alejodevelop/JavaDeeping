
package ejercicio13;
import java.util.Scanner;

public class Ejercicio13 {

  
    public static void main(String[] args) {
        // TODO code application logic here
        int cantidad;
        double contadordia;
        double contadorpromedio=0;

        double promedio;
        int temp1;
        int temp2;
        int tempmax;
        int tempmin;
        int temperaturamaxima=-1000000;
        int temperaturaminima=1000000;
        int x=0;
        Scanner sn=new  Scanner(System.in);
        System.out.print("Escriba sobre cuantos dias quiere introducir las temperaturas= ");
        cantidad=sn.nextInt();
        if(cantidad>1){
        for(int i=1;i<=cantidad;i++){
            System.out.println("_________________________________________________");
            System.out.print("Introduzca la primera temperatura del dia #"+i+" =");
            temp1=sn.nextInt();
            if(temp1<0){
                System.out.println("La temperatura introducida es negativa");
            }
            System.out.print("Introduzca la segundatemperatura del dia #"+i+" =");
            temp2=sn.nextInt();
            if(temp2<0){
                System.out.println("La temperatura introducida es negativa");
            }
            if(temp1>temp2){
                tempmax=temp1;
                tempmin=temp2;
            }
            else{
                tempmax=temp2;
                tempmin=temp1;
            }
            
            if(tempmax>temperaturamaxima){
                temperaturamaxima=tempmax;
            }
            
            
            if(temperaturaminima>tempmin){
                temperaturaminima=tempmin;

            }
            contadordia=(tempmax+tempmin)/2;
            contadorpromedio=contadorpromedio+contadordia;
        }
        
    
        System.out.println("La temperatura máxima introducida fue= "+temperaturamaxima);
    System.out.println("La temperatura minima introducida fue= "+temperaturaminima);
    promedio=contadorpromedio/cantidad;
    System.out.println("La temperatura promedio de los dias fue de "+promedio);
        }
        else{
            
        }
    
}
}

    
