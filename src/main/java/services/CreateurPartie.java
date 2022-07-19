package services;

import models.Joueur;
import models.Partie;

public class CreateurPartie {

    public Partie createPartie(String nom){

        return new Partie(nom);
    }

    public Partie ajouterJoueurs(Partie partie,Joueur j1, Joueur j2){
        partie.setJoueurUn(j1);
        partie.setJoueurDeux(j2);

        return partie;
    }

}
