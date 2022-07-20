import models.Joueur;
import models.Partie;

public class CompteurDeScoreTennis {

    public void ajoutPoint(Joueur joueur){
        joueur.ajoutPoint();
    }

    public String evaluerPoint(Partie partie){
      Joueur j1 = partie.getJoueurUn();
      Joueur j2 = partie.getJoueurDeux();

       if (j1.getPoint() == 4 || j2.getPoint() == 4){
           if(j1.getPoint() == 4){
               return afficherPoint(j1.getPoint()) + partie.getJoueurUn().getNom();
           } else {
               return afficherPoint(j2.getPoint()) + partie.getJoueurDeux().getNom();
           }
       }else {
           return afficherPoint(j1.getPoint()) + "/" + afficherPoint(j2.getPoint());
       }

    }

    private String afficherPoint(int point) {
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
