package fr.diginamic.jpa.tests;

import fr.diginamic.jpa.entities.recensement.Region;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import org.junit.*;
import org.junit.rules.TestName;

import java.util.List;

public class TestConnectionJPA {

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("recensement");
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
    public void findRegionById() {
        Region region = em.find(Region.class, 1);
        Assert.assertEquals("Occitanie", region.getName());
    }

    @Test
    public void listRegions() {
        List<Region> regions = em.createQuery("SELECT r FROM Region r", Region.class).getResultList();
        for (Region region : regions) {
            System.out.println(region.getName());
        }
        Assert.assertEquals(1, regions.size());
    }

    @Test
    public void insertRegion() {
        EntityTransaction entityTransaction = em.getTransaction();
        entityTransaction.begin();

        Region region = new Region();
        region.setName("Occitanie");
        em.persist(region);

        entityTransaction.commit();
    }

    @Test
    public void updateRegion() {
        EntityTransaction entityTransaction = em.getTransaction();
        entityTransaction.begin();

        Region region = em.find(Region.class, 1);
        region.setName("Occitanie");

        entityTransaction.commit();
    }
}
