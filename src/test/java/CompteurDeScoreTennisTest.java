import models.Partie;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import services.CompteurDeScoreTennis;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;

public class CompteurDeScoreTennisTest {

    private CompteurDeScoreTennis compteurDeScoreTennis;

    @BeforeEach
    void init() {
        this.compteurDeScoreTennis = new CompteurDeScoreTennis();
    }

    @Test
    @DisplayName("Devrait retourner une partie sans joueur")
    void createMatchShouldReturnNewMatch() {
        Partie nouvellePartie = this.compteurDeScoreTennis.createPartie();

        assertInstanceOf(Partie.class, nouvellePartie);
        assertEquals(0, nouvellePartie.getJoueurs().size());

    }
}
