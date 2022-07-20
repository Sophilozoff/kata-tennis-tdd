import models.Joueur;
import models.Partie;

public class CompteurDeScoreTennis {

    public void ajoutPoint(Joueur joueur) {
        joueur.ajoutPoint();
    }

    public void reinitialisePoint(Partie partie) {
        partie.getJoueurUn().setPoint(0);
        partie.getJoueurDeux().setPoint(0);
    }


    public void ajoutJeu(Joueur joueur) {
        joueur.ajoutJeu();
    }

    public String evaluerPoint(Partie partie) {
        Joueur j1 = partie.getJoueurUn();
        Joueur j2 = partie.getJoueurDeux();


        if (j1.getPoint() == 4 &&  j2.getPoint() < 3) {
            ajoutJeu(j1);
            reinitialisePoint(partie);
        } else if (j2.getPoint() == 4 &&  j1.getPoint() < 3) {
            ajoutJeu(j2);
            reinitialisePoint(partie);
        }

        //(avantage - avantage devient 40/40)
        if (j1.getPoint() == 4 && j2.getPoint() == 4) {
            j1.setPoint(3);
            j2.setPoint(3);
        }

        //(si 40/40 : égalité)
        if (j1.getPoint() == 3 && j2.getPoint() == 3) {
            return afficherPoint(5);
        } else if (j1.getPoint() == 4 || j2.getPoint() == 4) {
            if (j1.getPoint() == 4) { //(avantageJ1)
                return afficherPoint(j1.getPoint()) + partie.getJoueurUn().getNom();
            } else {//(avantageJ2)
                return afficherPoint(j2.getPoint()) + partie.getJoueurDeux().getNom();
            }
        } else {
            return afficherPoint(j1.getPoint()) + "/" + afficherPoint(j2.getPoint());
        }

    }

    private String afficherPoint(int point) {
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
                pointFinal = "avantage";
                break;
            case 5:
                pointFinal = "égalité";
                break;

        }
        return pointFinal;
    }


}
