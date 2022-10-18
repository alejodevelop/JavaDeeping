package persona;

/**
 *
 * @author alejo
 */
public class Persona {

    //atributos
    private String nombre;
    private int edad;
    private final long dni;
    private char sexo = 'H';
    private int peso;
    private float altura;

    //constructores
    public Persona() {
        this.dni = generarDNI();
    }

    public Persona(String nombre, int edad, char sexo) {
        this.dni = generarDNI();
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Persona(String nombre, int edad, char sexo, int peso, float altura) {
        this.dni = generarDNI();
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.sexo = sexo;
    }

    //metodos
    public int calcularImc() {
        float imc = peso / (altura * altura);
        if (imc < 20) {
            System.out.println("devuelve 1");
            return -1;
        }
        if (imc >= 20 && imc <= 25) {
            System.out.println("Esta por debajo del peso ideal");
            return 0;
        }
        if (imc > 25) {
            System.out.println("Padece de sobrepeso");
            return 1;
        }
        System.out.println("devuelve 4");
        return 4;
    }

    public boolean esMayorDeEdad() {
        if (edad >= 18) {
            System.out.println("Es mayor de edad");
            return true;
        }
        if (edad < 18) {
            System.out.println("Es menor de edad");
            return false;
        }
        return false;
    }

    public char comprobarSexo(char sexo) {
        if (this.sexo == sexo) {
            System.out.println("los datos de genero coinciden");
            return sexo;
        }
        System.out.println("los datos de genero no coinciden");
        return 'H';
    }

    public static long generarDNI() {
        return (long) (Math.random() * 100000000);
    }

    //setters and getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public long getDni() {
        return dni;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    //toString
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + '}';
    }

}
