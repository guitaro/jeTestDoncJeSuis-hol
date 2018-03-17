package js.jetestdoncjesuis;

public class Bouton {

    String nom;

    public Bouton(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return this.nom;
    }

    public void clic() {
        System.out.print("Bouton " + nom + ": j'ai clique sur le bouton du chef !\n");
    }
}
