
package ejercicio10;
import java.util.Scanner;


public class Ejercicio10 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sn=new Scanner(System.in);
        short contador=0;
	int promedio=0;
        int numeroentrada;
        double promediototal;
        byte i=1;
        String numerodeentrada="";
	while(i==1){
            System.out.println("________________________________________________________");
            System.out.println("Ingrese un numero natural, al querer terminar ingrese -1");
            numeroentrada=sn.nextInt();
            if(numeroentrada>0){
             contador++;
             promedio=numeroentrada+promedio;
            }
            if (numeroentrada==-1){
                i++;
                break;
                
            }
            if (numeroentrada<-1){
                System.out.println("Escriba solo numeros naturales");
                
            }
            if (numeroentrada==0){
                System.out.println("Escriba solo numeros naturales");
               
            }

        }
        System.out.println("__________________________________________________");
        if(contador!=0){
        System.out.println("Has ingresado "+contador+" numeros naturales");
        System.out.println("La suma de los numeros que has escrito es "+promedio);
        promediototal=promedio/contador;
        System.out.println("El promedio de los numeros que has escrito es "+promediototal);
        }
        else{
            System.out.println("No has escrito ningun numero natural");
        }
    }
    
}
