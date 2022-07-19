package services;

import models.Joueur;
import models.Partie;

public class CompteurDeScoreTennis {

    public void ajoutPoint(Joueur joueur){
        int score = joueur.getPoint();

        switch (score){
            case 0:
                joueur.setPoint(15);
                break;
            case 15:
                joueur.setPoint(30);
                break;
            case 30 :
                joueur.setPoint(40);
                break;

        }

    }


}
