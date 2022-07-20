import models.Joueur;
import models.Partie;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class CreateurPartieTest {

    private CreateurPartie createurPartie = new CreateurPartie();
    Joueur j1 = new Joueur("j1");
    Joueur j2 = new Joueur("j2");
    Partie partie = new Partie("test", j1, j2);

    private CompteurDeScoreTennis compteurDeScoreTennis = new CompteurDeScoreTennis(partie);

    @BeforeEach
    public void init() {

    }

    @Test
    @DisplayName("Devrait retourner une instance de partie avec un nom")
    public void createPartie() {
        assertInstanceOf(Partie.class, this.partie);
    }

    @Test
    @DisplayName("Devrait retourner une partie avec 2 joueurs")
    public void ajoutJoueurs() {
        createurPartie.ajouterJoueurs(this.partie, this.j1, this.j2);
        assertNotNull(partie.getJoueurUn());
        assertNotNull(partie.getJoueurDeux());
    }

    @Test
    @DisplayName("Devrait retourner deux joueurs qui ont le score a 0")
    public void joueursZeroPoint() {
        assertEquals(0, this.j1.getPoint());
        assertEquals(0, this.j2.getPoint());
    }

    @Test
    @DisplayName("Devrait retourner deux joueur avec 0 jeux gagnés")
    public void JoueursZeroJeuxGagnes() {
        assertEquals(0, this.j1.getJeu());
        assertEquals(0, this.j2.getJeu());
    }

    @Test
    @DisplayName("Devrait retourner deux joueur avec 0 sets gagnés")
    public void joueursZeroSetGagnes() {
        assertEquals(0, this.j1.getSet());
        assertEquals(0, this.j2.getSet());
    }


    @Test
    @DisplayName("Devrait retourné Partie Gagnée lorsque 2 sets sont gagnés par un joueur")
    public void joueurGagnePartie() {
        j1.setJeu(2);

        assertEquals(j1.getNom() + " vainqueur", compteurDeScoreTennis.getScore(partie));
    }

    @Test
    @DisplayName("Devrait lever une exception car la partie est terminée")
    public void ajoutPointPartieFinie() {
    }

    @Test
    @DisplayName("Devrait renvoyer une notification pour partie finie")
    public void notificationPartieFinie() {
    }

}
