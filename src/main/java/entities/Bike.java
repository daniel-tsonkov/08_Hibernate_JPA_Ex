package entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "bikes")
public class Bike extends Vehicle{
    private static final String BIKE_TYPE = "Bike";

    public int getGearsCount() {
        return this.gearsCount;
    }

    public void setGearsCount(int gearsCount) {
        this.gearsCount = gearsCount;
    }

    private int gearsCount;

    public Bike(int i) {
        super(BIKE_TYPE, price);
    }
}
