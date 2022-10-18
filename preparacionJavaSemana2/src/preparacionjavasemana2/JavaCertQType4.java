/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preparacionjavasemana2;

/**
 *
 * @author alejo
 */
public class JavaCertQType4 {

    static int[] array = {1, 2, 3, 4, 5};

    public static void main(String[] args) {

        char[][] grid = new char[][]{{'7', ' ', ' ', ' '},
        {'5', '7', ' ', '5'},
        {'7', '7', '5', '5'},
        {'5', '7', '7', '5'}};

        grid[0] = new char[]{'7', '7', ' ', ' '};
        grid[0][1] = '7';

        System.out.println(grid[0]);
    }

//    public static void main(String... method) {
//        for (int i = 1; i < method.size && i < 6; i = i + 2) {
//            System.out.println(method[i]);
//        }
//    }
//    public static void main(String[] main) {
//
//        for (int i = 1; i < array.length && i < 6; i = i + 2) {
//            System.out.println(array[i]);
//        }
//    }
//    public static void main(String... arguments) {
//        int ctr = 0;
//        while (ctr < array.length) {
//            if (ctr >= 4) {
//                break;
//            }
//            if (ctr % 2 != 0) {
//                System.out.println(array[ctr]);
//            }
//            ++ctr;
//        }
//    }
//    public static void main(String[] arguments) {
//        int ctr = 1;
//        while (ctr < array.length) {
//            if (ctr >= 4) {
//                break;
//            }
//            if (ctr % 2 == 0) {
//                System.out.println(array[ctr]);
//            }
//            ++ctr;
//        }
//    }
//    static int c, a = 10, b = 21 / 2;
//
//    static {
//        c = a;
//    }
//    public static void main(String... variables) {
//        System.out.println(b);
//    }
//    public static void main(String[] commandArgs) {
//        System.out.println(b);
//    }
//    public static void main(String args) {
//        System.out.println(b);
//    }
//    public static void main(String... method) {
//        System.out.println(b);
//    }
}
