import java.util.Scanner;

public class Calificaciones {

    public static void main(String args[]) {

        Scanner read = new Scanner(System.in);
        System.out.println("Digíte la calificación: ");
        double calificacion = read.nextDouble();

        if (calificacion <= 10 && calificacion >= 9) {
            System.out.println("Aprobado, su nota es [A]");
        } else if (calificacion < 9 && calificacion >= 8) {
            System.out.println("Aprobado, su nota es [B]");
        } else if (calificacion < 8 && calificacion >= 7) {
            System.out.println("Aprobado, su nota es [C]");
        } else if (calificacion < 7 && calificacion >= 6) {
            System.out.println("Aprobado, su nota es [D]");
        } else if (calificacion < 6 && calificacion >= 0) {
            System.out.println("Reprobado, su nota es [F]");
        } else if (calificacion > 10 || calificacion < 0) {
            System.out.println("Por favor, ingrese un calificación valida");
        }
    }
}
