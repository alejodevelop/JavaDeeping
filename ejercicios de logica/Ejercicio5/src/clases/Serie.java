package clases;

import interfaces.Entregable;

/**
 *
 * @author alejo
 */
public class Serie implements Entregable {

    private String titulo;
    private int numeroDeTemporadas = 3;
    boolean entregado = false;
    private String genero;
    private String creador;

    public Serie() {
    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
    }

    public Serie(String titulo, int numeroDeTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.genero = genero;
        this.creador = creador;
        this.numeroDeTemporadas = numeroDeTemporadas;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroDeTemporadas() {
        return numeroDeTemporadas;
    }

    public void setNumeroDeTemporadas(int numeroDeTemporadas) {
        this.numeroDeTemporadas = numeroDeTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Serie{" + "titulo=" + titulo + ", numeroDeTemporadas=" + numeroDeTemporadas + ", entregado=" + entregado + ", genero=" + genero + ", creador=" + creador + '}';
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
        int limite = this.numeroDeTemporadas;
        Object ObjetoBuscado = new Object();
        for (Serie item : ((Serie[]) a)) {
            if (item.numeroDeTemporadas > limite) {
                ObjetoBuscado = item;
                limite = item.numeroDeTemporadas;
            }
        }
        return ObjetoBuscado;
    }
}
