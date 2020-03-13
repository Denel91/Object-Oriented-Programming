package OOD_concepts.Classes;

public class Car extends Vehicle {
    private int passengersCount;

    public Car(int passengersCount, int weightPounds, Engine engine) {
        super(weightPounds, engine);
        this.passengersCount = passengersCount;
    }

    public int getPassengersCount() {
        return this.passengersCount;
    }
}
