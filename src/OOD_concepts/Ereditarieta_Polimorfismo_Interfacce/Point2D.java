package OOD_concepts.Ereditarieta_Polimorfismo_Interfacce;

public class Point2D {
    private int x;
    private int y;

    // Costruttori
    public Point2D() {
    } // Costruttore di default

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Esplicitiamo dei membri get
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // Overriding di toString da Object
    @Override
    public String toString() {
        return "[" + x + " , " + y + "]";
    }
}
