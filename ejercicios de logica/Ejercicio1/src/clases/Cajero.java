package clases;

public class Cajero {

    public static void main(String[] args) {
        Cuenta persona1 = new Cuenta("Alejo");
        Cuenta persona2 = new Cuenta("Eduardo", 200);

        //mostrando valores en ambas cuentas
        System.out.println("Cuenta de persona 1: " + persona1);
        System.out.println("");
        System.out.println("Cuenta de persona 2: " + persona2);
        System.out.println("");

        //transacciones entre las cuentas
        //
        //ingreso
        persona1.ingresar(300);
        System.out.println("Cuenta de persona 1: " + persona1);
        System.out.println("");
        persona2.ingresar(10);
        System.out.println("Cuenta de persona 2: " + persona2);
        System.out.println("");
        //
        //retiro
        persona1.retirar(50);
        System.out.println("Cuenta de persona 1: " + persona1);
        System.out.println("");
        persona2.retirar(80);
        System.out.println("Cuenta de persona 2: " + persona2);
        System.out.println("");
    }
}
