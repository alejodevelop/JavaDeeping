/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alejo
 */
public class Prueba {

    public static void main(String[] args) {
        String[][] arr = {{"1", "2", "3"}, {"4", "5"}, {"6", "7"}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j] + "");
                if (arr[i][j].equals("2")) {
                    break;
                }

            }
        }
    }

//    public static void main(String[] args) {
//        int i;
//        int j;
//
//        for (i = 1; i < 4; i++) {
//            for (j = 2; j < 4; j++) {
//                if (j == 3) {
//                    continue;
//                }
//                System.out.println("i: " + i + "j: " + j);
//            }
//        }
//    }
//    boolean test = true;
//
//    int Number = test = false ? 1 + 5 : 2 * 7;
//
//    system.out.println (Number);
//    public static void main(String[] args) {
//        String msg = "Hello";
//        boolean[] flag = new boolean[0];
//        if (flag[0]) {
//            msg = "Welcome";
//        }
//        System.out.println(msg);
//    }
//    public void Neigh(String neigh1, StringBuilder neigh2) {
//        neigh1.concat("!!!");
//        neigh2.append("!!!");
//    }
//
//    public static void main(String[] args) {
//        String neigh1 = "neigh!";
//        StringBuilder neigh2 = new StringBuilder("neigh!");
//        new Prueba().Neigh(neigh1, neigh2);
//        System.out.println(neigh1 + "" + neigh2);
//    }
//    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        list.add(100);
//        list.add(7);
//        list.add(50);
//        list.add(17);
//        list.add(10);
//        list.add(5);
//        list.removeIf(a -> {return a % 2 == 0;});
//        System.out.println(list);
//
//    }
//    String ISBN;
//
//    Prueba(String isbn) {
//        isbn = isbn;
//    }
//
//    public static void main(String... args) {
//        Prueba b1 = new Prueba("1234-4657");
//        Prueba b2 = new Prueba("1234-6457");
//
//        System.out.println(b1.equals(b2) + ":");
//        System.out.println((b1 == b2) + ":");
//        System.out.println(b1.ISBN);
//    }
//    public static void main(String args) {
//        
//    }
//    static public void main(int cmd){
//        
//    }
//    public static void main() {
//        
//    }
}
