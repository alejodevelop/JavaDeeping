/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.BorderLayout;
import javax.swing.JPanel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.ScrollPaneLayout;

/**
 *
 * @author alejo
 */
public class Consultar extends JPanel implements ActionListener {

    JTable tabla;
    JScrollPane scroll;
    JLabel lbId, lbNombre, lbCantidad, lbPrecio, lbCategoria;
    JComboBox cbCategoria;
    JButton btEliminar, btConsultar, btActualizar;
    JTextField txId, txNombre, txCantidad, txPrecio;

    public Consultar() {
        setSize(600, 500);
        setLayout(null);
        setVisible(true);
        iniciarComponentes();
    }

    private void iniciarComponentes() {

        // table with scroll
        String[] nombreColumnas = {"Id", "Nombre", "Categoria", "Cantidad", "Precio"};
        Object[][] datosFilas = {
            {1, "Jabon", "ASEO", 100, 20000.0},
            {2, "Desodorante", "ASEO", 50, 15000.0}
        };

        tabla = new JTable(datosFilas, nombreColumnas);
        scroll = new JScrollPane(tabla);
        scroll.setBounds(50, 25, 480, 200);

        add(scroll);

        // labels
        lbId = new JLabel();
        lbId.setText("Id");
        lbId.setBounds(50, 240, 50, 25);

        add(lbId);

        lbNombre = new JLabel();
        lbNombre.setText("Nombre");
        lbNombre.setBounds(50, 270, 50, 25);

        add(lbNombre);

        lbCantidad = new JLabel();
        lbCantidad.setText("Cantidad");
        lbCantidad.setBounds(50, 300, 50, 25);

        add(lbCantidad);

        lbPrecio = new JLabel();
        lbPrecio.setText("Precio");
        lbPrecio.setBounds(50, 330, 50, 25);

        add(lbPrecio);

        lbCategoria = new JLabel();
        lbCategoria.setText("Categoria");
        lbCategoria.setBounds(50, 360, 60, 25);

        add(lbCategoria);

        // comboBox
        cbCategoria = new JComboBox();
        cbCategoria.addItem("ASEO");
        cbCategoria.addItem("VIVERES");
        cbCategoria.setBounds(120, 360, 100, 25);

        add(cbCategoria);

        // textfields
        txId = new JTextField();
        txId.setBounds(120, 240, 50, 25);

        add(txId);

        txNombre = new JTextField();
        txNombre.setBounds(120, 270, 200, 25);

        add(txNombre);

        txCantidad = new JTextField();
        txCantidad.setBounds(120, 300, 50, 25);

        add(txCantidad);

        txPrecio = new JTextField();
        txPrecio.setBounds(120, 330, 50, 25);

        add(txPrecio);

        // buttons
        btEliminar = new JButton();
        btEliminar.setBounds(430, 240, 100, 25);
        btEliminar.setText("Eliminar");

        add(btEliminar);

        btConsultar = new JButton();
        btConsultar.setBounds(430, 270, 100, 25);
        btConsultar.setText("Consultar");

        add(btConsultar);

        btEliminar = new JButton();
        btEliminar.setBounds(430, 300, 100, 25);
        btEliminar.setText("Actualizar");

        add(btEliminar);
    }

    // handle events
    @Override
    public void actionPerformed(ActionEvent e) {

    }

}
