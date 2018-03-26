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
            numeroBoutonACliquer = new Random().nextInt(boutons.size()-1);
        }
        if (!boutons.isEmpty()) {
            boutons.get(numeroBoutonACliquer).clic();
        }
    }

    public String getNom() {
      return nom;
    }

    public void setNom(String nom) {
      this.nom = nom;
    }

    public ArrayList<Bouton> getBoutons() {
      return boutons;
    }

    public void setBoutons(ArrayList<Bouton> boutons) {
      this.boutons = boutons;
    }
}
