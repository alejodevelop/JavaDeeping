package mx.com.gm.peliculas.domain;

import java.io.Serializable;

/**
 *
 * @author alejo
 */
// esta clase cumple las condiciones para ser llamado un javaBean
public class Pelicula implements Serializable {

    private String nombre;

    public Pelicula() {
        super();
    }

    public Pelicula(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "nombre=" + nombre + '}';
    }

}
