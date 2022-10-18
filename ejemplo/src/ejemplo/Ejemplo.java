/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;

import java.util.Scanner;
 public class Ejemplo{
  public static void main(String args[]){

  Scanner read = new Scanner (System .in);
  String nombre = "";
  
  int i = 0;
  System.out.println("");
  System.out.println("***********************************************************************");
  System.out.println("*Bienvenido al programa que adivina el número que pensaste del 1 al 63*");
  System.out.println("***********************************************************************");
  System.out.println("");  
  System.out.println("¿cómo te llamas?");
  System.out.println("");
  nombre = read.nextLine(); 
  
  do{

  int  resultado = 0, n1 = 0, n2 = 0, n3 = 0, n4 = 0, n5 = 0, n6 = 0, t1 = 0, t2 = 0, t3 = 0, t4 = 0,  t5 = 0, t6 = 0; 
  
  System.out.println("");
  System.out.println("------------------------------");
  System.out.println("-Piensa un número del 1 al 63-");
  System.out.println("------------------------------");
  System.out.println(""); 
  System.out.println("A continuación te mostrare 6 tablas que contienen numeros del 1 al 63");
  System.out.println("escribe 1 si la respuesta es -si- o 2 en caso de que sea -no- , esto si el número que pensaste se encuentra en cada tabla");
  System.out.println("");
  System.out.println("//////////////////");
  System.out.println("//Primera tabla//");
  System.out.println("////////////////");
  System.out.println("");
  System.out.println("  1 	3	5	7	9	11 ");
  System.out.println("  13    15	17	19	21      23 ");
  System.out.println("  25	27	29	31	33      35 ");
  System.out.println("  37	39	41	43	45      47 ");
  System.out.println("  49	51	53	55	57      59 ");
  System.out.println("  61	63 ");				


   t1 = read.nextInt();
   
  if(t1 == 1 ){
    n1 = 1;
  }else{
   System.out.println("");
   System.out.println("El valor que ingresaste no es valido"); 
  }

  System.out.println("");
  System.out.println("//////////////////");
  System.out.println("//Segunda tabla//");
  System.out.println("////////////////");
  System.out.println("");
  System.out.println("   2	3	6	7	10	11 ");
  System.out.println("  14	15	18	19	22	23 ");
  System.out.println("  26	27	30	31	34	35 ");
  System.out.println("  38	39	42	43	46	47 ");
  System.out.println("  50	51	54	55	58	59 ");
  System.out.println("  62	63 ");				

       
  t2 = read.nextInt();
   
  if(t2 == 1 ){
    n2 = 2;
  }else{ 
   System.out.println("");
   System.out.println("El valor que ingresaste no es valido"); 
  }

  System.out.println("");
  System.out.println("//////////////////");
  System.out.println("//tercera tabla//");
  System.out.println("////////////////");
  System.out.println("");
  System.out.println("    4	5	6	7	12	13 ");
  System.out.println("   14	15	20	21	22	23 ");
  System.out.println("   28	29	30	31	36	37 ");
  System.out.println("   38	39	44	45	46	47 ");
  System.out.println("   52	53	54	55	60	61 ");
  System.out.println("   62	63 ");				


   t3 = read.nextInt();

  if(t3 == 1 ){
    n3 = 4;
  }else{ 
   System.out.println("");
   System.out.println("El valor que ingresaste no es valido");
 }

  System.out.println("");
  System.out.println("/////////////////");
  System.out.println("//cuarta tabla//");
  System.out.println("///////////////");
  System.out.println("");
  System.out.println("   8	9	10	11	12	13 ");
  System.out.println("  14	15	24	25	26	27 ");
  System.out.println("  28	29	30	31	40	41 ");
  System.out.println("  42	43	44	45	46	47 ");
  System.out.println("  56	57	58	59	60	61 ");
  System.out.println("  62	63 ");				

   
   t4 = read.nextInt();

   if(t4 == 1 ){
     n4 = 8;
   }else{ 
    System.out.println("");
    System.out.println("El valor que ingresaste no es valido");  
   }

  System.out.println("");
  System.out.println("/////////////////");
  System.out.println("//quinta tabla//");
  System.out.println("///////////////");
  System.out.println("");
  System.out.println("  16	17	18	19	20	21 ");
  System.out.println("  22	23	24	25	26	27 ");
  System.out.println("  28	29	30	31	48	49 ");
  System.out.println("  50	51	52	53	54	55 ");
  System.out.println("  56	57	58	59	60	61 ");
  System.out.println("  62	63 ");				


   t5 = read.nextInt();

  if(t5 == 1 ){
    n5 = 16;
  }else{ 
   System.out.println("");
   System.out.println("El valor que ingresaste no es valido"); 
  }

  System.out.println("");
  System.out.println("////////////////");
  System.out.println("//sexta tabla//");
  System.out.println("///////////////");
  System.out.println("");
  System.out.println("  32	33	34	35	36	37 ");
  System.out.println("  38	39	40	41	42	43 ");
  System.out.println("  44	45	46	47	48	49 ");
  System.out.println("  50	51	52	53	54	55 ");
  System.out.println("  56	57	58	59	60	61 ");
  System.out.println("  62	63 ");				


  t6 = read.nextInt();

  if(t6 == 1 ){
    n6 = 32;
  }else { 
   System.out.println("");  
   System.out.println("El valor que ingresaste no es valido");  
  } 

   resultado = n1 + n2 + n3 + n4 + n5 + n6;

   System.out.println("");

   System.out.println( nombre + " el número que pensaste es : " + resultado );
   
   System.out.println("");

   System.out.println("//////////////////////////");   

   System.out.println("/¿desea repetir el juego?/");
 
   System.out.println("//////////////////////////"); 
 
   System.out.println("");   

   System.out.println("Escriba -1- si, -2- no");

   System.out.println("");
   
   i = read.nextInt();
  
  
  }while(i == 1);
  
 }
}