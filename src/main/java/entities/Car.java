package entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "cars")
public class Car extends Vehicle{
    private static final String CAR_TYPE = "Bike";

    private int doorCount;

    public int getDoorCount() {
        return this.doorCount;
    }

    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }

    public Car(int doorCount) {
        super(CAR_TYPE, price);
        this.doorCount = doorCount;
    }
}
