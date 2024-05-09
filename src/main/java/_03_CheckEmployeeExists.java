import entities.Employee;
import entities.Town;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;
import java.util.Scanner;

public class _03_CheckEmployeeExists {
    public static void main(String[] args) {
        EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("PU_Name");

        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();

        Scanner scanner = new Scanner(System.in);
        String[] searchFor = scanner.nextLine().split(" ");

        Employee result = entityManager
                .createQuery("SELECT e FROM Employee e WHERE e.firstName = :first_name AND e.lastName = :last_name",
                        Employee.class)
                .setParameter("first_name", searchFor[0])
                .setParameter("last_name", searchFor[1])
                .getSingleResult();

        System.out.println(result);

        entityManager.getTransaction().commit();
    }
}
