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
public class ArbolOrnamental extends Arbol {

    private String colorTallo;
    private String ColorHojas;

    public ArbolOrnamental(String nombre, float largo, float altura, float ancho, String colorTallo, String colorHojas) {
        super(nombre, largo, altura, ancho);

        this.colorTallo = colorTallo;
        this.ColorHojas = colorHojas;
    }

    public ArbolOrnamental(String nombre, float largo, float altura, float ancho) {
        super(nombre, largo, altura, ancho);
    }

    private void decorar() {
        System.out.println("Añadiendo listones...");
        System.out.println("Colgando luces...");
        System.out.println("Pintando tallo...");
        System.out.println("Colgando adornos...");
        System.out.println("Arbol decorado!!");
    }

    public String getColorTallo() {
        return colorTallo;
    }

    public void setColorTallo(String colorTallo) {
        this.colorTallo = colorTallo;
    }

    public String getColorHojas() {
        return ColorHojas;
    }

    public void setColorHojas(String ColorHojas) {
        this.ColorHojas = ColorHojas;
    }

    @Override
    public String toString() {
        return super.toString() + ", colorTallo=" + this.colorTallo + ", colorHojas=" + this.ColorHojas + '}';
    }

}
