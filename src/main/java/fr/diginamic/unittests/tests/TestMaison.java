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
    public void Maison() {
        Maison maison = new Maison();
        maison.ajouterPiece(new Chambre(1, 10));
        maison.ajouterPiece(new Chambre(1, 20));
        maison.ajouterPiece(new Cuisine(0, 30));
        System.out.println("Surface de la maison: " + maison.calculerSurface());
        System.out.println("Nombre de pièces de la maison: " + maison.nbPieces());
        assertEquals(3, 0.01, maison.nbPieces());
        assertEquals(60.0, 0.01, maison.calculerSurface());
    }

    @Test
    public void MaisonNull() {
        Maison maison = new Maison();
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                maison.ajouterPiece(null)
        );

        String expectedMessage = "La pièce ne peut pas être nulle";
        String actualMessage = exception.getMessage();

        System.err.println("Exception levée: " + actualMessage);
        assertEquals(actualMessage, expectedMessage);
    }
}
