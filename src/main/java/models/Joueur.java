package models;

public class Joueur {

    private String nom;
    private int point;
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

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getJeu() {
        return jeu;
    }

    public void setJeu(int jeu) {
        this.jeu = jeu;
    }

    public int getSet() {
        return set;
    }

    public void setSet(int set) {
        this.set = set;
    }

    public void ajoutPoint() {
        this.point += 1;
    }

    public void ajoutJeu() {
        this.jeu += 1;
    }

    public void ajoutSet(){
        this.set +=1;
    }
}
