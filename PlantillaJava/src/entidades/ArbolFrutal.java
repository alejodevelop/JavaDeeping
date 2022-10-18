/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author alejo
 */
public class ArbolFrutal extends Arbol {

    private String fruto;
    private String saborFruto;

    public ArbolFrutal(String nombre, float largo, float altura, float ancho, String fruto, String saborFruto) {
        super(nombre, largo, altura, ancho);
        this.fruto = fruto;
        this.saborFruto = saborFruto;
    }

    public ArbolFrutal(String nombre, float largo, float altura, float ancho) {
        super(nombre, largo, altura, ancho);
    }

    private void recogerFrutos() {
        System.out.println("Escalando el arbol...");
        System.out.println("Recolectando cada fruto...");
        System.out.println("Frutos recolectados!!");
    }

    public String getFruto() {
        return fruto;
    }

    public void setFruto(String fruto) {
        this.fruto = fruto;
    }

    public String getSaborFruto() {
        return saborFruto;
    }

    public void setSaborFruto(String saborFruto) {
        this.saborFruto = saborFruto;
    }

    @Override
    public String toString() {
        return super.toString() + ", fruto=" + this.fruto + ", saborFruto=" + this.saborFruto + '}';
    }

}
