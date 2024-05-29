package fr.diginamic.unittests.tests;

import fr.diginamic.unittests.enumerations.Saison;

import org.junit.Rule;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.rules.TestName;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class TestSaison {
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
    public void ValueOfLibelle() {
        Saison saison = Saison.valueOfLibelle("Printemps");
        System.out.println(saison);
        assertEquals(Saison.PRINTEMPS, saison);
    }

    @Test
    public void ValueOfLibelleNull() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                Saison.valueOfLibelle(null)
        );
        String expectedMessage = "Le libellé ne peut pas être null ou vide";
        String actualMessage = exception.getMessage();

        System.err.println("Exception levée: " + actualMessage);
        assertEquals(actualMessage, expectedMessage);
    }
}
