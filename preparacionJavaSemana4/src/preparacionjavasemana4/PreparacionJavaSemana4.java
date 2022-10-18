/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preparacionjavasemana4;

/**
 *
 * @author alejo
 */
public class PreparacionJavaSemana4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String... $n) {
        // esto da 0.5 pero al operar enteros, java redondea el 0.5 a 0
        // para corregirlo se pone d al final, 0, un numero se escribe con .0
        //ejemplo 5.0*4.0%3.0/4.0
        double xx = 5 * 4 % 3 / 4;
        System.out.println(xx);
        byte numero = 2;
    }

}
