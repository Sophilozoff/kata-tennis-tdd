package models;

public class Joueur {

    private String nom;
    private int score;
    private int jeu;
    private int set;

    public Joueur(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

}
