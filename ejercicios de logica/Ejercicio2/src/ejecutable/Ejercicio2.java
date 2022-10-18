package ejecutable;

import persona.Persona;
import java.util.Scanner;

/**
 *
 * @author alejo
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Digite el nombre de la persona 1: ");
        String nombre1 = read.nextLine();
        System.out.println("Digite el nombre de la persona 2: ");
        String nombre2 = read.nextLine();
        System.out.println("Digite el sexo de la persona 1 (H)(M): ");
        String sexoString = read.nextLine();
        char sexoChar1 = sexoString.charAt(0);
        System.out.println("Digite el sexo de la persona 2 (H)(M): ");
        sexoString = read.nextLine();
        char sexoChar2 = sexoString.charAt(0);
        System.out.println("Digite la edad de la persona 1: ");
        int edad1 = read.nextInt();
        System.out.println("Digite la edad de la persona 2: ");
        int edad2 = read.nextInt();
        System.out.println("Digite el peso de : " + nombre1);
        int peso = read.nextInt();
        System.out.println("Digite la altura de: " + nombre1);
        float altura = read.nextFloat();

        Persona persona1 = new Persona(nombre1, edad1, sexoChar1, peso, altura);
        Persona persona2 = new Persona(nombre2, edad2, sexoChar2);
        Persona persona3 = new Persona();

        persona3.setEdad(14);
        persona3.setNombre("camilo");
        persona3.setAltura(1.60F);
        persona3.setPeso(10);
        persona3.setSexo('M');

        System.out.println("");
        System.out.println(nombre1);
        persona1.calcularImc();
        System.out.println(nombre2);
        persona2.calcularImc();
        System.out.println(persona3.getNombre());
        persona3.calcularImc();
        System.out.println("");

        System.out.println(nombre1);
        persona1.esMayorDeEdad();
        System.out.println(nombre2);
        persona2.esMayorDeEdad();
        System.out.println(persona3.getNombre());
        persona3.esMayorDeEdad();
        System.out.println("");

        System.out.println(nombre1);
        persona1.comprobarSexo(sexoChar1);
        System.out.println(nombre2);
        persona2.comprobarSexo(sexoChar2);
        System.out.println(persona3.getNombre());
        persona3.comprobarSexo('H');
        System.out.println("");

        System.out.println(persona1.toString());
        System.out.println("");
        System.out.println(persona2.toString());
        System.out.println("");
        System.out.println(persona3.toString());

    }
}
