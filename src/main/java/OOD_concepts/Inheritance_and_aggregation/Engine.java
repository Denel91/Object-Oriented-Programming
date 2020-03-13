package OOD_concepts.Inheritance_and_aggregation;

public class Engine {
    private int horsePower;

    /**
     * SETS the value of horsePower
     *
     * @param horsePower the new value of horsePower. REQUIRED to have a positive value.
     */
    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getHorsePower() {
        return horsePower;
    }

    /**
     * CALCULATES the speed of a vehicle based on the period of time passed
     * since the vehicle began moving, the vehicle weight, and the engine power.
     *
     * @param timeSec      value of time passed;
     * @param weightPounds the vehicle weight;
     * @return the Speed of a Vehicle in MPH.
     */
    public double getSpeedMph(double timeSec, int weightPounds) {
        double v = 2.0 * this.horsePower * 746 * timeSec * 32.17 / weightPounds;

        return Math.round(Math.sqrt(v) * 0.68);

    }
}
