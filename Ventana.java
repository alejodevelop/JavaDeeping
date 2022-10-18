import javax.swing.*;

public class Ventana extends JFrame{
 
  private JLabel etiqueta;

  public Ventana(){
   setLayout(null);
   etiqueta = new JLabel (" Aprendiendo a pilotear las interfaces ");
   etiqueta.setBounds(100,0,400,400);
   add(etiqueta);     
 }   

  public static void main(String args []){
    Ventana caja = new Ventana ();
    caja.setBounds(0,0,500,500);
    caja.setLocationRelativeTo(null);
    caja.setVisible(true);  
  }
}