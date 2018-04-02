package js.jetestdoncjesuis;

import java.util.*;

public class Ecran {

    String nom;
    ArrayList<Bouton> boutons = new ArrayList<Bouton>();

    public Ecran(String nom) {
        this.nom = nom;
    }

    public void addBouton(String nomBouton) {
        boutons.add(new Bouton(nomBouton));
    }

    public void clicAleatoire() {
        int numeroBoutonACliquer = 0;
        if (boutons.size() > 1) {
            numeroBoutonACliquer = 0; //new Random().nextInt(boutons.size()-1);
        }
        if (!boutons.isEmpty()) {
            boutons.get(numeroBoutonACliquer).clic();
        }
    }
}
