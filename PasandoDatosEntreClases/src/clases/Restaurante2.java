package clases;

public class Restaurante2 {

    private double precio = 400.5;

    public double getPrecio() {
        return precio;
    }

    public void Imprimir(double p, int r, String s) {
        System.out.println("El precio para el restaurante " + r + " es: " + s + p);
    }

}
