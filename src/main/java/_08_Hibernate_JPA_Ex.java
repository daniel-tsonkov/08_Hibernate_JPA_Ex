import entities.Bike;
import entities.Car;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class _08_Hibernate_JPA_Ex {
    public static void main(String[] args) {
        EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("PU_Name");

        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();

        Bike bike = new Bike(21);
        Car car = new Car(5);

        entityManager.persist(bike);
        entityManager.persist(car);

        entityManager.getTransaction().commit();

        entityManager.close();
    }
}
