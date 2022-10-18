import java.lang.Math.*;

public class Ejercicio6{
  public static void main(String args[]){

    int t, a;
    int via, vip, aca, acp, da, dp, dap;
 
    via = 222;
    vip = 222;
    aca = 20;
    acp = 10;
      t = 21;

    for(a = 1; a <= t; a++){
      da = (via * t) + (1 * aca * a^2);
      dp = (vip * t) + (1 * acp * a^2);

      dap = (int)Math.sqrt(da^2 + dp^2);

      System.out.println(dap);
    }
  }
}

/**
 *
 * @author Santiago Andrés Diáz Herrera y Alejandro Cabarcas Perdomo
 */