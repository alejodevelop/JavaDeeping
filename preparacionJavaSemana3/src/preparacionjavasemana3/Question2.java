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
public class Question2 {

    static String Name;

    public void setName(String name) {
        Name = name;
    }

    public static String getName() {
        return Name;
    }

    static public void main(String cmd[]) {
        Question2 q = new Question2();
        System.out.println(getName());
    }
}
