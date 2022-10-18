import javax.swing.*;

public class Etiquetas extends JFrame {
  
  private JLabel label1;
  private JLabel label2;

  public Etiquetas(){ 
   setLayout(null);
   label1 = new JLabel("Interfaz gráfica, etiquetas.");
   label1.setBounds(10,20,300,30);
   add(label1);
   label2 = new JLabel("Version 1.0");
   label2.setBounds(10,100,100,30);
   add(label2);
 }  

  public static void main(String args[]){
  Etiquetas interfaz = new Etiquetas();
  interfaz.setBounds(0,0,300,200);
  interfaz.setResizable(true);
  interfaz.setVisible(true);
  interfaz.setLocationRelativeTo(null);

  
  
 }
}