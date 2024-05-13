import entities.Bike;
import entities.Car;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class _08_Hibernate_JPA_Ex {
    public static void main(String[] args) {
        EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("PU_Name");

        EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();

        Bike bike = new Bike(21);
        Car car = new Car(5);

        EntityManager.persist(bike);
        EntityManager.persist(car);

        entityManager.getTransaction().commit();

        entityManager.close();
    }
}
