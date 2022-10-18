package mx.com.gm.peliculas.negocio;

/**
 *
 * @author alejo
 */
public interface ICatalogoPeliculas {

    public static final String NOMBRE_RECURSO = "peliculas.txt";

    public void agregarPelicula(String nombrePelicula);

    public void listarPeliculas(String nombreArchivo);

    public void buscarPelicula(String buscar);

    public void iniciarCatalogoPeliculas(String nombreArchivo);

}
