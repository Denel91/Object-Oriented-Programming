package OOD_concepts.Ereditarieta_Polimorfismo_Interfacce;

public class Inheritance {
    public static void main(String[] args) {
        Square a_square = new Square(new Point2D(22, 10), 10);

        TwoDShape twoDShape;
        Rectangle rectangle_revision = new Rectangle(new Point2D(15, 12), 30, 25);
        // TwoDShape ora è un tipo Rectangle
        twoDShape = rectangle_revision; // Rectangle supporta, è "compatibile" con TwoDShape
        twoDShape.draw();

        Square square_revision = new Square(new Point2D(20, 5), 12);
        // TwoDShape ora è un tipo Square
        twoDShape = square_revision;
        twoDShape.draw();

        System.out.printf("[X = %d Y = %d] --> Area = %d, Perimetro = %d%n",
                a_square.getUpperleftCoords().getX(),
                a_square.getUpperleftCoords().getY(),
                a_square.area(),
                a_square.perimeter());
    }
}
