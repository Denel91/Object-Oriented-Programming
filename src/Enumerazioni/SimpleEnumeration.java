package Enumerazioni;

public class SimpleEnumeration {
    public static void main(String[] args) {

        // cardinalPoints è una variabile di tipo CardinalPoints
        // che contiene come valore iniziale CardinalPoints.NORTH
        CardinalPoints cardinalPoints = CardinalPoints.NORTH;

        switch (cardinalPoints) {
            case NORTH:
                System.out.println("NORTH");
                break;
            case NORTH_EAST:
                System.out.println("NORTH_EAST");
                break;
            case EAST:
                System.out.println("EAST");
                break;
            case SOUTH_EAST:
                System.out.println("SOUTH_EAST");
                break;
            case SOUTH:
                System.out.println("SOUTH");
                break;
            case SOUTH_WEST:
                System.out.println("SOUTH_WEST");
                break;
            case WEST:
                System.out.println("WEST");
                break;
            case NORTH_WEST:
                System.out.println("NORTH_WEST");
                break;
        }
    }
}
