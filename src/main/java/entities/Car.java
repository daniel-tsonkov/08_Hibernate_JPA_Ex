package entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "cars")
public class Car extends Vehicle{
    private static final String CAR_TYPE = "Car";

    private int doorCount;

    public Car() {
    }

    public Car(int doorCount) {
        super(CAR_TYPE, 2500);
        this.doorCount = doorCount;
    }

    public static String getCarType() {
        return CAR_TYPE;
    }
    public int getDoorCount() {
        return this.doorCount;
    }

    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }
}
