import javax.swing.*;
import javax.swing.event.*;

public class SeleccionUnaOpcion extends JFrame implements ChangeListener{
  
  private JRadioButton radio1, radio2, radio3;
  private ButtonGroup group;

  public SeleccionUnaOpcion(){
    setLayout(null);
    group = new ButtonGroup();
    radio1 = new JRadioButton("640*480");
    radio1.setBounds(10,20,100,30);
    add(radio1);
    radio1.addChangeListener(this); 
    group.add(radio1);
    
    radio2 = new JRadioButton("800*600");
    radio2.setBounds(10,70,100,30);
    add(radio2);
    radio2.addChangeListener(this); 
    group.add(radio2);
    
    radio3 = new JRadioButton("1024*768");
    radio3.setBounds(10,120,100,30);
    add(radio3);
    radio3.addChangeListener(this); 
    group.add(radio3);
  }

  public void stateChanged(ChangeEvent e){
    if(radio1.isSelected()){
      setSize(640,480); 
    }

    if(radio2.isSelected()){
      setSize(800,600);
    }
    if(radio3.isSelected()){
      setSize(1024,768);
    }
  }

  public static void main(String args[]){
   SeleccionUnaOpcion interfaz = new SeleccionUnaOpcion();
   interfaz.setBounds(0,0,350,230);
   interfaz.setVisible(true);
   interfaz.setResizable(false);
 }
}