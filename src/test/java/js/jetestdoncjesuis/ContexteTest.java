package js.jetestdoncjesuis;

import java.util.*;

public class ContexteTest {

  public static Collection<Ecran> creerEcrans() {
    Ecran ecranAccueil = new Ecran("ecran d'accueil");
    ecranAccueil.addBouton("ecran d'accueil > premier écran");
    ecranAccueil.addBouton("ecran d'accueil > deuxième écran");

    Ecran premierEcran = new Ecran("premier écran");
    premierEcran.addBouton("premier écran > consulter Toto");
    premierEcran.addBouton("premier écran > consulter Titi");
    premierEcran.addBouton("premier écran > consulter Tata");

    Ecran deuxiemeEcran = new Ecran("deuxième écran");
    deuxiemeEcran.addBouton("deuxième écran > consulter tester c'est douter");
    deuxiemeEcran.addBouton("deuxième écran > consulter tester c'est l'adopter");
    deuxiemeEcran.addBouton("deuxième écran > consulter tester c'est ramer");

    Collection<Ecran> ecrans = new HashSet<Ecran>();
    ecrans.add(ecranAccueil);
    ecrans.add(premierEcran);
    ecrans.add(deuxiemeEcran);
    return ecrans;
  }
}
