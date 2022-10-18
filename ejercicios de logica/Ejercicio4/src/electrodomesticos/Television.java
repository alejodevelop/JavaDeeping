package electrodomesticos;

/**
 *
 * @author alejo
 */
public class Television extends Electrodomesticos {

    private int resolucion = 20;
    private boolean sintonizador = false;

    public Television() {

    }

    public Television(int precioBase, int peso) {
        super(precioBase, peso);

    }

    public Television(int resolucion, boolean sintonizador, int precioBase, String color, String consumoEnergetico, int peso) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;

    }

    public int getResolucion() {
        return resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    @Override
    public void precioFinal() {

        super.precioFinal();

        if (this.resolucion > 40) {
            this.precioBase += this.precioBase * 0.3;
        }
        if (this.sintonizador == true) {
            this.precioBase += 50;
        }
    }

}
