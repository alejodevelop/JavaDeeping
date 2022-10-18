package interfaces;

/**
 *
 * @author alejo
 */
public interface Entregable {

    /**
     * cambia el atributo prestado a true
     */
    public void entregar();

    /**
     * cambia el atributo prestado a false
     */
    public void devolver();

    /**
     * este metodo devuelve el estado del atributo prestado
     * @return el valor del atributo entregado
     */
    public boolean isEntregado();

    /**
     * este metodo compara entre las series, cual tiene mas horas, y entre los
     * juegos, cual tiene mayor tiempo estimado
     *
     * @param a recibe el arreglo de objetos a comparar
     * @return el objeto Serie con mas capitulos y el objeto VideoJuego con mas
     * horas
     */
    public Object compareTo(Object a);

}
