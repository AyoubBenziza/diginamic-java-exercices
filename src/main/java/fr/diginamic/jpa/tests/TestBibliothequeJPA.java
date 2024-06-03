package fr.diginamic.jpa.tests;

import fr.diginamic.jpa.entities.bibliotheque.Book;
import fr.diginamic.jpa.entities.bibliotheque.Loan;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import org.junit.*;
import org.junit.rules.TestName;

public class TestBibliothequeJPA {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("bibliotheque");
    private static final EntityManager em = emf.createEntityManager();

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
        try {
            em.close();
            emf.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        System.out.println("<--- Fin des tests --->");
    }

    @Test
    public void findBookById() {
        Book book = em.find(Book.class, 1);
        Assert.assertEquals("Vingt mille lieues sous les mers", book.getTitle());
        Assert.assertEquals("Jules Verne", book.getAuthor());
    }

    @Test
    public void findBookWithLoans() {
        Book book = em.find(Book.class, 1);
        System.out.println("Emprunteurs du livre '" + book.getTitle() + "' :");
        for (Loan loan : book.getLoans()) {
            System.out.println(loan.getClient().getFirstname() + " " + loan.getClient().getLastname());
        }
        Assert.assertEquals(2, book.getLoans().size());
    }
}
