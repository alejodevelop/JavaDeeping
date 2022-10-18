import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class BotonTerminosCondiciones extends JFrame implements ActionListener, ChangeListener{
  
  private JLabel label1;
  private JCheckBox checkbox1; 
  private JButton button1;

  public BotonTerminosCondiciones(){
    setLayout(null);
    label1 = new JLabel("Aceptar terminos y condiciones ");
    label1.setBounds(10,10,400,30);
    add(label1);

    checkbox1 = new JCheckBox("Acepto");
    checkbox1.setBounds(10,50,100,30);
    add(checkbox1);
    checkbox1.addChangeListener(this);
    

    button1 = new JButton("Continuar");
    button1.setBounds(10,100,100,30);
    add(button1);
    button1.addActionListener(this);
    button1.setEnabled(false);
  }

  public void stateChanged(ChangeEvent e){
    if(checkbox1.isSelected() == true){
      button1.setEnabled(true);
    } else{
      button1.setEnabled(false);
    }
  } 

  public void actionPerformed(ActionEvent e){
    if(e.getSource() == button1){
      System.exit(0);
    }
  }

  public static void main(String args[]){

   BotonTerminosCondiciones interfaz = new BotonTerminosCondiciones();
   interfaz.setBounds(0,0,350,200);
   interfaz.setVisible(true);
   interfaz.setResizable(false);
   interfaz.setLocationRelativeTo(null);
 }
}