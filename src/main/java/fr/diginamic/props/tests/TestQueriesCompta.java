package fr.diginamic.props.tests;

import fr.diginamic.props.entities.Fournisseur;
import fr.diginamic.props.dao.jdbc.FournisseurDaoJdbc;

import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.TestName;

import java.util.List;
import java.util.ResourceBundle;

public class TestQueriesCompta {

    private static final FournisseurDaoJdbc fournisseurDao = new FournisseurDaoJdbc();

    private static final ResourceBundle config = ResourceBundle.getBundle("application");

    @Rule
    public TestName name = new TestName();

    private static Connection connection;

    @BeforeClass
    public static void init() {
        System.out.println("<--- Initialisation des tests --->");
        System.out.println();
    }

    @Before
    public void initTest() {
        System.out.println("--- Début test " + name.getMethodName() + " ---");
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(config.getString("db.url"), config.getString("db.user"),
                    config.getString("db.password"));
            System.out.println("Connexion à la base de données établie !");
            connection.setAutoCommit(false);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    @After
    public void endTest() {
        System.out.println("--- Fin test " + name.getMethodName() + " ---");
        System.out.println();
        try {
            connection.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    @AfterClass
    public static void end() {
        System.out.println("<--- Fin des tests --->");
    }

    @Test
    public void dbConnection() {
        try {
            Statement stat = connection.createStatement();
            stat.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    @Test
    public void insertDataFournisseur() {
        try {
            fournisseurDao.insert(connection, new Fournisseur(1, "La Maison des Peintures"));
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    @Test
    public void selectAllDataFournisseur() {
        try {
            List<Fournisseur> fournisseurs = fournisseurDao.extraire(connection);
            fournisseurs.forEach(System.out::println);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    @Test
    public void selectDataFournisseur() {
        try {
            Fournisseur fournisseur = fournisseurDao.extraireParNom(connection, "FDM SA");
            System.out.println(fournisseur);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    @Test
    public void updateDataFournisseur() {
        try {
            fournisseurDao.update(connection, "La Maison des Peintures", "La Maison de la Peinture");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    @Test
    public void deleteDataFournisseur() {
        try {
            fournisseurDao.delete(connection, new Fournisseur(1, "La Maison des Peintures"));
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
