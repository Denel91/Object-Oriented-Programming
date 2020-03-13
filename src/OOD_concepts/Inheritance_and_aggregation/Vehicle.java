package OOD_concepts.Inheritance_and_aggregation;

public abstract class Vehicle {
    private int weightPounds, horsePower;

    /**
     * CONSTRUCTOR of the Vehicle class with two parameters.
     *
     * @param weightPounds the weight of the vehicle, REQUIRE a valid value and > 0
     * @param horsePower   the power of the engine, REQUIRE a valid value and > 0
     */
    public Vehicle(int weightPounds, int horsePower) {
        this.weightPounds = weightPounds;
        this.horsePower = horsePower;
    }

    public abstract int getMaxWeightPounds();

    /**
     * CALCULATES the speed of a vehicle based on the period of time passed
     * since the vehicle began moving, the vehicle weight, and the engine power.
     *
     * @param timeSec value of time passed;
     * @return the Speed of a Vehicle in MPH.
     */
    protected double getSpeedMph(double timeSec) {
        double v = 2.0 * this.horsePower * 746 * timeSec * 32.17 / getMaxWeightPounds();
        return Math.round(Math.sqrt(v) * 0.68);
    }
}
