package services;

import models.Joueur;
import models.Partie;

public class CompteurDeScoreTennis {

    public void ajoutPoint(Joueur joueur){
        joueur.setPoint(joueur.getPoint()+1);

    }
}
