import java.util.Scanner;

public class MayorMenor{
  public static void main(String args[]){

  Scanner read = new Scanner (System .in);
  int num1 = 0, num2 = 0;
 
  System.out.println("Escriba dos numeros, la maquina sencillamente determinara que numero es mayor y cual es menor");
  System.out.println("Primer numero");
  num1 = read.nextInt();
  System.out.println("Segundo numero");
  num2 = read.nextInt();

  if(num1 > num2 ){
    System.out.println( + num1 + " es mayor que " + num2);    
  } else if(num2 > num1){
    System.out.println( + num2 + " es mayor que " + num1);
  } else if(num1 == num2){
    System.out.println( + num1 + " y " + num2 + "son iguales");
  }
 }     
}