import javax.swing.*;

public class BarraDesplazamiento extends JFrame{

  private JTextField  textfield1 ;
  private JTextArea   textarea1  ;
  private JScrollPane scrollpane1;

  public BarraDesplazamiento(){
    setLayout(null);

    textfield1 = new JTextField();
    textfield1.setBounds(10,10,200,30);
    add(textfield1);

    textarea1 = new JTextArea();
    scrollpane1 = new JScrollPane(textarea1);
    scrollpane1.setBounds(10,50,400,300);
    add(scrollpane1);   
  }

  public static void main(String args []){

   BarraDesplazamiento interfaz = new BarraDesplazamiento();
   interfaz.setBounds(0,0,540,400);
   interfaz.setVisible(true);
   interfaz.setResizable(false);  
   interfaz.setLocationRelativeTo(null);
 }
}