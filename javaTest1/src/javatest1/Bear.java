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
public class Bear {

    int weigth = 200;

    protected void finalize() {
        System.out.println("Roar!");
    }

    public static void main(String[] args) {
        Bear bear = new Bear();
        System.out.println(bear.weigth);
        System.gc();
    }
}
