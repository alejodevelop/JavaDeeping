import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Principal extends JFrame implements ActionListener{
  
  private JMenuBar    mb;
   
  private JMenu       menuOpciones, menuCalcular, menuAcercaDe, menuColorDeFondo;
  
  private JMenuItem   miCalculo, miAguaMarina, miNegro, miMorado, miElCreador, miSalir, miNuevo;
  
  private JLabel      labelLogo, labelBienvenido, labelNombreBienvenido, labelTitle, labelNombre, labelAPaterno, labelAMaterno,
                      labelDepartamento, labelAntiguedad, labelResultado, labelFooter;
  
  private JTextField  txtNombreTrabajador, txtAPaternoTrabajador, txtAMaternoTrabajador;

  private JComboBox   comboDepartamento, comboAntiguedad;
  
  private JScrollPane scrollpane1;
 
  private JTextArea   textarea1;

  String nombreAdministrador = "";

  public Principal(){
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("Pantalla principal");
    getContentPane().setBackground(new Color(0,255,255));
    setIconImage(new ImageIcon(getClass().getResource("images/miniatura-reducida.png")).getImage());
    Bienvenida ventanaBienvenida = new Bienvenida();
    nombreAdministrador = ventanaBienvenida.texto;
    
    mb = new JMenuBar();
    mb.setBackground(new Color(210,210,210));
    setJMenuBar(mb);

    menuOpciones = new JMenu("Opciones");
    menuOpciones.setBackground(new Color(210,210,210));
    menuOpciones.setFont(new Font("Andale Mono", 1, 14));
    menuOpciones.setForeground(new Color(0,0,0));
    mb.add(menuOpciones);

    menuCalcular = new JMenu("Calcular");
    menuCalcular.setBackground(new Color(210,210,210));
    menuCalcular.setFont(new Font("Andale Mono", 1, 14));
    menuCalcular.setForeground(new Color(0,0,0));
    mb.add(menuCalcular);

    menuAcercaDe = new JMenu("Acerca de");
    menuAcercaDe.setBackground(new Color(210,210,210));
    menuAcercaDe.setFont(new Font("Andale Mono", 1, 14));
    menuAcercaDe.setForeground(new Color(0,0,0));
    mb.add(menuAcercaDe);

    menuColorDeFondo = new JMenu("Color de fondo");
    menuColorDeFondo.setFont(new Font("Andale Mono", 1, 14));
    menuColorDeFondo.setForeground(new Color(0,0,0));
    menuOpciones.add(menuColorDeFondo);

    miCalculo = new JMenuItem("Vacaciones");
    miCalculo.setFont(new Font("Andale Mono", 1, 14));
    miCalculo.setForeground(new Color(0,0,0));
    menuCalcular.add(miCalculo);
    miCalculo.addActionListener(this);
 
    miAguaMarina = new JMenuItem("Agua marina");
    miAguaMarina.setFont(new Font("Andale Mono", 1, 14));
    miAguaMarina.setForeground(new Color(0,0,0));
    menuColorDeFondo.add(miAguaMarina);
    miAguaMarina.addActionListener(this);

    miNegro = new JMenuItem("Negro");
    miNegro.setFont(new Font("Andale Mono", 1, 14));
    miNegro.setForeground(new Color(0,0,0));
    menuColorDeFondo.add(miNegro);
    miNegro.addActionListener(this);

    miMorado = new JMenuItem("Morado");
    miMorado.setFont(new Font("Andale Mono", 1, 14));
    miMorado.setForeground(new Color(0,0,0));
    menuColorDeFondo.add(miMorado);
    miMorado.addActionListener(this);

    miNuevo = new JMenuItem("Nuevo");
    miNuevo.setFont(new Font("Andale Mono", 1, 14));
    miNuevo.setForeground(new Color(0,0,0));
    menuOpciones.add(miNuevo);
    miNuevo.addActionListener(this);

    miElCreador = new JMenuItem("El creador");
    miElCreador.setFont(new Font("Andale Mono", 1, 14));
    miElCreador.setForeground(new Color(0,0,0));
    menuAcercaDe.add(miElCreador);
    miElCreador.addActionListener(this);

    miSalir = new JMenuItem("Salir");
    miSalir.setFont(new Font("Andale Mono", 1, 14));
    miSalir.setForeground(new Color(0,0,0));
    menuOpciones.add(miSalir);
    miSalir.addActionListener(this);

    ImageIcon imagen = new ImageIcon("images/loguito.png");
    labelLogo = new JLabel(imagen);
    labelLogo.setBounds(5,5,400,100);
    add(labelLogo);

    labelBienvenido = new JLabel("Bienvenido ");
    labelBienvenido.setBounds(400,25,300,50);
    labelBienvenido.setFont(new Font("Andale Mono", 1, 32));
    labelBienvenido.setForeground(new Color(255,255,255)); 
    add(labelBienvenido);

    labelNombreBienvenido = new JLabel(nombreAdministrador);
    labelNombreBienvenido.setBounds(410,60,300,50);
    labelNombreBienvenido.setFont(new Font("Andale Mono", 1, 32));
    labelNombreBienvenido.setForeground(new Color(255,255,255)); 
    add(labelNombreBienvenido);

    labelTitle = new JLabel("Datos del trabajador para el cálculo de vacaciones");
    labelTitle.setBounds(45,140,900,25);
    labelTitle.setFont(new Font("Andale Mono", 0, 24));
    labelTitle.setForeground(new Color(255,255,255)); 
    add(labelTitle);

    labelNombre = new JLabel("Nombre Completo");
    labelNombre.setBounds(25,188,180,25);
    labelNombre.setFont(new Font("Andale Mono", 1, 12));
    labelNombre.setForeground(new Color(255,255,255)); 
    add(labelNombre);

    txtNombreTrabajador = new JTextField();
    txtNombreTrabajador.setBounds(25,213,150,25);
    txtNombreTrabajador.setBackground(new java.awt.Color(224,224,224));  
    txtNombreTrabajador.setFont(new java.awt.Font("Andale Mono", 1, 14));
    txtNombreTrabajador.setForeground(new java.awt.Color(0,0,0));
    add(txtNombreTrabajador);

    labelAPaterno = new JLabel("Apellido Paterno");
    labelAPaterno.setBounds(25,248,180,25);
    labelAPaterno.setFont(new Font("Andale Mono", 1, 12));
    labelAPaterno.setForeground(new Color(255,255,255)); 
    add(labelAPaterno);

    txtAPaternoTrabajador = new JTextField();
    txtAPaternoTrabajador.setBounds(25,273,150,25);
    txtAPaternoTrabajador.setBackground(new java.awt.Color(224,224,224));  
    txtAPaternoTrabajador.setFont(new java.awt.Font("Andale Mono", 1, 14));
    txtAPaternoTrabajador.setForeground(new java.awt.Color(0,0,0));
    add(txtAPaternoTrabajador);

    labelAMaterno = new JLabel("Apellido Materno");
    labelAMaterno.setBounds(25,308,180,25);
    labelAMaterno.setFont(new Font("Andale Mono", 1, 12));
    labelAMaterno.setForeground(new Color(255,255,255)); 
    add(labelAMaterno);

    txtAMaternoTrabajador = new JTextField();
    txtAMaternoTrabajador.setBounds(25,334,150,25);
    txtAMaternoTrabajador.setBackground(new java.awt.Color(224,224,224));  
    txtAMaternoTrabajador.setFont(new java.awt.Font("Andale Mono", 1, 14));
    txtAMaternoTrabajador.setForeground(new java.awt.Color(0,0,0));
    add(txtAMaternoTrabajador);
    
    labelDepartamento = new JLabel("Selecciona el Departamento");
    labelDepartamento.setBounds(220,188,180,25);
    labelDepartamento.setFont(new Font("Andale Mono", 1, 12));
    labelDepartamento.setForeground(new Color(255,255,255)); 
    add(labelDepartamento);

    comboDepartamento = new JComboBox();
    comboDepartamento.setBounds(220,213,220,25);
    comboDepartamento.setBackground(new java.awt.Color(224,224,224));
    comboDepartamento.setFont(new java.awt.Font("Andale Mono", 1, 14));
    comboDepartamento.setForeground(new java.awt.Color(0,0,0));
    add(comboDepartamento);
    comboDepartamento.addItem("");
    comboDepartamento.addItem("Atención al cliente");
    comboDepartamento.addItem("Departamento de Logística");
    comboDepartamento.addItem("Departamento de Gerencia");
    
    labelAntiguedad = new JLabel("Antiguedad");
    labelAntiguedad.setBounds(220,248,180,25);
    labelAntiguedad.setFont(new Font("Andale Mono", 1, 12));
    labelAntiguedad.setForeground(new Color(255,255,255)); 
    add(labelAntiguedad);

    comboAntiguedad = new JComboBox();
    comboAntiguedad.setBounds(220,273,220,25);
    comboAntiguedad.setBackground(new java.awt.Color(224,224,224));
    comboAntiguedad.setFont(new java.awt.Font("Andale Mono", 1, 14));
    comboAntiguedad.setForeground(new java.awt.Color(0,0,0));
    add(comboAntiguedad);
    comboAntiguedad.addItem("");
    comboAntiguedad.addItem("1 año de servicio");
    comboAntiguedad.addItem("2 a 6 años de servicio");
    comboAntiguedad.addItem("7 años  o más de servicio");
    
    labelResultado = new JLabel("Resultado del cálculo");
    labelResultado.setBounds(220,307,180,25);
    labelResultado.setFont(new Font("Andale Mono", 1, 11));
    labelResultado.setForeground(new Color(255,255,255)); 
    add(labelResultado);
    
    textarea1 = new JTextArea();
    textarea1.setEditable(false);
    textarea1.setBackground(new Color(224,224,224));  
    textarea1.setFont(new Font("Andale Mono", 1, 11));
    textarea1.setForeground(new java.awt.Color(0,0,0));
    textarea1.setText("\n Aquí aparece el resultado del cálculo de las vacaciones");
    scrollpane1 = new JScrollPane(textarea1);
    scrollpane1.setBounds(220,333,385,90);
    add(scrollpane1);

    labelFooter = new JLabel("®2019 GameTec Studios | all rights reserved");
    labelFooter.setBounds(135,445,500,30);
    labelFooter.setFont(new Font("Andale Mono", 1, 12));
    labelFooter.setForeground(new Color(255,255,255)); 
    add(labelFooter); 
  }

  public void actionPerformed(ActionEvent e){
    if(e.getSource() == miCalculo){
      String nombreTrabajador = txtNombreTrabajador.getText();
      String AP = txtAPaternoTrabajador.getText();
      String AM = txtAMaternoTrabajador.getText();
      String Departamento = comboDepartamento.getSelectedItem().toString();
      String Antiguedad = comboAntiguedad.getSelectedItem().toString();

      if(nombreTrabajador.equals("") || AP.equals("") || AM.equals("") ||
      Departamento.equals("") || Antiguedad.equals("")){
    
      JOptionPane.showMessageDialog(null, "Debes llenar todo los campos ");

      }  else  {
        if(Departamento.equals("Atención al cliente")){
         
          if(Antiguedad.equals("1 año de servicio")){
            textarea1.setText("\n el trabajador " + nombreTrabajador + " " + AP + " " + AM +
                              "\n quien labora en " + Departamento + " con " + Antiguedad +
                              "\n recibe 6 días de vacaciones."
                                 );
          }
          if(Antiguedad.equals("2 a 6 años de servicio")){
            textarea1.setText("\n el trabajador " + nombreTrabajador + " " + AP + " " + AM +
                              "\n quien labora en " + Departamento + " con " + Antiguedad +
                              "\n recibe 14 días de vacaciones."
                                 );
          }
          if(Antiguedad.equals("7 años  o más de servicio")){
            textarea1.setText("\n el trabajador " + nombreTrabajador + " " + AP + " " + AM +
                              "\n quien labora en " + Departamento + " con " + Antiguedad +
                              "\n recibe 20 días de vacaciones."
                                 );
          }
        }

        if(Departamento.equals("Departamento de Logística")){
           
          if(Antiguedad.equals("1 año de servicio")){
            textarea1.setText("\n el trabajador " + nombreTrabajador + " " + AP + " " + AM +
                              "\n quien labora en " + Departamento + " con " + Antiguedad +
                              "\n recibe 7 días de vacaciones."
                                 );
          }
          if(Antiguedad.equals("2 a 6 años de servicio")){
            textarea1.setText("\n el trabajador " + nombreTrabajador + " " + AP + " " + AM +
                              "\n quien labora en " + Departamento + " con " + Antiguedad +
                              "\n recibe 15 días de vacaciones."
                                 );
          }
          if(Antiguedad.equals("7 años  o más de servicio")){
            textarea1.setText("\n el trabajador " + nombreTrabajador + " " + AP + " " + AM +
                              "\n quien labora en " + Departamento + " con " + Antiguedad +
                              "\n recibe 22 días de vacaciones."
                                 );
          }
        } 
       
         if(Departamento.equals("Departamento de Gerencia")){
         
           if(Antiguedad.equals("1 año de servicio")){
            textarea1.setText("\n el trabajador " + nombreTrabajador + " " + AP + " " + AM +
                              "\n quien labora en " + Departamento + " con " + Antiguedad +
                              "\n recibe 10 días de vacaciones."
                                 );
           }
           if(Antiguedad.equals("2 a 6 años de servicio")){
            textarea1.setText("\n el trabajador " + nombreTrabajador + " " + AP + " " + AM +
                              "\n quien labora en " + Departamento + " con " + Antiguedad +
                              "\n recibe 20 días de vacaciones."
                                 );
           }
           if(Antiguedad.equals("7 años  o más de servicio")){
            textarea1.setText("\n el trabajador " + nombreTrabajador + " " + AP + " " + AM +
                              "\n quien labora en " + Departamento + " con " + Antiguedad +
                              "\n recibe 30 días de vacaciones."
                                 );

           }
         }
    }
  } 
           
   
    if(e.getSource() == miAguaMarina){
      getContentPane().setBackground(new Color(0,255,255));
    }
    if(e.getSource() == miNegro){
      getContentPane().setBackground(new Color(0,0,0));
    }
    if(e.getSource() == miMorado){
      getContentPane().setBackground(new Color(51,0,51));
    }
    if(e.getSource() == miNuevo){
      
      txtNombreTrabajador.setText("");
      txtAPaternoTrabajador.setText("");
      txtAMaternoTrabajador.setText("");
      comboDepartamento.setSelectedIndex(0);
      comboAntiguedad.setSelectedIndex(0);
      textarea1.setText("\n   Aquí aparece el resultado del cálculo de las vacaciones");
    }
    if(e.getSource() == miSalir){
        
      Bienvenida ventanabienvenida = new Bienvenida();
      ventanabienvenida.setBounds(0,0,350,600);
      ventanabienvenida.setVisible(true);
      ventanabienvenida.setResizable(false);
      ventanabienvenida.setLocationRelativeTo(null);
      this.setVisible(false);

    }
    if(e.getSource() == miElCreador){
      JOptionPane.showMessageDialog(null, "Desarrollado por Alejandro Cabarcas Perdomo ");
  }
 }
  
   public static void main(String args[]){
  
   Principal interfazPrincipal = new Principal();
   interfazPrincipal.setBounds(0,0,640,535);
   interfazPrincipal.setVisible(true);
   interfazPrincipal.setResizable(false);
   interfazPrincipal.setLocationRelativeTo(null);  
 
 }
}