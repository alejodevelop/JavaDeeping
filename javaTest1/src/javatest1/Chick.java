/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatest1;

/**
 *
 * @author alejo
 */
public class Chick {

    private String name;

    public void Chick() {
        name = "Oreo";
    }

    Chick() {
        name = "Fluffy";
    }

    public static void main(String[] args) {
        Chick chick = new Chick();
        System.out.println(chick.name);
    }

    {
        name = "Tiny";
    }

    {
        name = "Cinnamon";
    }
}
