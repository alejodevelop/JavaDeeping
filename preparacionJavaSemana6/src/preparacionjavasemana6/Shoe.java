/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preparacionjavasemana6;

/**
 *
 * @author alejo
 */
public class Shoe {
}

class Boot extends Shoe {
}

class ShoeFactory {

    ShoeFactory(Boot val) {
        System.out.println("boot");
    }

    ShoeFactory(Shoe val) {
        System.out.println("shoe");
    }
}
