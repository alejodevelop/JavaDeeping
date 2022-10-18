package clases;

/**
 *
 * @author alejo
 */
public class Password {

    int longitud = 8;
    String contraseña = "";

    public Password() {
    }

    public Password(int longitud) {
        this.longitud = longitud;
        generarPassword();

    }

    /**
     * El metodo generarPassword crea una contraseña aleatoria alfanumerica del
     * tamaño especificado por longitud
     */
    /**
     * puedo hacer que el metodo siempre devuelva una contraseña que cumpla con
     * lo estipulado en el metodo esFuerte(), haciendo que este metodo se repita
     * hasta generar una contraseña valida por medio de un ciclo do while, o
     * usando la recursividad al final del metodo, también es necesario para no
     * generar un bucle infinito, que la longitud minima de la contraseña sea un
     * numero que permita cumplir la condicion de esFuerte() que es //mayus > 2,
     * minus > 1, numeros > 5, para que sea considerada una contraseña fuerte,
     * por ende, la longitud minima debe ser de 11 caracteres para que sea
     * considerada, de lo contrario, seria imposible generar una contraseña
     * fuerte por que no habrian suficientes caracteres para cumplir todas las
     * condiciones estuipuladas.
     */
    private void generarPassword() {

        String caracter;
        String cadena;
        int provicional;
//        final String alfabeto[] = {"!", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        final char alfabeto[] = {'!', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        for (int i = 0; contraseña.length() < this.longitud; i++) {
            provicional = (int) Math.floor(Math.random() * 10 + 1);

            if (provicional % 2 != 0) {
                cadena = String.valueOf(provicional);

                this.contraseña += cadena;
            } else {

                provicional = (int) Math.floor(Math.random() * 26 + 1);

                if (provicional % 2 == 0) {
                    //char caracter = alfabeto[provicional].charAt(0);
                    caracter = String.valueOf(alfabeto[provicional]);
                    this.contraseña += caracter;
                } else {
                    caracter = String.valueOf(alfabeto[provicional]);
                    this.contraseña += caracter.toUpperCase();
                }
            }

        }
    }

    public boolean esFuerte() {

        //mayus > 2, minus > 1, numeros > 5
        int mayus = 0, minus = 0, numeros = 0;

        Integer num[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        Integer valoresComprobacion[] = new Integer[this.contraseña.length()];

        String caracter;

        for (int i = 0, i2 = 1; i < this.contraseña.length(); i++, i2++) {

            caracter = contraseña.substring(i, i2);

            for (int j = 0; j < 10; j++) {
                String recorredor = "";
                int temporal = 0;
                temporal = num[j];
                recorredor = String.valueOf(temporal);
                if (caracter.equals(recorredor)) {
                    numeros++;
                    valoresComprobacion[i] = numeros++;
                }
            }

            if (valoresComprobacion[i] == null) {

                if (caracter.equals(caracter.toUpperCase())) {
                    mayus++;
                }
                if (caracter.equals(caracter.toLowerCase())) {
                    minus++;
                }
            }

        }

        if (mayus > 2 && minus > 1 && numeros > 5) {
            System.out.println(true);
            return true;
        }

        System.out.println(false);
        return false;
    }

    public String getContraseña() {
        return contraseña;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "Password{" + "longitud=" + longitud + ", contrase\u00f1a=" + contraseña + '}';
    }

}
