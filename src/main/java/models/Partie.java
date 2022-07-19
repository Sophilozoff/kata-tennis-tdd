package models;

public class Partie {

    private String nom;
    private Joueur joueurUn;
    private Joueur joueurDeux;


    public Partie() {
    }

    public Partie(String nom, Joueur joueurUn, Joueur joueurDeux) {
        this.nom = nom;
        this.joueurUn = joueurUn;
        this.joueurDeux = joueurDeux;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Joueur getJoueurUn() {
        return joueurUn;
    }

    public void setJoueurUn(Joueur joueurUn) {
        this.joueurUn = joueurUn;
    }

    public Joueur getJoueurDeux() {
        return joueurDeux;
    }

    public void setJoueurDeux(Joueur joueurDeux) {
        this.joueurDeux = joueurDeux;
    }
}
