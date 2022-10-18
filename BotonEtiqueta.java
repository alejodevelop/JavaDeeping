import javax.swing.*;
import java.awt.event.*;

public class BotonEtiqueta extends JFrame implements ActionListener{
 
  private JButton boton1, boton2, boton3;
  private JLabel label1;

  public BotonEtiqueta(){
    setLayout(null);
    
    boton1 = new JButton("1");
    boton1.setBounds(10,100,90,30);
    add(boton1);
    boton1.addActionListener(this);

    boton2 = new JButton("2");
    boton2.setBounds(110,100,90,30);
    add(boton2);
    boton2.addActionListener(this);
    
    boton3 = new JButton("3");
    boton3.setBounds(210,100,90,30);
    add(boton3);
    boton3.addActionListener(this);

    label1 = new JLabel("En espera...");
    label1.setBounds(10,10,300,30);
    add(label1);    
  }

  public void actionPerformed(ActionEvent reaccion){
    
    if(reaccion.getSource() == boton1 ){
      label1.setText("Oprimiste el botón 1");
    }
    if(reaccion.getSource() == boton2 ){
      label1.setText("Oprimiste el botón 2");
    }
    if(reaccion.getSource() == boton3 ){
      label1.setText("Oprimiste el botón 3");
    }
  }  
  
  public static void main(String args []){
   
   BotonEtiqueta interfaz = new BotonEtiqueta();
   interfaz.setBounds(0,0,350,200);
   interfaz.setVisible(true);
   interfaz.setResizable(false);
   interfaz.setLocationRelativeTo(null);
 }
}