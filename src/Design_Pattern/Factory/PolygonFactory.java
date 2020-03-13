package Design_Pattern.Factory;

public class PolygonFactory {

    public Polygon createPolygon(int numberOfSides) {
        if (numberOfSides == 3) {
            return new Triangle();
        }

        if (numberOfSides == 4) {
            return new Square();
        }

        if (numberOfSides == 5) {
            return new Pentagon();
        }

        if (numberOfSides == 6) {
            return new Hexagon();
        }

        throw new RuntimeException("Unhandled polygon");
    }
}
