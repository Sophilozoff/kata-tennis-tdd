import models.Joueur;
import models.Partie;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import services.CompteurDeScoreTennis;

import static org.junit.jupiter.api.Assertions.*;

public class CompteurDeScoreTennisTest {

    private CompteurDeScoreTennis compteurDeScoreTennis;

    @BeforeEach
    void init() {
        this.compteurDeScoreTennis = new CompteurDeScoreTennis();
    }

    @Test
    @DisplayName("Devrait retourner une partie sans joueur")
    public void createMatchShouldReturnNewMatch() {
        Partie nouvellePartie = this.compteurDeScoreTennis.createPartie();

        assertInstanceOf(Partie.class, nouvellePartie);
        assertNull(nouvellePartie.getJoueurUn());
        assertNull(nouvellePartie.getJoueurDeux());
    }

    @Test
    @DisplayName("Devrait retourner une partie avec 2 joueurs")
    public void creationPartieAvecJoueur(){
        Partie partie = new Partie("premierePartie", new Joueur("J1"), new Joueur("J2"));

        assertNotNull(partie.getJoueurUn());
        assertNotNull(partie.getJoueurDeux());
    }

    @Test
    @DisplayName("Devrait retourner deux joueurs qui ont le score a 0")
    public void joueursZeroPoint(){}

    @Test
    @DisplayName("Devrait retourner deux joueur avec 0 jeux gagnés")
    public void JoueursZeroJeuxGagnes(){}

    @Test
    @DisplayName("Devrait retourner deux joueur avec 0 sets gagnés")
    public void joueursZeroSetGagnes(){}

    @Test
    @DisplayName("Devrait retourner une notification d'un point gagné pour le joueur1")
    public void notificationJoueurGagneUnPoint(){}

    @Test
    @DisplayName("Devrait comptabiliser les point de 0 à 15, 15 à 30, 30 à 40")
    public void echelonPointGagnes(){}

    @Test
    @DisplayName("Devrait retourner un avantage pour le joueur1")
    public void joueurGagnePointPourAvantage(){}

    @Test
    @DisplayName("Devrait retourner 2 joueurs a égalité")
    public void joueurPerdSonAvantage(){}

    @Test
    @DisplayName("Devrait retourner un jeu gagné suite à un avantage")
    public void joueurGagneJeuApresAvantage(){}

    @Test
    @DisplayName("Devrait retourner 0 points au joueurs après un jeu gagné")
    public void joueurZeroPointApresJeuGagne(){}

    @Test
    @DisplayName("Devrait retourner un set gagné lorsque 6 jeux gagnés contre 4 ou moins")
    public void joueurGagneUnSet(){}

    @Test
    @DisplayName("Devrait retourné un set gagné lorsque le nombre de jeux >=5 et que l'écart entre les joueurs est = 2")
    public void joueurGagneUnSetApresEgaliteDeJeux(){}

    @Test
    @DisplayName("Devrait retourner le mode jeux decisif => lex joueurs ont 6 jeux gagnés")
    public void modeJeuDecisif(){}

    @Test
    @DisplayName("Devrait ajouter 1 point en jeu décisif")
    public void ajouteUnPointJeuDecisif(){}

    @Test
    @DisplayName("Devrait ajouter les points 1 à 1 jusqu'à 7 en jeu décisif")
    public void ajoutePointUnParUnJeuDecisif(){}

    @Test
    @DisplayName("Devrait retourner set gagné pour un joueur lorsque ses points en jeux décisif >= 7 et un ecart de " +
            "point avec l'autre joueur")
    public void joueurGagneUnSetApresJeuDecisif(){}

    @Test
    @DisplayName("Devrait retourné Partie Gagnée lorsque 2 sets sont gagnés par un joueur")
    public void joueurGagnePartie(){}

    @Test
    @DisplayName("Devrait lever une exception car la partie est terminée")
    public void ajoutPointPartieFinie(){}

    @Test
    @DisplayName("Devrait renvoyer une notification pour partie finie")
    public void notificationPartieFinie(){}

}
