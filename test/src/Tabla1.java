import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Tabla1 extends JFrame implements ActionListener{

  private JLabel PreguntaP1, PreguntaP2, Imagen;
  private JButton Afirmacion, Negacion;
  public static int Decision1 = 0;
    
  public Tabla1(){
  
      Bienvenido Texto = new Bienvenido();
    int Comprobacion = 0;
    Comprobacion = Texto.ComprobacionIdioma;

    if(Comprobacion == 1){
      PreguntaP1.setText("dasfsafasfass");
    }  

    if(Comprobacion == 2){
      PreguntaP1.setText("djakdjskjdkas");
    }
  setLayout(null);
  setDefaultCloseOperation(EXIT_ON_CLOSE);   
  getContentPane().setBackground(new Color(189,195,199));  
  

  PreguntaP1 = new JLabel("¿El número que pensaste" );
  PreguntaP1.setBounds(80,5,300,90 );
  PreguntaP1.setFont(new Font("Andale Mono", 3, 18));
  add(PreguntaP1);

  PreguntaP2 = new JLabel(" se encuentra aquí ?" );
  PreguntaP2.setBounds(110,25,300,90 );
  PreguntaP2.setFont(new Font("Andale Mono", 3, 18));
  add(PreguntaP2);

  ImageIcon image = new ImageIcon("images/Ficha1.png");
  Imagen = new JLabel(image);
  Imagen.setBounds(40,180,315,183);
  add(Imagen);

    Afirmacion = new JButton ("Si");
    Afirmacion.setBounds(80,410,60,40);   
    Afirmacion.addActionListener(this);
    add(Afirmacion);   

    Negacion = new JButton ("No");
    Negacion.setBounds(250,410,60,40);
    Negacion.addActionListener(this);
    add(Negacion);
  }

  public void actionPerformed(ActionEvent e){ 
    
  } 
  public static void main(String args[]){
  
   Tabla1 Ventana1 = new Tabla1();
   Ventana1.setBounds(0,0,400,550);  
   Ventana1.setVisible(true);
   Ventana1.setResizable(false);
   Ventana1.setLocationRelativeTo(null);
 }
}