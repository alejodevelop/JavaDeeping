package clases;

import interfaces.Entregable;

/**
 *
 * @author alejo
 */
public class VideoJuegos implements Entregable {

    private String titulo;
    private int horasEstimadas = 10;
    boolean entregado = false;
    private String genero;
    private String compañia;

    public VideoJuegos() {
    }

    public VideoJuegos(String titulo, int horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
    }

    public VideoJuegos(String titulo, int horasEstimadas, String genero, String compañia) {
        this.titulo = titulo;
        this.genero = genero;
        this.compañia = compañia;
    }

    public String getCompañia() {
        return compañia;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "videoJuegos{" + "titulo=" + titulo + ", horasEstimadas=" + horasEstimadas + ", entregado=" + entregado + ", genero=" + genero + ", compa\u00f1ia=" + compañia + '}';
    }

    //métodos a implementar
    @Override
    public void entregar() {
        this.entregado = true;
    }

    @Override
    public void devolver() {
        this.entregado = false;
    }

    @Override
    public boolean isEntregado() {
        return this.entregado;
    }

    @Override
    public Object compareTo(Object a) {
        int limite = this.horasEstimadas;
        Object ObjetoBuscado = new Object();
        for (VideoJuegos item : ((VideoJuegos[]) a)) {
            if (item.horasEstimadas > limite) {
                ObjetoBuscado = item;
                limite = item.horasEstimadas;
            }
        }
        return ObjetoBuscado;
    }

}
