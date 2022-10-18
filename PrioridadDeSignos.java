public class PrioridadDeSignos {

    public static void main(String args[]) {
        int a = 2;
        int b = 3;
        int resultado = -3 + 6 / ++a * 4 - b-- + b;
        System.out.println("Primer resultado: " + resultado);
        resultado = (-3 + 6) / ++a * 4 - b-- + b;
        System.out.println("Segundo resultado: " + resultado);
        resultado = -3 + (6 / ++a) * 4 - b-- + b;
        System.out.println("Tercer resultado: " + resultado);
        resultado = -3 + 6 / (++a * 4) - b-- + b;
        System.out.println("Cuarto resultado: " + resultado);
        resultado = -3 + 6 / ++a * 4 - (b-- + b);
        System.out.println("Quinto resultado: " + resultado);

    }
}
