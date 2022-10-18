import javax.swing.JOptionPane;

public class Ejercicio3{
  public static void main(String args[]){
    
    int n = 0, l = 0, c = 500;

    n = Integer.parseInt(JOptionPane.showInputDialog("escriba cuantos tanques de combustible posee el auto"));
    
         for(int i = 1; i < n; i++){
           l = c + 500; 
           c = l; 
         }

    JOptionPane.showMessageDialog(null,"el jeep recorre una distancia de " + l + " km");
  }
}