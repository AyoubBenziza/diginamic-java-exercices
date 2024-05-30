package fr.diginamic.props.tests;

import org.junit.Rule;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.rules.TestName;

import static org.junit.Assert.assertEquals;

import java.util.ResourceBundle;

public class TestConfigurationProps {

    private static final ResourceBundle config = ResourceBundle.getBundle("application");

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
    public void getProperties() {
        System.out.println("Valeur de la propriété 'db.url': " + config.getString("db.url"));
        for (String key : config.keySet()) {
            System.out.println(key + " = " + config.getString(key));
        }
        assertEquals("jdbc:mysql://localhost:3306/compta", config.getString("db.url"));
        assertEquals("admin", config.getString("db.user"));
        assertEquals("adminpw", config.getString("db.password"));
    }
}
