import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Bienvenida extends JFrame implements ActionListener{

  private JLabel label1, label2, label3, label4;
  private JTextField textfield1;
  private JButton button1;
  public static String texto = "" ;
     
  public Bienvenida(){
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("Bienvenido");
    getContentPane().setBackground(new Color(0,255,255));
    setIconImage(new ImageIcon(getClass().getResource("images/miniatura-reducida.png")).getImage());

    ImageIcon image = new ImageIcon("images/gtsd.png");
    label1 = new JLabel(image);
    label1.setBounds(25,40,400,250);
    add(label1);

    label2 = new JLabel("Sistema de Control Vacacional");
    label2.setBounds(35,290,300,30);
    label2.setFont(new Font("Andale Mono", 3, 18));
    label2.setForeground(new Color(255,255,255));
    add(label2);

    label3 = new JLabel("Ingrese su nombre");
    label3.setBounds(45,342,200,30);
    label3.setFont(new Font("Andale Mono", 1, 12));
    label3.setForeground(new Color(255,255,255));
    add(label3);

    label4 = new JLabel("®2019 GameTec Studios");
    label4.setBounds(105,505,300,30);
    label4.setFont(new Font("Andale Mono", 1, 12));
    label4.setForeground(new Color(255,255,255));
    add(label4);

    textfield1 = new JTextField ();
    textfield1.setBounds(45,370,255,25);
    textfield1.setBackground(new Color(224,224,224));
    textfield1.setFont(new Font("Andale Mono", 1, 14));
    textfield1.setForeground(new Color(70,70,70));
    add(textfield1);

    button1 = new JButton ("Siguiente");
    button1.setBounds(115,410,120,30);
    button1.setBackground(new Color(255,255,255));
    button1.setFont(new Font("Andale Mono", 1, 14));
    button1.setForeground(new Color(0,255,255));
    button1.addActionListener(this);
    add(button1);   
  }
  
  public void actionPerformed(ActionEvent e){
    if(e.getSource() == button1){
      texto = textfield1.getText().trim();
      if(texto.equals("")){
        JOptionPane.showMessageDialog(null, "Ingresa tu nombre para continuar");
      } else {
        Licencia interfazLicencia = new Licencia();
        interfazLicencia.setBounds(0,0,600,360);
        interfazLicencia.setVisible(true);
        interfazLicencia.setResizable(false);
        interfazLicencia.setLocationRelativeTo(null);
        this.setVisible(false);
      }
    }
  }

  public static void main(String args []){
  
   Bienvenida ventanabienvenida = new Bienvenida();
   ventanabienvenida.setBounds(0,0,350,600);
   ventanabienvenida.setVisible(true);
   ventanabienvenida.setResizable(false);
   ventanabienvenida.setLocationRelativeTo(null);
 }
}