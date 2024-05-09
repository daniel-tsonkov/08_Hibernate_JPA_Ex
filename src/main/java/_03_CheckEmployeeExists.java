import entities.Town;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class _03_CheckEmployeeExists {
    public static void main(String[] args) {
        EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("PU_Name");

        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();

        //Town town = entityManager.find(Town.class, 1);
        //System.out.println(town);
        Query from_town = entityManager.
                createQuery("SELECT t FROM Town t", Town.class);
        List<Town> resultList = from_town.getResultList();

        for (Town town : resultList) {
            String name = town.getName();

            if (name.length() <= 5) {
                String toUper = name.toUpperCase();
                town.setName(toUper);

                entityManager.persist(town);
            }
        }

        entityManager.getTransaction().commit();
    }
}
