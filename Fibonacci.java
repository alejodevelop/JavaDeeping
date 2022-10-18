public class Fibonacci{
  public static void main(String args []){


   System.out.println("");
   System.out.println("secuencia con for: ");   
   System.out.println("");

  for( int n1 = 0, n2 = 1, r = 0; r <= 55; ){
   
    if(n1 < 1){
      System.out.print(n1 + ",");
    }  else {}

    r = n1 + n2;
    System.out.print(n2 + ",");
    n1 = n2;
    n2 = r;
   
    if(r == 89){
      System.out.print(n2);
    }  else {}
  }
   System.out.println("");
   System.out.println("secuencia con while: ");   
   System.out.println("");
 
   int n1 = 0, n2 = 1, r = 0;

   while(r <= 55){
    if(n1 < 1){
      System.out.print(n1 + ",");
    }  else {}

    r = n1 + n2;
    System.out.print(n2 + ",");
    n1 = n2;
    n2 = r;
   
    if(r == 89){
      System.out.print(n2);
    }  else {}
     
   }
   
   System.out.println("");
   System.out.println("secuencia con do-while: ");   
   System.out.println("");   
   
   int i = 0;   
   n1    = 0;
   n2    = 1;
   r     = 0;

   do{   
  
    if(i < 11){ 
   
     System.out.print(n1 + ",");
  
     r  = n1 + n2;
     n1 =      n2;
     n2 =       r;  
     
    }  else {
      System.out.print(n1);
    }    
  
      i++;     

   }  while(i < 12);

 }
} 
  





 