package electrodomesticos;

/**
 *
 * @author alejo
 */
public class Electrodomesticos {

    protected int precioBase = 100;
    protected String color = "blanco";
    protected String consumoEnergetico = "F";
    protected int peso = 5;

    public Electrodomesticos() {

    }

    public Electrodomesticos(int precioBase, int peso) {
        this.precioBase = precioBase;
        this.peso = peso;

    }

    public Electrodomesticos(int precioBase, String color, String consumoEnergetico, int peso) {
        this.precioBase = precioBase;
        if (this.comprobarColor(color)) {
            this.color = color;
        }
        if (this.comprobarConsumoEnergetico(consumoEnergetico.charAt(0))) {
            this.consumoEnergetico = consumoEnergetico;
        }

        this.peso = peso;

    }

    public int getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public String getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }

    private boolean comprobarConsumoEnergetico(char letra) {
        /**
         * Puedo hacer lo mismo creando un arreglo con los componentes, un
         * condicional y generando un ciclo para que recorra el arreglo y haga
         * las respectivas comprobaciones(si fueran mas opciones, seria la
         * opcion predilecta). la ventaja de como lo hize es que resulta mas
         * legible.
         */
        String comprobador = String.valueOf(letra);
        if (comprobador.equalsIgnoreCase("a")) {
            return true;
        } else if (comprobador.equalsIgnoreCase("b")) {
            return true;
        } else if (comprobador.equalsIgnoreCase("c")) {
            return true;
        } else if (comprobador.equalsIgnoreCase("d")) {
            return true;
        } else if (comprobador.equalsIgnoreCase("e")) {
            return true;
        } else if (comprobador.equalsIgnoreCase("f")) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * aca si implemente la forma de hacerlo que comente arriba, todo sea por la
     * inclusion del codigo jajaja
     *
     * @param color
     * @return boolean
     */
    private boolean comprobarColor(String color) {
        String comprobador[] = {"blanco", "negro", "rojo", "azul", "gris"};

        //un for each bien elegante papá
        for (String comprobador1 : comprobador) {
            if (comprobador1.equalsIgnoreCase(color)) {
                return true;
            }
        }
        return false;
    }

    public void precioFinal() {
        if (this.consumoEnergetico.equalsIgnoreCase("A")) {
            this.precioBase += 100;
        } else if (this.consumoEnergetico.equalsIgnoreCase("B")) {
            this.precioBase += 80;
        } else if (this.consumoEnergetico.equalsIgnoreCase("C")) {
            this.precioBase += 60;
        } else if (this.consumoEnergetico.equalsIgnoreCase("D")) {
            this.precioBase += 50;
        } else if (this.consumoEnergetico.equalsIgnoreCase("E")) {
            this.precioBase += 30;
        } else if (this.consumoEnergetico.equalsIgnoreCase("F")) {
            this.precioBase += 10;
        }
        if (this.peso >= 0 && this.peso <= 19) {
            this.precioBase += 10;
        } else if (this.peso >= 20 && this.peso <= 49) {
            this.precioBase += 50;
        } else if (this.peso >= 50 && this.peso <= 79) {
            this.precioBase += 80;
        } else if (this.peso >= 80) {
            this.precioBase += 100;
        }
    }

}
