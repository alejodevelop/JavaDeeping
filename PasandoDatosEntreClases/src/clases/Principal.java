package clases;

public class Principal {

    public static void main(String[] args) {
        Restaurante2 restaurante2 = new Restaurante2();
        Restaurante3 restaurante3 = new Restaurante3();

        System.out.println("Estos son los precios de los desayunos sorpresa: ");
        System.out.println("");
        restaurante2.Imprimir(restaurante2.getPrecio(), 2, "$");
        System.out.println("");
        restaurante2.Imprimir(restaurante3.getPrecio(), 3, "$");
    }

}
