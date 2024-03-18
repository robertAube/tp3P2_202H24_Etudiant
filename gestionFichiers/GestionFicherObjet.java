package gestionFichiers;

import java.io.*;

/**
 * @author Robert Aubé
 * @version 1.0 (Date de création: 2024-03-27)
 */
public class GestionFicherObjet {
    public static char FILE_PATH_SEPARATOR = File.separatorChar;
    /**
     * Répertoire par défaut du jeu. IL FAUT QU'À LA RACINE DU PROJET QUE LE RÉPERTOIRE _fichiers EXISTE
     */
    public static String PATH = System.getProperty("user.dir") + FILE_PATH_SEPARATOR + "_fichiers" + FILE_PATH_SEPARATOR;
    /**
     * Permet de faire l'enregistrement d'objets Serializable.
     *
     * @param nomFichier nom du fichier à sauvegarder
     * @param objet      objet à sauvegarder
     * @throws IOException se déclenche s'il a une erreur dans l'opération d'écriture
     */
    public static void enregistrerObjet(String nomFichier, Object objet) throws IOException {
        // TODO Complétez le code de la méthode : enregistrerObjet(File nomFichier, Object objet)
    }

    /**
     * Permet de récupérer un objet à partir d'un fichier dont le nom est reçu en paramètre.
     *
     * @param nomFichier Nom du fichier à lire
     * @return Objet lu dans le fichier
     * @throws IOException            Se déclenche s'il a une erreur dans l'opération de lecture
     * @throws ClassNotFoundException Levée lorsqu'une application essaie de se charger dans une classe, mais aucune
     *                                définition pour la classe avec le nom spécifié n'a pu être trouvée.
     */
    public static Object lireObjet(String nomFichier) throws IOException, ClassNotFoundException {
        // TODO  Complétez le code de la méthode : Object lireObjet(File nomFichier)
        return null;
    }
}
