package entities;

import javax.persistence.*;

@Entity
//@Table(name = "bikes")
@DiscriminatorValue(value = "bike")
public class Bike extends Vehicle{
    private static final String BIKE_TYPE = "Bike";

    private int gearsCount;

    public Bike() {}

    public Bike(int gearsCount) {
        super(BIKE_TYPE, 250);
        this.gearsCount = gearsCount;
    }

    public static String getBikeType() {
        return BIKE_TYPE;
    }

    public int getGearsCount() {
        return this.gearsCount;
    }

    public void setGearsCount(int gearsCount) {
        this.gearsCount = gearsCount;
    }
}
