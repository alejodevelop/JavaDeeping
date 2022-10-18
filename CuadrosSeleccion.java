import javax.swing.*;
import javax.swing.event.*;

public class CuadrosSeleccion extends JFrame implements ChangeListener{

  private JCheckBox checkbox1, checkbox2, checkbox3;


  public CuadrosSeleccion(){
    setLayout(null);
    checkbox1 = new JCheckBox("Ingl�s");
    checkbox1.setBounds(10,10,150,30);
    checkbox1.addChangeListener(this);
    add(checkbox1);

    checkbox2 = new JCheckBox("Franc�s");
    checkbox2.setBounds(10,50,150,30);
    checkbox2.addChangeListener(this);
    add(checkbox2);

    checkbox3 = new JCheckBox("Alem�n");
    checkbox3.setBounds(10,90,150,30);
    checkbox3.addChangeListener(this);
    add(checkbox3);
  }

  public void stateChanged(ChangeEvent e){
    String texto ="";
    
    if(checkbox1.isSelected() == true){
      texto = texto + " Ingl�s";
      setTitle(texto);
    }
    if(checkbox2.isSelected() == true){
      texto = texto + " Franc�s";
      setTitle(texto);
    }
    if(checkbox3.isSelected() == true){
      texto = texto + " Alem�n";
      setTitle(texto);
    }
  }

  public static void main(String args[]){
   
   CuadrosSeleccion interfaz = new CuadrosSeleccion();
   interfaz.setBounds(0,0,350,200);
   interfaz.setVisible(true);
   interfaz.setResizable(false);
   interfaz.setLocationRelativeTo(null);
 }
}