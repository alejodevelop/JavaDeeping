package mx.com.gm.peliculas.datos;

import java.util.*;
import mx.com.gm.peliculas.domain.Pelicula;
import java.io.*;
import java.util.logging.*;
import mx.com.gm.peliculas.excepciones.*;

/**
 *
 * @author alejo
 */
public class AccesoDatosImpl implements IAccesoDatos {

    @Override
    public boolean existe(String nombreArchivo) {

        File archivo = new File(nombreArchivo);
        return archivo.exists();

    }

    @Override
    public List<Pelicula> listar(String nombre) throws LecturaDatosEx {
        var archivo = new File(nombre);
        List<Pelicula> peliculas = new ArrayList<>();

        try {
            var entrada = new BufferedReader(new FileReader(nombre));
            var lectura = entrada.readLine();

            while (lectura != null) {
                Pelicula pelicula = new Pelicula(lectura);
                peliculas.add(pelicula);
                lectura = entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AccesoDatosImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new LecturaDatosEx("Excepcion al listar las peliculas!");
        } catch (IOException ex) {
            Logger.getLogger(AccesoDatosImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new LecturaDatosEx("Excepcion al listar las peliculas!");
        }

        return peliculas;
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEx {
        File archivo = new File(nombreArchivo);

        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, anexar));
            salida.println(pelicula.getNombre());
            salida.close();
        } catch (IOException ex) {
            Logger.getLogger(AccesoDatosImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new EscrituraDatosEx("Excepcion al escribir en el archivo!");
        }

    }

    @Override
    public String buscar(String nombreArchivo, String buscar) throws LecturaDatosEx {
        File archivo = new File(nombreArchivo);
        try {
            var entrada = new BufferedReader(new FileReader(archivo));
            var lectura = entrada.readLine();
            int indice = 1;
            while (lectura != null) {
                if (buscar != null && lectura.equalsIgnoreCase(buscar)) {
                    return buscar + " Se encuentra en el catalogo en la linea " + indice;
                }

                lectura = entrada.readLine();
                ++indice;

            }

            entrada.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(AccesoDatosImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new LecturaDatosEx("Excepcion al listar las peliculas!");

        } catch (IOException ex) {
            Logger.getLogger(AccesoDatosImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new LecturaDatosEx("Excepcion al listar las peliculas!");

        }

        return buscar + " No se encuentra en el catalogo! ";
    }

    @Override
    public void crear(String nombreArchivo) throws AccesoDatosEx {

        File archivo = new File(nombreArchivo);
        if (!archivo.exists()) {
            try {
                archivo.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(AccesoDatosImpl.class.getName()).log(Level.SEVERE, null, ex);
                throw new AccesoDatosEx("Excepcion al crear el archivo!");

            } finally {
                System.out.println("El archivo fue creado!");
            }
        } else {
            System.out.println("El archivo ya existe!");
        }

    }

    @Override
    public void borrar(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        if (archivo.delete()) {
            System.out.println("El archivo fue borrado satisfactoriamente!");
        } else {
            System.out.println("No se pudo borrar el archivo!");
        }
    }

}
