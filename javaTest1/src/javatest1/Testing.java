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
public class Testing {

    static void fun(String str, int... a) {
        for (int i : a) {
            System.out.print(i + "");
        }
    }

    public static void main(String[] args) {
        fun("Java", 1, 2, 3, 4);
    }
}
