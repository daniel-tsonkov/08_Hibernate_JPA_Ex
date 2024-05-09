import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class _04_RichEmployeesFirstName {
    public static void main(String[] args) {
        EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("PU_Name");

        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();

        List<String> resultList = entityManager
                .createQuery("SELECT e.firstName FROM Employee e WHERE e.salary > 50000",
                        String.class)
                .getResultList();

        String join = String.join("\n", resultList);

        System.out.println(join);

        entityManager.getTransaction().commit();

        entityManager.close();
    }
}
