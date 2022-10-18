/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preparacionjavasemana2;

/**
 *
 * @author alejo
 */
public class Testing {

    protected static void main() {
        String AnimalName = "Maui";
        Animal animal = new Animal("Shaggy");
        System.out.println(animal.AnimalName);
    }

    static public void main(String... args) {
        main();
    }

    public void main(String args) {
        String Animalname = null;
        Animal animal = new Animal("Luna");
        System.out.println(animal.AnimalName);
    }
}
