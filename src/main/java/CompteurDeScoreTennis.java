import models.Joueur;
import models.Partie;

public class CompteurDeScoreTennis {

    public void ajoutPoint(Joueur joueur){
        joueur.ajoutPoint();
    }

    public String affichagePoint(Partie partie){
       Joueur j1 = partie.getJoueurUn();
       Joueur j2 = partie.getJoueurDeux();

       String scoreFinal = evaluerPoint(j1.getPoint()) + "/" + evaluerPoint(j2.getPoint());
       return scoreFinal;

    }

    private String evaluerPoint(int point) {
        String pointFinal = "";
        switch(point){
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
            default:
                break;

        }
        return pointFinal;
    }



}
