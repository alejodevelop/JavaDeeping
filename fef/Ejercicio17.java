import java.util.Random;

public class Ejercicio17 {

    public static void main(String args[]) {

        int v1[] = new int[4];
        int v2[] = new int[4];
        int n = 0, t = 0;

        for (int i = 0; i <= 3; i++) {

            n = (int) (Math.random() * 100) + 1;
            v1[i] = n;
            t = v1[i] * v1[i];
            v2[i] = t;
        }

        System.out.println("Vector 1");

        for (int i = 0; i <= 3; i++) {

            System.out.print(v1[i] + ",");
        }

        System.out.println("");
        System.out.println("Vector 2");

        for (int i = 0; i <= 3; i++) {

            System.out.print(v2[i] + ",");
        }
    }
}

