/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author alejo
 */
public class InterfazController implements Initializable {

    /**
     * Initializes the controller class.
     */
    // text fields
    @FXML
    private TextField txfNombre;
    @FXML
    private TextField txfMunicipio;
    @FXML
    private TextField txfTipoAgua;
    @FXML
    private TextField txfID;
    @FXML
    private TextField txfTipoDocumento;
    @FXML
    private TextField txfIRCA;

    // text areas
    @FXML
    private TextArea txaIzquierda;
    @FXML
    private TextArea txaDerecha;

    // buttons
    @FXML
    private Button btnIngresar;
    @FXML
    private Button btnProcesar;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void Ingresar(ActionEvent event) {

    }

    @FXML
    private void Procesar(ActionEvent event) {

    }
}
