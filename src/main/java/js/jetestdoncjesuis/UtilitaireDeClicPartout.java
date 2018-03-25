package js.jetestdoncjesuis;

import java.util.Collection;

public class UtilitaireDeClicPartout {

  public void clicsPartout(Collection<Ecran> ecrans) {
    System.out.println("\n\nDémarrage des clics partout :");
    for (Ecran ecran : ecrans) {
      ecran.clicPartout();
    }
    System.out.println("Fin des clics partout\n\n");
  }
}
