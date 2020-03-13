package OOD_concepts.Classes;

public class TestVehicle {
    public static void main(String[] args) {
        double timeSec = 10.0;
        int horsePower = 250;
        int vehicleWeight = 4000;
        Engine engine = new Engine();
        engine.setHorsePower(horsePower);

        Vehicle vehicle = new Vehicle(vehicleWeight, engine);
        vehicle = new Car(4, vehicleWeight, engine);

        System.out.println("Vehicle speed (" + timeSec + " sec) = " + vehicle.getSpeedMph(timeSec) + " mph");

        System.out.println("Car speed (" + timeSec + " sec) = " + vehicle.getSpeedMph(timeSec) + " mph");
    }
}
