package js.jetestdoncjesuis;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class Ecran {

    String nom;
    ArrayList<Bouton> boutons = new ArrayList();

    public Ecran(String nom) {
        this.nom = nom;
    }

    public void addBouton(String nomBouton) {
        boutons.add(new Bouton(nomBouton));
    }

    public void clicAleatoire() {
        int numeroBoutonACliquer = 0;
        if (boutons.size() > 1) {
            numeroBoutonACliquer = new Random().nextInt(boutons.size()-1);
        }
        if (!boutons.isEmpty()) {
            boutons.get(numeroBoutonACliquer).clic();
        }
    }
}
