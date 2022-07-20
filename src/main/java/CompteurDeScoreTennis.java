import models.Joueur;
import models.Partie;

public class CompteurDeScoreTennis {

    private final Partie partie;

    public CompteurDeScoreTennis(Partie partie) {
        this.partie = partie;
    }

    public String getScore(Partie partie) {

        if (partie.getJoueurUn().getSet() == 2) {
            partie.setFinie(true);
            return partie.getJoueurUn().getNom() + " vainqueur";
        } else if (partie.getJoueurDeux().getSet() == 2) {
            partie.setFinie(true);
            return partie.getJoueurDeux().getNom() + " vainqueur";
        }
        evaluerJeu(partie);
        if (!partie.isJeuDecisif()) {
            return evaluerPoint(partie);
        } else return evaluerPointJeuDecisif(partie);

    }

    private String evaluerPoint(Partie partie) {
        Joueur j1 = partie.getJoueurUn();
        Joueur j2 = partie.getJoueurDeux();
        //gain jeu sans avantage
        if (j1.getPoint() == 4 && j2.getPoint() < 3) {
            ajoutJeu(j1);
            partie.initPoint();
        } else if (j2.getPoint() == 4 && j1.getPoint() < 3) {
            ajoutJeu(j2);
            partie.initPoint();
        }

        //gain jeu après avantage
        if (j1.getPoint() == 5 && j2.getPoint() == 3) {
            ajoutJeu(j1);
            partie.initPoint();
        } else if (j2.getPoint() == 5 && j1.getPoint() == 3) {
            ajoutJeu(j2);
            partie.initPoint();
        }

        //(avantage - avantage devient 40/40)
        if (j1.getPoint() == 4 && j2.getPoint() == 4) {
            j1.setPoint(3);
            j2.setPoint(3);
        }
        return afficherPointEnCours(partie);
    }

    private String evaluerJeu(Partie partie) {
        Joueur j1 = partie.getJoueurUn();
        Joueur j2 = partie.getJoueurDeux();

        if (j1.getJeu() == 6 && j2.getJeu() == 6) {
            partie.setJeuDecisif(true);
            return "Jeu décisif à venir";
        }

        if (Math.abs(j1.getJeu() - j2.getJeu()) >= 2) {
            if (j1.getJeu() >= 6) {
                ajoutSet(j1);
                return "J1 gagne le jeu";
            } else if (j2.getJeu() >= 6) {
                ajoutSet(j2);
                return "J2 gagne le jeu";

            }
            partie.initJeux();
        }
        return "Nouveau jeu à venir";
    }

    private String evaluerPointJeuDecisif(Partie partie) {

        Joueur j1 = partie.getJoueurUn();
        Joueur j2 = partie.getJoueurDeux();

        if (Math.abs(j1.getPoint() - j2.getPoint()) >= 2) {
            if (j1.getPoint() >= 7) {
                ajoutSet(j1);
            } else if (j2.getPoint() >= 7) {
                ajoutSet(j2);
            }
            partie.initJeux();
        }
        return partie.getJoueurUn().getPoint() + "/" + partie.getJoueurDeux().getPoint();

    }

    private String afficherPointEnCours(Partie partie) {
        Joueur j1 = partie.getJoueurUn();
        Joueur j2 = partie.getJoueurDeux();
        //(si 40/40 : égalité)
        if (j1.getPoint() == 3 && j2.getPoint() == 3) {
            return afficherEgalite();
        } else if (j1.getPoint() == 4 || j2.getPoint() == 4) {
            if (j1.getPoint() == 4) { //(avantageJ1)
                return afficherPoint(j1) + partie.getJoueurUn().getNom();
            } else {//(avantageJ2)
                return afficherPoint(j2) + partie.getJoueurDeux().getNom();
            }
        } else {
            return afficherPoint(j1) + "/" + afficherPoint(j2);
        }
    }

    private String afficherPoint(Joueur joueur) {
        int point = joueur.getPoint();

        String pointFinal = "";
        switch (point) {
            case 0:
                pointFinal = "0";
                break;
            case 1:
                pointFinal = "15";
                break;
            case 2:
                pointFinal = "30";
                break;
            case 3:
                pointFinal = "40";
                break;
            case 4:
                pointFinal = "avantage ";
                break;
        }
        return pointFinal;
    }

    private String afficherEgalite() {
        return "égalité";
    }

    private String afficheModeJeuDecisif() {
        return "JEU DECISIF";
    }


    public void ajoutPoint(Joueur joueur) {
        if(!partie.isFinie()){
            joueur.ajoutPoint();
        }
    }

    private void ajoutJeu(Joueur joueur) {
        joueur.ajoutJeu();
    }

    public void ajoutSet(Joueur joueur) {
        joueur.ajoutSet();
    }

}
