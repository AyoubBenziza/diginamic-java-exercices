package fr.diginamic.Exceptions.services;

import java.util.Scanner;

import fr.diginamic.Exceptions.entites.Recensement;

/**
 * Classe représentant un service
 *
 * @author DIGINAMIC
 */
public abstract class MenuService {

    /**
     * Méthode abstraite de traitement que doivent posséder toutes les méthodes de
     * services
     *
     * @param recensement lignes du fichier
     * @param scanner     scanner
     */
    public abstract void traiter(Recensement recensement, Scanner scanner) throws IllegalArgumentException, ArrayIndexOutOfBoundsException, NullPointerException;
}
