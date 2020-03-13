package OOD_concepts.InnerClass;

public class Vehicle {
    private int weightPounds;
    private Engine engine;

    public Vehicle(int weightPounds, int horsePower) {
        this.weightPounds = weightPounds;
        this.engine = new Engine(horsePower);
    }

    private int getWeightPounds() {
        return weightPounds;
    }

    public double getSpeedMph(double timeSec) {
        return this.engine.getSpeedMph(timeSec);
    }

    private class Engine {
        private int horsePower;

        private Engine(int horsePower) {
            this.horsePower = horsePower;
        }

        private double getSpeedMph(double timeSec) {
            double v = 2.0 * this.horsePower * 746 * timeSec * 32.174 / getWeightPounds();
            return Math.round(Math.sqrt(v) * 0.68);
        }
    }
}
