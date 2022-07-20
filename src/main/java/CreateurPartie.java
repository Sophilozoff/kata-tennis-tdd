import models.Joueur;
import models.Partie;

public class CreateurPartie {

    public void ajouterJoueurs(Partie partie, Joueur j1, Joueur j2){
        partie.setJoueurUn(j1);
        partie.setJoueurDeux(j2);

    }



}
