package fr.diginamic.props.tests;

import fr.diginamic.props.entities.Fournisseur;
import fr.diginamic.props.dao.jdbc.FournisseurDaoJdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.TestName;

import java.util.List;

public class TestQueriesCompta {

    private static final FournisseurDaoJdbc fournisseurDao = new FournisseurDaoJdbc();

    @Rule
    public TestName name = new TestName();

    private static final Connection connection = fournisseurDao.getConnection();

    @BeforeClass
    public static void init() {
        System.out.println("<--- Initialisation des tests --->");
        System.out.println();
    }

    @Before
    public void initTest() {
        System.out.println("--- Début test " + name.getMethodName() + " ---");
        try {
            connection.setAutoCommit(false);
        } catch (SQLException e) {
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
            fournisseurDao.insert(new Fournisseur(1, "La Maison des Peintures"));
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    @Test
    public void selectAllDataFournisseur() {
        try {
            List<Fournisseur> fournisseurs = fournisseurDao.extraire();
            fournisseurs.forEach(System.out::println);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    @Test
    public void selectDataFournisseur() {
        try {
            Fournisseur fournisseur = fournisseurDao.extraireParNom("FDM SA");
            System.out.println(fournisseur);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    @Test
    public void updateDataFournisseur() {
        try {
            fournisseurDao.update(new Fournisseur(0, "La Maison des Peintures"), "La Maison de la Peinture");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    @Test
    public void deleteDataFournisseur() {
        try {
            fournisseurDao.delete(new Fournisseur(1, "La Maison des Peintures"));
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
