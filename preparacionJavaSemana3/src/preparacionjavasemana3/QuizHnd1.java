/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preparacionjavasemana3;

/**
 *
 * @author alejo
 */
public class QuizHnd1 {

    protected static void main() {
        String pName = "Jhon";
        int id = 23;
        Person p = new Person(pName);
        System.out.println(p.personName);
    }

    private void main(String args) {
        String pName = "Peter";
        int id = 23;
        Person p = new Person(pName);
        System.out.println(p.personName);
    }

    public static void main(String... method) {
        main();
    }
}
