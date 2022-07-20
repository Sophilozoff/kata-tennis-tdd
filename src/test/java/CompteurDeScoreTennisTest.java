import models.Joueur;
import models.Partie;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CompteurDeScoreTennisTest {

    private CompteurDeScoreTennis compteurDeScoreTennis = new CompteurDeScoreTennis();
    Joueur j1 = new Joueur("j1");
    Joueur j2 = new Joueur("j2");
    Partie partie = new Partie("test", j1, j2);



    @Test
    @DisplayName("Devrait retourner une notification d'un point gagné pour un joueur")
    public void utilisateurAjoutePointAJoueur() {
        int scoreJ1 = j1.getPoint();
        compteurDeScoreTennis.ajoutPoint(j1);
        assertTrue(scoreJ1 < j1.getPoint());
    }

    @Test
    @DisplayName("Devrait afficher les points de 0 à 15, 15 à 30, 30 à 40")
    public void echelonPointGagnes() {
        String scoreFinalAttendu = "15/40";
        partie.getJoueurUn().setPoint(1);
        partie.getJoueurDeux().setPoint(3);

        assertEquals(scoreFinalAttendu, compteurDeScoreTennis.evaluerPoint(partie));
    }

    @Test
    @DisplayName("Devrait retourner un avantage pour le joueur1")
    public void joueurGagnePointPourAvantage() {
        String scoreFinalAttendu = "avantage" + partie.getJoueurUn().getNom();
        partie.getJoueurUn().setPoint(4);
        partie.getJoueurDeux().setPoint(3);

        assertEquals(scoreFinalAttendu, compteurDeScoreTennis.evaluerPoint(partie));
    }

    @Test
    @DisplayName("Devrait retourner 2 joueurs a égalité")
    public void joueurPerdSonAvantage() {
    }

    @Test
    @DisplayName("Devrait retourner un jeu gagné suite à un avantage")
    public void joueurGagneJeuApresAvantage() {
    }

    @Test
    @DisplayName("Devrait retourner 0 points au joueurs après un jeu gagné")
    public void joueurZeroPointApresJeuGagne() {
    }

    @Test
    @DisplayName("Devrait retourner un set gagné lorsque 6 jeux gagnés contre 4 ou moins")
    public void joueurGagneUnSet() {
    }

    @Test
    @DisplayName("Devrait retourné un set gagné lorsque le nombre de jeux >=5 et que l'écart entre les joueurs est = 2")
    public void joueurGagneUnSetApresEgaliteDeJeux() {
    }

    @Test
    @DisplayName("Devrait retourner le mode jeux decisif => lex joueurs ont 6 jeux gagnés")
    public void modeJeuDecisif() {
    }

    @Test
    @DisplayName("Devrait ajouter 1 point en jeu décisif")
    public void ajouteUnPointJeuDecisif() {
    }

    @Test
    @DisplayName("Devrait ajouter les points 1 à 1 jusqu'à 7 en jeu décisif")
    public void ajoutePointUnParUnJeuDecisif() {
    }

    @Test
    @DisplayName("Devrait retourner set gagné pour un joueur lorsque ses points en jeux décisif >= 7 et un ecart de " +
            "point avec l'autre joueur")
    public void joueurGagneUnSetApresJeuDecisif() {
    }

}
