package entities;

public abstract class TransportationVehicle extends Vehicle {
    private int loadCapacity;

    public int getLoadCapacity() {
        return this.loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public TransportationVehicle() {

    }

    public TransportationVehicle(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public TransportationVehicle(String type, double price, int loadCapacity) {
        super(type, price);
        this.loadCapacity = loadCapacity;
    }
}
