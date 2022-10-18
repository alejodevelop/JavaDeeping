import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Licencia extends JFrame implements ActionListener, ChangeListener{
  
  private JLabel label1, label2;
  private JTextArea textarea1;
  private JScrollPane scrollpane1;
  private JButton button1, button2;
  private JCheckBox checkbox1;  
  String nombre = "";

  public Licencia(){
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("Licencia de uso");
    setIconImage(new ImageIcon(getClass().getResource("images/miniatura-reducida.png")).getImage());
    Bienvenida ventanaBienvenida = new Bienvenida();
    nombre = ventanaBienvenida.texto;
    

    label1 = new JLabel("Términos y condiciones");
    label1.setBounds(215,5,200,30);
    label1.setFont(new Font("Andale Mono", 1,14));
    label1.setForeground(new Color(0,0,0));
    add(label1);

    textarea1 = new JTextArea();
    textarea1.setEditable(false);
    textarea1.setFont(new Font("Andale Mono", 0, 9));
    textarea1.setText("\n\n          TÉRMINOS Y CONDICIONES" +
                      "\n\n   Este programa es netamente gratuito, su comercialización esta prohibida" +
                      "\n\n   La marca, logos, imagenes y materiales usados para su creación son propiedad intelectual del programador" +
                      "\n\n   Esta es una practica para el desarrollo de programas mucho mas avanzados en la posteridad" +
                      "\n\n   Derechos del producto pertenecientes a Alejandro Cabarcas Perdomo, Año 2019" +
                      "\n\n   Oprima en la casilla de acepto y depués en la de continuar para pasar a la siguiente ventana"
                                                              );
    scrollpane1 = new JScrollPane(textarea1);
    scrollpane1.setBounds(10,40,575,200);
    add(scrollpane1);
 
    checkbox1 = new JCheckBox("Yo " + nombre + " acepto");
    checkbox1.setBounds(10,240,203,30);
    checkbox1.addChangeListener(this);   
    add(checkbox1);

    button1 = new JButton("Yo Acepto");
    button1.setBounds(10,290,100,30);
    button1.addActionListener(this);   
    button1.setEnabled(false);
    add(button1);
    

    button2 = new JButton("No Acepto");
    button2.setBounds(120,290,100,30);
    button2.addActionListener(this);
    button2.setEnabled(true);   
    add(button2);

    ImageIcon image = new ImageIcon("images/loguito.png"); 
    label2 = new JLabel(image);  
    label2.setBounds(155,138,500,300);
    add(label2);
  }

  public void stateChanged(ChangeEvent e){
    if(checkbox1.isSelected() == true){
      button1.setEnabled(true);
      button2.setEnabled(false);
    }  else{
      button1.setEnabled(false);
      button2.setEnabled(true);
    }

  }

  public void actionPerformed(ActionEvent e){
    if(e.getSource() == button1){
      Principal interfazPrincipal = new Principal();
      interfazPrincipal.setBounds(0,0,640,535);
      interfazPrincipal.setVisible(true);
      interfazPrincipal.setResizable(false);
      interfazPrincipal.setLocationRelativeTo(null);
      this.setVisible(false);

    }  else if(e.getSource() == button2){
      Bienvenida ventanabienvenida = new Bienvenida();
      ventanabienvenida.setBounds(0,0,350,600);
      ventanabienvenida.setVisible(true);
      ventanabienvenida.setResizable(false);
      ventanabienvenida.setLocationRelativeTo(null);
      this.setVisible(false);
    }
  }

  public static void main(String args[]){
   
   Licencia interfazLicencia = new Licencia();
   interfazLicencia.setBounds(0,0,600,360);
   interfazLicencia.setVisible(true);
   interfazLicencia.setResizable(false);
   interfazLicencia.setLocationRelativeTo(null);
 }
}