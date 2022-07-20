package models;

public class Partie {

    private String nom;
    private Joueur joueurUn;
    private Joueur joueurDeux;
    private boolean jeuDecisif= false;


    public Partie() {
    }

    public Partie(String nom) {
        this.nom = nom;
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

    public boolean isJeuDecisif() {
        return jeuDecisif;
    }

    public void setJeuDecisif(boolean jeuDecisif) {
        this.jeuDecisif = jeuDecisif;
    }
    public void initPoint(){
        joueurUn.initPoint();
        joueurDeux.initPoint();
    }

    public void initJeux(){
        joueurUn.initJeu();
        joueurDeux.initJeu();
    }
}
