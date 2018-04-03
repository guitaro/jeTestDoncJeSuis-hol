package js.jetestdoncjesuis;

import java.util.Collection;

public class UtilitaireDeClicAleatoire {

  public void clicsAleatoires(Collection<Ecran> ecrans) {
    System.out.println("\n\nDémarrage des clicks aléatoires :");
    for (Ecran ecran : ecrans) {
      ecran.clicAleatoire();
    }
    System.out.println("Fin des clics aléatoires\n\n");
  }
}
