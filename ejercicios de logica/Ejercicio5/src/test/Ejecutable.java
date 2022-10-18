package test;

import clases.*;

/**
 *
 * @author alejo
 */
public class Ejecutable {

    public static void main(String[] args) {
        Serie series[] = new Serie[5];
        VideoJuegos videoJuegos[] = new VideoJuegos[5];

        series[0] = new Serie("Black Mirror", 7, "Ciencia Ficcion", "Anonimo");
        series[1] = new Serie("Small ville", 3, "Super Heroes", "clark ken");
        series[2] = new Serie("Tesla", "Alejandro Cabarcas");
        series[3] = new Serie("Stranger things", "Netflix");
        series[4] = new Serie("Phineas and pher", "Disney");

        videoJuegos[0] = new VideoJuegos("Grand thef auto", 20, "Open world, action", "Rockstar Games");
        videoJuegos[1] = new VideoJuegos("Mafia", 12);
        videoJuegos[2] = new VideoJuegos("Pro evolution soccer", 10);
        videoJuegos[3] = new VideoJuegos("The legend of zelda", 20, "Adventure", "Nintendo");
        videoJuegos[4] = new VideoJuegos("call of duty", 12);

        series[0].entregar();
        series[1].entregar();
        videoJuegos[0].entregar();
        videoJuegos[3].entregar();

        int seriesEntregadas = 0;
        for (Serie serie : series) {
            if (serie.isEntregado()) {
                seriesEntregadas++;
                serie.devolver();
            }
        }

        int juegosEntregados = 0;
        for (VideoJuegos juego : videoJuegos) {
            if (juego.isEntregado()) {
                juegosEntregados++;
                juego.devolver();
            }
        }

//        System.out.println(juegosEntregados);
//        System.out.println(seriesEntregadas);
    }
}
