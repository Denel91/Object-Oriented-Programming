package Design_Pattern.Decorator;

public class ClientDecorator {
    public static void main(String[] args) {

        Car sportsCar = new SportsCar(new CarDecorator(new BasicCar()));
        sportsCar.assemble();
        System.out.println("\n*****");

        Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
        sportsLuxuryCar.assemble();
        System.out.println("\n*****");

        Car luxurySportsCar = new LuxuryCar(new SportsCar(new BasicCar()));
        luxurySportsCar.assemble();
    }
}
