import javax.swing.*;
import java.awt.event.*;

public class Boton extends JFrame implements ActionListener{

  JButton boton1;

  public Boton (){
    setLayout(null);
    boton1 = new JButton("cerrar"); 
    boton1.setBounds(300,250,100,30);
    add(boton1);
    boton1.addActionListener(this);  
  }

  public void actionPerformed(ActionEvent cerrar){
    if(cerrar.getSource() == boton1){
      System.exit(0); 
    }
  }

  public static void main(String args []){
  
    Boton ventana = new Boton();
    ventana.setBounds(0,0,450,350);
    ventana.setVisible(true);
    ventana.setResizable(false);
    ventana.setLocationRelativeTo(null);

  }
}