 import java.util.Scanner;
public class SueldoCocaCola{
  public static void main(String args[]){

   Scanner read = new Scanner (System .in);

   String name = "";
   int password =  0 , time = 0;

   System.out.println(" > Bienvenido al sistema para asignar vaciones de Coca-Cola company");

   System.out.println(" > Porfavor, escriba el nombre del empleado");
   name   = read.nextLine();
   System.out.println(" > Ahora, ingrese la clave del departamento a la cual pertenece el dependiente");
   password = read.nextInt();
   System.out.println(" > Como dato final, adjunte la cantidad de años que lleva el empleado en ejercicio de su labor");
   time    = read.nextInt(); 

  if(password == 0 ){
   System.out.println(" > lo sentimos pero debido a su corta estancia en la empresa no goza de este beneficio");
  }else if(password == 1 && time == 1 ){
   System.out.println(" El trabajador " + name + " tendra 6 días de vacaciones ");  
  }else if(password == 1 && time >=2 && time <=6 ){
   System.out.println(" El trabajador " + name + " tendra 14 días de vacaciones ");  
  }else if(password == 1 && time >=7 ){
   System.out.println(" El trabajador " + name + " tendra 20 días de vacaciones ");  
  }else if(password == 2 && time == 1 ){
   System.out.println(" El trabajador " + name + " tendra 7 días de vacaciones ");  
  }else if(password == 2 && time >=2 && time <= 6 ){
   System.out.println(" El trabajador " + name + " tendra 15 días de vacaciones ");  
  }else if(password == 2 && time >=7 ){
   System.out.println(" El trabajador " + name + " tendra 22 días de vacaciones ");  
  }else if(password == 3 && time == 1 ){
   System.out.println(" El trabajador " + name + " tendra 10 días de vacaciones ");  
  }else if(password == 3 && time >=2 && time <= 6 ){
   System.out.println(" El trabajador " + name + " tendra 20 días de vacaciones ");  
  }else if(password == 3 && time >=7 ){
   System.out.println(" > El trabajador " + name + " tendra 30 días de vacaciones ");  
  }else{
   System.out.println(" > La clave que ingresó no es valida");
  }
 }
}