package OOD_concepts.InnerClass;

public class RunVehicle {
    public static void main(String[] args) {
        double timeSec = 10.0;
        int engineHorsePower = 190; // FORD Kuga
        int vehicleWeightPounds = 3860; // FORD Kuga

        Vehicle vehicle = new Vehicle(vehicleWeightPounds, engineHorsePower);
        System.out.println("Vehicle speed (" + timeSec + " sec) = " + vehicle.getSpeedMph(timeSec) + " mph");
    }
}
