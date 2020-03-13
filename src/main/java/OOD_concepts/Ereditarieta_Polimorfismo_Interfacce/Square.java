package OOD_concepts.Ereditarieta_Polimorfismo_Interfacce;

public class Square extends Rectangle {

    public Square() {
        width = 1;
    }

    /**
     * @param side --> Lato del quadrato
     */
    public Square(Point2D upperleftCoords, int side) {
        super(upperleftCoords, side, side);
    }

    public int getSide() {
        return width;
    }

    @Override
    public void draw() {
        System.out.println("DISEGNO IL QUADRATO!");
    }

    @Override
    public String toString() {
        return "QUADRATO { " + upperleftCoords + " ---> Lato: " + width + " } ";
    }
}
