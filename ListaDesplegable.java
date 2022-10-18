import javax.swing.*;
import java.awt.event.*;

public class ListaDesplegable extends JFrame implements ItemListener{
  
  private JComboBox combobox1;

  public ListaDesplegable(){
    setLayout(null);
    combobox1 = new JComboBox();
    combobox1.setBounds(10,10,80,20);
    add(combobox1);

    combobox1.addItem("rojo");
    combobox1.addItem("verde");
    combobox1.addItem("azul");
    combobox1.addItem("amarillo");
    combobox1.addItem("negro");

    combobox1.addItemListener(this);
  }

  public void itemStateChanged(ItemEvent e){
   if(e.getSource() == combobox1){
     String selection = combobox1.getSelectedItem().toString();
     setTitle(selection);
   }
  }
   
  public static void main(String args []){

   ListaDesplegable interfaz = new ListaDesplegable();
   interfaz.setBounds(0,0,200,150);
   interfaz.setVisible(true);
   interfaz.setResizable(false);
   interfaz.setLocationRelativeTo(null);
 }
}