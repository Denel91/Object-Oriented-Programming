package OOD_concepts.Classes;

public class Vehicle {
    private int weightPounds;
    private Engine engine;

    /**
     * CONSTRUCTOR of the Vehicle class with two parameters.
     *
     * @param weightPounds the weight of the vehicle
     * @param engine       which carries the horsePower value set to 246 using the setHorsePower method.
     */
    public Vehicle(int weightPounds, Engine engine) {
        this.weightPounds = weightPounds;
        this.engine = engine;
    }

    /**
     * CALCULATES the speed of a vehicle based on the period of time passed
     * since the vehicle began moving, the vehicle weight, and the engine power.
     *
     * @param timeSec value of time passed;
     * @return the Speed of a Vehicle in MPH.
     */
    public double getSpeedMph(double timeSec) {
        return this.engine.getSpeedMph(timeSec, weightPounds);
    }
}
