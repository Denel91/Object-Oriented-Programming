package OOD_concepts.Ereditarieta_Polimorfismo_Interfacce;

public class Rectangle implements TwoDShape {
    protected int width;
    protected int height;
    protected Point2D upperleftCoords;

    // Costruttori
    public Rectangle() {
        width = height = 1; // Rettangolo con larghezza e altezza di un'unità
        upperleftCoords = new Point2D(); // posizione di default [0, 0]
    }

    public Rectangle(Point2D upperleftCoords, int width, int height) {
        this.upperleftCoords = upperleftCoords;
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Point2D getUpperleftCoords() {
        return upperleftCoords;
    }

    public int area() {
        return width * height;
    }

    public int perimeter() {
        return 2 * width + 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("DISEGNO IL RETTANGOLO!");
    }

    @Override
    public String toString() {
        return "RETTANGOLO { " + upperleftCoords + " ---> Larghezza: " + width + " , " + "Altezza: " + height + " } ";
    }
}
