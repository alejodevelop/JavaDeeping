/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JButton;

/**
 *
 * @author alejo
 */
public class Registrar extends JPanel implements ActionListener {

    JLabel lbNombre, lbCantidad, lbPrecio, lbCategoria;
    JTextField txfNombre, txfCantidad, txfPrecio;
    JComboBox cbCategoria;
    JButton btGuardar;

    public Registrar() {

        setSize(600, 500);
        setLayout(null);
        setVisible(true);
        iniciarComponentes();
    }

    private void iniciarComponentes() {

        // labels
        lbNombre = new JLabel();
        lbCantidad = new JLabel();
        lbPrecio = new JLabel();
        lbCategoria = new JLabel();

        lbNombre.setText("Nombre");
        lbNombre.setFont(new Font("Arial", 0, 12));
        lbNombre.setBounds(80, 25, 50, 25);

        lbCantidad.setText("Cantidad");
        lbCantidad.setFont(new Font("Arial", 0, 12));
        lbCantidad.setBounds(80, 55, 50, 25);

        lbPrecio.setText("Precio");
        lbPrecio.setFont(new Font("Arial", 0, 12));
        lbPrecio.setBounds(80, 85, 50, 25);

        lbCategoria.setText("Categoria");
        lbCategoria.setFont(new Font("Arial", 0, 12));
        lbCategoria.setBounds(80, 115, 50, 25);

        add(lbNombre);
        add(lbCantidad);
        add(lbPrecio);
        add(lbCategoria);

        // text fields
        txfNombre = new JTextField();
        txfCantidad = new JTextField();
        txfPrecio = new JTextField();

        txfNombre.setBounds(160, 25, 200, 25);

        txfCantidad.setBounds(160, 55, 100, 25);

        txfPrecio.setBounds(160, 85, 100, 25);

        add(txfNombre);
        add(txfCantidad);
        add(txfPrecio);

        // combo box
        cbCategoria = new JComboBox();

        cbCategoria.setBounds(160, 115, 100, 25);
        cbCategoria.addItem("ASEO");
        cbCategoria.addItem("VIVERES");

        add(cbCategoria);

        // buttons
        btGuardar = new JButton();

        btGuardar.setBounds(470, 380, 85, 25);
        btGuardar.setText("Guardar");
        btGuardar.addActionListener(this);

        add(btGuardar);
    }

    // handle events
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btGuardar) {

        }
    }

}
