public class Anidadas{
  public static void main(String args[]){
  
   int operacion = 1;
   int num_uno   = 8;
   int num_dos   = 4;
   int resultado = 0;

    if(operacion == 1){ 
     resultado= num_uno + num_dos;
     System.out.println("el resultado de la suma es: " + resultado);
   } else if(operacion == 2){ 
     resultado= num_uno - num_dos;
     System.out.println("el resultado de la resta es: " + resultado);
   } else if(operacion == 3){
     resultado= num_uno * num_dos;
     System.out.println("el resultado de la multiplicaci�n es: " + resultado);
   } else if(operacion == 4){
     resultado= num_uno / num_dos;
     System.out.println("el resultado de la divisi�n es: " + resultado);
   } else{ 
     System.out.println("la operaci�n que elegiste no existe crack ");
   }
 }
}