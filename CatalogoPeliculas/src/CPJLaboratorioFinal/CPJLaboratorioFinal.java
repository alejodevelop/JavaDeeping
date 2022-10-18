package CPJLaboratorioFinal;

import java.util.Scanner;
import mx.com.gm.peliculas.negocio.*;

/**
 *
 * @author alejo
 */
public class CPJLaboratorioFinal {

    ICatalogoPeliculas catalogoPeliculas;
    Scanner read;
    String nombreArchivo;

    public static void main(String[] args) {

        System.out.println("Bienvenido al catalogo de peliculas! ");
        System.out.println("Hecho por Alejandro Cabarcas Perdomo ");
        System.out.println("");

        while (true) {
            ICatalogoPeliculas catalogoPeliculas = new CatalogoPeliculasImpl();
            Scanner read = new Scanner(System.in);
            String nombreArchivo = ICatalogoPeliculas.NOMBRE_RECURSO;
            int opcion = 0;
            System.out.println("Elige una opcion: ");
            System.out.println("1. - Iniciar Catalogo Peliculas ");
            System.out.println("2. - Agregar Pelicula ");
            System.out.println("3. - Listar Peliculas");
            System.out.println("4. - Buscar Pelicula");
            System.out.println("0. - Salir");
            opcion = read.nextInt();
            read.nextLine();
            if (opcion == 1) {
                catalogoPeliculas.iniciarCatalogoPeliculas(nombreArchivo);
                System.out.println("Catalogo incializado!");
            }
            if (opcion == 2) {
                System.out.println("Digite el nombre de la pelicula a agregar: ");
                String nombrePelicula = read.nextLine();
                catalogoPeliculas.agregarPelicula(nombrePelicula);
            }
            if (opcion == 3) {
                catalogoPeliculas.listarPeliculas(nombreArchivo);
            }
            if (opcion == 4) {
                System.out.println("Digite el nombre de la pelicula que desea buscar: ");
                String nombrePelicula = read.nextLine();
                catalogoPeliculas.buscarPelicula(nombrePelicula);
            }
            if (opcion == 0) {
                break;
            }

            System.out.println("");
        }

    }

}

/*
 The great gatsby
The wolf of wall street
memento
django
the good the bad and the ugly

 */
