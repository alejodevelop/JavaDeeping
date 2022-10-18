import javax.swing.*;
import java.awt.event.*;

public class Enlazando extends JFrame implements ActionListener{

  private JTextField textfield1;
  private JScrollPane scrollpane1;
  private JTextArea textarea1;
  private JButton button1;
  
  String text = ""; 

  public Enlazando(){
    setLayout(null);
    textfield1 = new JTextField();
    textfield1.setBounds(10,10,200,30);
    add(textfield1);

    button1 = new JButton("Agregar");
    button1.setBounds(250,10,100,30);
    add(button1);
    button1.addActionListener(this);

    textarea1 = new JTextArea();
    scrollpane1 = new JScrollPane(textarea1);    
    scrollpane1.setBounds(10,50,400,300);
    add(scrollpane1);
  }

  public void actionPerformed(ActionEvent e){
    if(e.getSource() == button1){
    text += textfield1.getText() + "\n";
    textarea1.setText(text);
    textfield1.setText("");
    }
  }

  public static void main(String args []){

   Enlazando interfaz = new Enlazando();
   interfaz.setBounds(0,0,540,400);
   interfaz.setVisible(true);
   interfaz.setResizable(false);
   interfaz.setLocationRelativeTo(null);
 }
}



