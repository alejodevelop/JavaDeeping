import java.util.Scanner;

public class Ejercicio18 {

    public static void main(String args[]) {

        Scanner read = new Scanner(System.in);
        int Numestud, ip = 0; 
        float mayor;

        System.out.println("Digíte el número de estudiantes: ");
        Numestud = read.nextInt();
        read.nextLine();

        String Nombres[] =  new String[Numestud];
        String NombresO[] =  new String[Numestud];
        float  promedios[] =  new float[Numestud];
        float Organizados[] = new float[Numestud];
        
        for (int c = 0, ne = 1; c < Numestud; c++, ne++) {
            System.out.println("Digíte el nombre del estudiante " + ne);
            Nombres[c] = read.nextLine();
            System.out.println("Digíte el promedio del estudiante " + ne);
            promedios[c] = read.nextFloat();
            read.nextLine();
        }            
        
        for(int i = 0; i < Numestud; i++ ){
             if(i > 0){
               ip++;
             }
          for(int ia = 0, ip2 = 0; ia < Numestud; ia++, ip2++){
             if(promedios[ip] < promedios[ip2]){
                Organizados[ip] = promedios[ip];
             } 

           }  
         }

         for(int i = 0; i < Numestud; i++){
           System.out.println("[" + Organizados[i] + "]");
         }
       

    }
}

/**
 *
 * @author Santiago Andrés Diáz Herrera y Alejandro Cabarcas Perdomo
 */