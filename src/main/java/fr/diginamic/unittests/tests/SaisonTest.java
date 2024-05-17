package fr.diginamic.unittests.tests;

import fr.diginamic.unittests.enumerations.Saison;

import org.junit.*;
import org.junit.rules.TestName;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class SaisonTest {
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
        System.out.println("--- Fin du test " + name.getMethodName() + " ---");
        System.out.println();
    }

    @AfterClass
    public static void end() {
        System.out.println("<--- Fin des tests --->");
    }

    @Test
    public void testValueOfLibelle() {
        Saison saison = Saison.valueOfLibelle("Printemps");
        System.out.println(saison);
        assert saison != null;
        assertEquals(Saison.PRINTEMPS, saison);
    }

    @Test
    public void testValueOfLibelleNull() {
        Saison saison = Saison.valueOfLibelle("Hiver");
        System.out.println(saison);
        assertNull(saison);
    }
}
