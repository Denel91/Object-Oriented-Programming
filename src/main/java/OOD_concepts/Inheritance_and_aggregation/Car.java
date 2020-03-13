package OOD_concepts.Inheritance_and_aggregation;

public class Car extends Vehicle {
    private int passengersCount;
    private int weightPounds;
    private double horsePower;

    public Car(int passengersCount, int weightPounds, int horsePower) {
        super(weightPounds, horsePower);
        this.passengersCount = passengersCount;
        this.weightPounds = weightPounds;
        this.horsePower = horsePower;
    }

    public int getPassengersCount() {
        return this.passengersCount;
    }

    public int getMaxWeightPounds() {
        return this.weightPounds + this.passengersCount * 250;
    }
}
