/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

/**
 *
 * @author alejo
 */
public class GUI extends JFrame {

    // inicializacion componentes
    Consultar panelConsultar;
    Registrar panelRegistrar;
    JTabbedPane contenedorPaneles;

    public GUI() {

        setTitle("Productos");
        setSize(600, 500);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        iniciarComponentes();

    }

    private void iniciarComponentes() {

        contenedorPaneles = new JTabbedPane();
        panelConsultar = new Consultar();
        panelRegistrar = new Registrar();

        contenedorPaneles.add("Registrar", panelRegistrar);
        contenedorPaneles.add("Consultar", panelConsultar);

        add(contenedorPaneles);

    }

}
