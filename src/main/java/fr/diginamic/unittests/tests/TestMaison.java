package fr.diginamic.unittests.tests;

import fr.diginamic.unittests.immobilier.entites.Chambre;
import fr.diginamic.unittests.immobilier.entites.Cuisine;
import fr.diginamic.unittests.immobilier.entites.Maison;

import org.junit.Rule;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.rules.TestName;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class TestMaison {
    @Rule
    public TestName name = new TestName();

    @BeforeClass
    public static void init() {
        System.out.println("<--- Initialisation des tests --->");
        System.out.println();
    }

    @Before
    public void initTest() {
        System.out.println("--- Début test " + name.getMethodName() + " ---");
    }

    @After
    public void endTest() {
        System.out.println("--- Fin test " + name.getMethodName() + " ---");
        System.out.println();
    }

    @AfterClass
    public static void end() {
        System.out.println("<--- Fin des tests --->");
    }

    @Test
    public void MaisonAjouterPiece() {
        Maison maison = new Maison();
        maison.ajouterPiece(new Chambre(1, 10));
        maison.ajouterPiece(new Chambre(1, 20));
        maison.ajouterPiece(new Cuisine(0, 30));
        System.out.println("Nombre de pièces de la maison: " + maison.nbPieces());
        assertEquals(3, 0.01, maison.nbPieces());
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                maison.ajouterPiece(null)
        );

        String expectedMessage = "La pièce ne peut pas être nulle";
        String actualMessage = exception.getMessage();

        System.err.println("Exception levée: " + actualMessage);
        assertEquals(actualMessage, expectedMessage);
    }

    @Test
    public void MaisonCalculerSurface() {
        Maison maison = new Maison();
        maison.ajouterPiece(new Chambre(1, 10));
        maison.ajouterPiece(new Chambre(1, 20));
        maison.ajouterPiece(new Cuisine(0, 30));
        System.out.println("Surface de la maison: " + maison.calculerSurface());
        assertEquals(60.0, 0.01, maison.calculerSurface());
    }

    @Test
    public void MaisonNbPieces() {
        Maison maison = new Maison();
        maison.ajouterPiece(new Chambre(1, 10));
        maison.ajouterPiece(new Chambre(1, 20));
        maison.ajouterPiece(new Cuisine(0, 30));
        System.out.println("Nombre de pièces de la maison: " + maison.nbPieces());
        assertEquals(3, 0.01, maison.nbPieces());
    }

    @Test
    public void MaisonSuperficieEtage() {
        Maison maison = new Maison();
        maison.ajouterPiece(new Chambre(1, 10));
        maison.ajouterPiece(new Chambre(1, 20));
        maison.ajouterPiece(new Cuisine(0, 30));
        System.out.println("Superficie de l'étage 1: " + maison.superficieEtage(1));
        assertEquals(30.0, 0.01, maison.superficieEtage(1));
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                maison.superficieEtage(-1)
        );

        String expectedMessage = "L'étage doit être positif";
        String actualMessage = exception.getMessage();

        System.err.println("Exception levée: " + actualMessage);
        assertEquals(actualMessage, expectedMessage);
    }

    @Test
    public void MaisonSuperficieTypePiece() {
        Maison maison = new Maison();
        maison.ajouterPiece(new Chambre(1, 10));
        maison.ajouterPiece(new Chambre(1, 20));
        maison.ajouterPiece(new Cuisine(0, 30));
        System.out.println("Superficie des chambres: " + maison.superficieTypePiece("Chambre"));
        assertEquals(30.0, 0.01, maison.superficieTypePiece("Chambre"));
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                maison.superficieTypePiece(null)
        );

        String expectedMessage = "Le type de pièce ne peut pas être null ou vide";
        String actualMessage = exception.getMessage();

        System.err.println("Exception levée: " + actualMessage);
        assertEquals(actualMessage, expectedMessage);
    }

    @Test
    public void MaisonGetPieces() {
        Maison maison = new Maison();
        maison.ajouterPiece(new Chambre(1, 10));
        maison.ajouterPiece(new Chambre(1, 20));
        maison.ajouterPiece(new Cuisine(0, 30));
        System.out.println("Pièces de la maison: " + Arrays.toString(maison.getPieces()));
        assertEquals(3, maison.getPieces().length);
    }
}
