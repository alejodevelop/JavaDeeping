import javax.swing.*;

public class AprendiendoInterfaz extends JFrame{
  public AprendiendoInterfaz(){
   setLayout(null);
 }
  
  public static void main(String args []){
   AprendiendoInterfaz formulario1 = new AprendiendoInterfaz();
   formulario1.setBounds(0,0,400,200);
   formulario1.setVisible(true);
   formulario1.setLocationRelativeTo(null);
   formulario1.setResizable(false);
 }
}