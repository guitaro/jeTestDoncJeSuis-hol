package js.jetestdoncjesuis;

import java.util.Collection;
import java.util.HashSet;

public class UtilitaireDeClic {

    private static Collection<Ecran> ecrans = new HashSet<Ecran>();

    static {
        init();
    }

    private static void init() {
        Ecran ecranAccueil = new Ecran("ecran d'accueil");
        ecranAccueil.addBouton("ecran d'accueil > premier écran");
        ecranAccueil.addBouton("ecran d'accueil > deuxième écran");

        Ecran premierEcran  = new Ecran("premier écran");
        premierEcran.addBouton("premier écran > consulter Toto");
        premierEcran.addBouton("premier écran > consulter Titi");
        premierEcran.addBouton("premier écran > consulter Tata");
        
        Ecran deuxiemeEcran  = new Ecran("deuxième écran");
        deuxiemeEcran.addBouton("deuxième écran > consulter tester c'est douter");
        deuxiemeEcran.addBouton("deuxième écran > consulter tester c'est l'adopter");
        deuxiemeEcran.addBouton("deuxième écran > consulter tester c'est ramer");
        
        ecrans.add(ecranAccueil);
        ecrans.add(premierEcran);
        ecrans.add(deuxiemeEcran);
    }

    public void clicsAleatoires() throws Exception {
        System.out.println("\n\nDémarrage des clics aléatoires :");
        for (Ecran ecran : ecrans) {
            ecran.clicAleatoire();
        }
        System.out.println("Fin des clics aléatoires\n\n");
    }
}
