package electrodomesticos;

/**
 *
 * @author alejo
 */
public class Lavadora extends Electrodomesticos {

    private int carga = 5;

    public Lavadora() {

    }

    public Lavadora(int precioBase, int peso) {
        super(precioBase, peso);

    }

    public Lavadora(int carga, int precioBase, String color, String consumoEnergetico, int peso) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;

    }

    public int getCarga() {
        return carga;
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (this.carga > 30) {
            this.precioBase += 50;
        }
    }

}
