/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author alejo
 */
public class CuerpoDeAgua extends ObjetoGeografico {

    //constructores
    public CuerpoDeAgua(String TipoAgua, String CuerpoAgua, String NombreCuerpoAgua, String TipoDocumento, int ID, float IRCA) {
        super(TipoAgua, CuerpoAgua, NombreCuerpoAgua, TipoDocumento, ID, IRCA);
    }

    // metodos, funciones
    private float nivel() {

        float nivelRiesgo = 0;

        return nivelRiesgo;
    }

}
