package clases;

public class Cuenta {

    private String titular;
    private double cantidad;

    //Constructores
    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public Cuenta(String titular) {
        this.titular = titular;
    }

    //getter and setters
    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    //toString
    @Override
    public String toString() {
        return "Cuenta{" + "titular=" + titular + ", cantidad=" + cantidad + '}';
    }

    //metodos 
    public void ingresar(double cantidad) {
        if (cantidad < 1) {

        } else {
            this.cantidad += cantidad;
        }
    }

    public void retirar(double cantidad) {
        this.cantidad = (this.cantidad - cantidad);
        if (this.cantidad < 0) {
            this.cantidad = 0;
        }
    }
}
