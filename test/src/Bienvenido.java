import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

  public class Bienvenido extends JFrame implements ActionListener{

   private JLabel   TextoFuncionalidad1, TextoFuncionalidad2, DatosCreador;       
   private JButton  ButtonC;   
   private JMenuBar mb;     
   private JMenu Idioma, Autor;    
   private JMenuItem Spanish, English, Datos; 
   public static int ComprobacionIdioma; 
    

  public Bienvenido(){	
    
     setLayout(null);
     setDefaultCloseOperation(EXIT_ON_CLOSE);
     Container Fondo = this.getContentPane();
     Fondo.setBackground(new Color(195,155,211));

     mb = new JMenuBar();
     setJMenuBar(mb);

     Idioma = new JMenu("Idioma");
     mb.add(Idioma);

     Spanish = new JMenuItem("Español");
     Idioma.add(Spanish);
     Spanish.addActionListener(this);

     English = new JMenuItem("English");
     Idioma.add(English);
     English.addActionListener(this);    

     Autor = new JMenu("Creador");
     mb.add(Autor);

     Datos = new JMenuItem("Datos");
     Autor.add(Datos);
     Datos.addActionListener(this);

     TextoFuncionalidad1 = new JLabel("!Bienvenido!, Piensa un número");
     TextoFuncionalidad1.setBounds(70,10,300,400);
     TextoFuncionalidad1.setFont(new Font("Andale Mono", 3, 18));
     add(TextoFuncionalidad1);
  
     TextoFuncionalidad2 = new JLabel("del 0 al 51, pero no lo digas!");
     TextoFuncionalidad2.setBounds(85,30,300,400);
     TextoFuncionalidad2.setFont(new Font("Andale Mono", 3, 18));
     add(TextoFuncionalidad2);

     ButtonC = new JButton("Continuar");
     ButtonC.setBounds(120,400,150,40);
     ButtonC.addActionListener(this);
     add(ButtonC);
     
   }   

  public void actionPerformed(ActionEvent e){

    if(e.getSource() == ButtonC){
      Tabla1 Ventana1 = new Tabla1();
      Ventana1.setBounds(0,0,400,550);  
      Ventana1.setVisible(true);
      Ventana1.setResizable(false);
      Ventana1.setLocationRelativeTo(null);
      this.setVisible(false);

    }

    if(e.getSource() == Datos){

      JOptionPane.showMessageDialog(null," Desarrollado por Alejandro Cabarcas Perdomo \n" +   
                                         "          GametecStudios, disfrutalo :3 ");

    }

    if(e.getSource() == Spanish){

      ComprobacionIdioma = 1;
      
      TextoFuncionalidad1.setText("!Bienvenido!, Piensa un número");
      TextoFuncionalidad2.setText("del 0 al 51, pero no lo digas!");
      Datos.setText   ("Datos");
      ButtonC.setText ("Continuar");
      Idioma.setText  ("Idioma");
      Autor.setText   ("Creador");
      Spanish.setText ("Español");
      English.setText ("Inglés");   

    }

    if(e.getSource() == English){

      ComprobacionIdioma = 2;
   
      TextoFuncionalidad1.setText("!Welcome!, think a number");
      TextoFuncionalidad2.setText("from 0 at 59 but dont say it");
      Datos.setText("Information");
      ButtonC.setText ("Continue");
      Idioma.setText  ("Language");
      Autor.setText   ("Designer");
      Spanish.setText ("Spanish");
      English.setText ("English");
    }
  }

   public static void main(String args[]){
 
   Bienvenido VentanaBienvenida = new Bienvenido();
   VentanaBienvenida.setBounds(0,0,400,550);  
   VentanaBienvenida.setVisible(true);
   VentanaBienvenida.setResizable(false);
   VentanaBienvenida.setLocationRelativeTo(null);
 }
}