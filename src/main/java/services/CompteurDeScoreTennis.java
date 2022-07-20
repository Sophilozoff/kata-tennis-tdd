package services;

import models.Joueur;
import models.Partie;

public class CompteurDeScoreTennis {

    public void ajoutPoint(Joueur joueur){
        joueur.ajoutPoint();
    }

    public String affichePoint(){
        return "";
    }


}
