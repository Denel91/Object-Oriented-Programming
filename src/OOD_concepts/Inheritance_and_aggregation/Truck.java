package OOD_concepts.Inheritance_and_aggregation;

public class Truck extends Vehicle {
    private int payload;
    private int weightPounds;
    private double horsePower;

    public Truck(int payload, int weightPounds, int horsePower) {
        super(weightPounds, horsePower);
        this.payload = payload;
        this.weightPounds = weightPounds;
        this.horsePower = horsePower;
    }

    public int getPayload() {
        return payload;
    }

    public int getMaxWeightPounds() {
        return weightPounds = this.weightPounds + this.payload;
    }
}
