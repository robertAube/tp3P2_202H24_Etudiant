package application;

import cartes.*;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Les méthodes de cette classe mets en œuvre des jeux de cartes destinés à faire des tests.
 * @author Robert Aubé
 * @version 1.1 
 */
public class JeuxDeCartes {
    private static final Carte[]quatreAs = {
            new Carte(ValeurCartes.V_AS, CouleurCartes.COEUR),
            new Carte(ValeurCartes.V_AS, CouleurCartes.CARREAU),
            new Carte(ValeurCartes.V_AS, CouleurCartes.TREFLE),
            new Carte(ValeurCartes.V_AS, CouleurCartes.PIQUE),
    };
	
    private static final Carte[]petitJeu1 = {
            new Carte(ValeurCartes.V_3, CouleurCartes.COEUR),
            new Carte(ValeurCartes.V_4, CouleurCartes.COEUR),
            new Carte(ValeurCartes.V_5, CouleurCartes.COEUR),
    };

    private static final Carte[]petitJeu2 = {
            new Carte(ValeurCartes.V_3, CouleurCartes.PIQUE),
            new Carte(ValeurCartes.V_4, CouleurCartes.PIQUE),
            new Carte(ValeurCartes.V_5, CouleurCartes.PIQUE),
    };
    /**
     * Créer un jeu de carte normal
     * @return un jeu de carte normal
     */
    public static PaquetDeCartes getJeuNormal() {
        return new PaquetDeCartes();
    }

    /**
     * Créer un paquet de cartes qui permet de finir rapidement au jeu Aces Up Solitaire
     * pour les tests.
     * @return un jeu de carte truqué pour les tests
     */
    public static PaquetDeCartes getJeuPresqueFini() {
        ArrayList listeCartes = new ArrayList(Arrays.asList(quatreAs));

        listeCartes.addAll(Arrays.asList(petitJeu1));

        return (new PaquetDeCartes(listeCartes));
    }
    /**
     * Créer un paquet de cartes pour les tests et la retourne.
     * @return un jeu de carte truqué pour les tests
     */
    public static PaquetDeCartes getJeuDeCarteTruque() {
        ArrayList listeCartes = new ArrayList(Arrays.asList(quatreAs));


        for (CouleurCartes sorte : CouleurCartes.values()) {
            for (ValeurCartes valeur : ValeurCartes.values()) {
                listeCartes.add(0, new Carte(valeur, sorte));
            }
        }

        return (new PaquetDeCartes(listeCartes));
    }
}
