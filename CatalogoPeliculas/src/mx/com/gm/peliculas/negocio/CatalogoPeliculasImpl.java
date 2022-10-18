package mx.com.gm.peliculas.negocio;

import java.util.List;
import java.util.logging.*;
import mx.com.gm.peliculas.datos.*;
import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.*;

/**
 *
 * @author alejo
 */
public class CatalogoPeliculasImpl implements ICatalogoPeliculas {

    private final IAccesoDatos datos;

    public CatalogoPeliculasImpl() {
        this.datos = new AccesoDatosImpl();
    }

    @Override
    public void agregarPelicula(String nombrePelicula) {
        try {
            if (datos.buscar(NOMBRE_RECURSO, nombrePelicula).equalsIgnoreCase(nombrePelicula + " No se encuentra en el catalogo! ")) {
                Pelicula pelicula = new Pelicula(nombrePelicula);
                datos.escribir(pelicula, NOMBRE_RECURSO, true);
                System.out.println(nombrePelicula + " fue agregada correctamente!");
            } else {
                System.out.println(nombrePelicula + " ya existe, No fue agregada!");
            }
        } catch (LecturaDatosEx ex) {
            Logger.getLogger(CatalogoPeliculasImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (EscrituraDatosEx ex) {
            Logger.getLogger(CatalogoPeliculasImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void listarPeliculas(String nombreArchivo) {
        try {
            List<Pelicula> listaPeliculas = datos.listar(NOMBRE_RECURSO);
            for (Pelicula pelicula : listaPeliculas) {
                System.out.println(pelicula.getNombre());
            }

//            listaPeliculas.forEach((final Pelicula pelicula) -> System.out.println(pelicula.getNombre()));
        } catch (LecturaDatosEx ex) {
            Logger.getLogger(CatalogoPeliculasImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void buscarPelicula(String buscar) {
        try {
            System.out.println(datos.buscar(NOMBRE_RECURSO, buscar));
        } catch (LecturaDatosEx ex) {
            Logger.getLogger(CatalogoPeliculasImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void iniciarCatalogoPeliculas(String nombreArchivo) {
        try {

            datos.crear(NOMBRE_RECURSO);

        } catch (AccesoDatosEx ex) {
            Logger.getLogger(CatalogoPeliculasImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
